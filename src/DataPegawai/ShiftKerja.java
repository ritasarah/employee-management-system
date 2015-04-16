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
			ResultSet res = st.executeQuery("Select nip_pegawai from posts where id_shift = " + id);
			Karyawan temp = new Karyawan();
			
			while(res.next()){
				listKaryawanAvailable.add(res.getInt("nip_pegawai"));
			}
			conn.close();
		}catch (ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException e) {
		}
	}
	
	
}
