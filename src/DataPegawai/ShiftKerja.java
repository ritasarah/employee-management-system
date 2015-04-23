package DataPegawai;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Cilvia
 */
public class ShiftKerja {
	private int id;
    private String jam, hari;
	private List<Integer> listOfKaryawan;
	private List<Integer> listKaryawanAvailable;
	private List<Integer> karyawanCuci, karyawanMasak, karyawanHall, karyawanBartender, karyawanKasir;
	
	
	public ShiftKerja(){
		listOfKaryawan = new ArrayList<>();
		listKaryawanAvailable = new ArrayList<>();
	}
	
	public ShiftKerja(int _id, String j, String h){
		listOfKaryawan = new ArrayList<>();
		listKaryawanAvailable = new ArrayList<>();
		id = _id;
		jam = j;
		hari = h;
	}

	public List<Integer> getListKaryawanAvailable() {
		return listKaryawanAvailable;
	}

	public void setListKaryawanAvailable(List<Integer> listKaryawanAvailable) {
		this.listKaryawanAvailable = listKaryawanAvailable;
	}
	
	
	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}
	
	public List<Integer> getListOfKaryawan(){
		return listOfKaryawan;
	}
	
	public void setListOfKaryawan(List<Integer> listKaryawan){
		listOfKaryawan = listKaryawan;
	}
	
	public void putKaryawan(int org){
		listOfKaryawan.add(org);
	}
	
	public String getJam(){
		return jam;
	}
	
	public String getHari(){
		return hari;
	}
	
	public void setJam(String j){
		jam = j;
	}
	
	public void setHari(String h){
		hari = h;
	}
	
	public void getListKaryawanAvailFromDB(){
		String url = "jdbc:mysql://localhost:3306/employee_management";
		String driver = "com.mysql.jdbc.Driver";
		String userName = "root"; 
		String password = "";
		try{
			Class.forName(driver).newInstance();
			Connection conn = DriverManager.getConnection(url,userName,password);
			Statement st = conn.createStatement();
			ResultSet res = st.executeQuery("Select nip_pegawai from shift_available_pegawai where id_shift = " + id);
			
			while(res.next()){
				listKaryawanAvailable.add(res.getInt("nip_pegawai"));
			}
			conn.close();
		}catch (ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException e) {
		}
	}
	
	// cari irisan dari list karyawan berdasarkan pekerjaan sebagai input (listParent)
	// dengan list karyawan yang available pada shift kerja ini
	public void getIntersectionKaryawan(List<Integer> listParent, String pekerjaan){
		for (Integer karyawan : listParent) {
			if(listKaryawanAvailable.contains(karyawan)) {
				if(pekerjaan.equals("cuci")){
					karyawanCuci.add(karyawan);
				} else if(pekerjaan.equals("masak")){
					karyawanMasak.add(karyawan);
				} else if(pekerjaan.equals("hall")){
					karyawanHall.add(karyawan);
				} else if(pekerjaan.equals("bartender")){
					karyawanBartender.add(karyawan);
				} else { // kasir
					karyawanKasir.add(karyawan);
				}
			}
		}
	}
	
	public void assignShiftKaryawan(int jumlahCuci, int jumlahMasak, int jumlahHall, int jumlahKasir, int jumlahBartender){
		int totalKaryawanShift = jumlahCuci+jumlahMasak+jumlahHall+jumlahKasir+jumlahBartender;
	}
	
	public String printListKaryawanAvail(){
		String result = "";
		for(Integer nip: listKaryawanAvailable){
			result += nip + "\n";
		}
		return result;
	}
	
	
}
