package DataPegawai;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Cilvia
 */
public class Jadwal {
    private List<ShiftKerja> jadwalKerja;
	private int minCuci, minMasak, minHall, minBartender, minKasir;
	private List<Integer> karyawanMasak, karyawanCuci, karyawanHall, karyawanBartender, karyawanKasir;
	
	public Jadwal(){
		jadwalKerja = new ArrayList<>();
		karyawanMasak = new ArrayList<>();
		karyawanCuci = new ArrayList<>();
		karyawanHall = new ArrayList<>();
		karyawanBartender = new ArrayList<>();
		karyawanKasir = new ArrayList<>();
	}

	public List<ShiftKerja> getJadwalKerja() {
		return jadwalKerja;
	}
	
	// dilakukan pertama kali
	public void initJumlahKaryawanButuh(){
		String url = "jdbc:mysql://localhost:3306/employee_management";
		String driver = "com.mysql.jdbc.Driver";
		String userName = "root"; 
		String password = "";
		try{
			Class.forName(driver).newInstance();
			Connection conn = DriverManager.getConnection(url,userName,password);
			Statement st = conn.createStatement();
			ResultSet res = st.executeQuery("Select * from system_setting");
			
			if(res.next()){
				minCuci = res.getInt("min_cuci");
				minMasak = res.getInt("min_masak");
				minHall = res.getInt("min_hall"); 
				minBartender = res.getInt("min_bartender"); 
				minKasir = res.getInt("min_kasir");
			}
			conn.close();
		}catch (ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException e) {
		}
	}
	
	// dilakukan setelah initJumlahKaryawanButuh()
	public void initPekerjaanKaryawan(){
		String url = "jdbc:mysql://localhost:3306/employee_management";
		String driver = "com.mysql.jdbc.Driver";
		String userName = "root"; 
		String password = "";
		try{
			Class.forName(driver).newInstance();
			Connection conn = DriverManager.getConnection(url,userName,password);
			Statement st = conn.createStatement();
			ResultSet res = st.executeQuery("Select * from karyawan natural join pegawai");
			
			while(res.next()){
				if(res.getInt("id_rate_gaji") == 21 || res.getInt("id_rate_gaji") == 26){ // cuci
					karyawanCuci.add(res.getInt("nip"));
				} else if(res.getInt("id_rate_gaji") == 22 || res.getInt("id_rate_gaji") == 27){ // masak
					karyawanMasak.add(res.getInt("nip"));
				} else if(res.getInt("id_rate_gaji") == 23 || res.getInt("id_rate_gaji") == 28){ // bartender
					karyawanBartender.add(res.getInt("nip"));
				} else if(res.getInt("id_rate_gaji") == 24 || res.getInt("id_rate_gaji") == 29){ // hall
					karyawanHall.add(res.getInt("nip"));
				} else if(res.getInt("id_rate_gaji") == 25 || res.getInt("id_rate_gaji") == 30){ // kasir
					karyawanKasir.add(res.getInt("nip"));
				}
			}
			conn.close();
		}catch (ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException e) {
		}
	}
	
	// dilakukan setelah initPekerjaanKaryawan
	public void initListKaryawan(){
		String url = "jdbc:mysql://localhost:3306/employee_management";
		String driver = "com.mysql.jdbc.Driver";
		String userName = "root"; 
		String password = "";
		try{
			Class.forName(driver).newInstance();
			Connection conn = DriverManager.getConnection(url,userName,password);
			Statement st = conn.createStatement();
			ResultSet res = st.executeQuery("Select * from shift_kerja");
			
			ShiftKerja sk = null;
			while(res.next()){
				sk = new ShiftKerja(res.getInt("id"), res.getString("jam"), res.getString("hari"));
				sk.getListKaryawanAvailFromDB();
				sk.getIntersectionKaryawan(karyawanCuci, "cuci");
				sk.getIntersectionKaryawan(karyawanMasak, "masak");
				sk.getIntersectionKaryawan(karyawanHall, "hall");
				sk.getIntersectionKaryawan(karyawanBartender, "bartender");
				sk.getIntersectionKaryawan(karyawanKasir, "kasir");
				jadwalKerja.add(sk);
			}
			
			conn.close();
		}catch (ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException e) {
		}
	}
	
	public void generateJadwal(){
		int totalKaryawanShift = minCuci+minMasak+minHall+minKasir+minBartender;
		int i;
		
		for(ShiftKerja sk: jadwalKerja){
			while(sk.getListOfKaryawan().size() < totalKaryawanShift){
				
				i = 0;
				for (Integer karyawan : karyawanCuci) {
					if(sk.getListKaryawanAvailable().contains(karyawan)) {
						sk.putKaryawan(karyawan);
						i++;
					}
				}
				
				
				
		
			}
		}
	}
}
