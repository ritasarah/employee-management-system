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
	
	public Jadwal(){
		jadwalKerja = new ArrayList<>();
	}

	public List<ShiftKerja> getJadwalKerja() {
		return jadwalKerja;
	}
	
	
	
	public void generateJadwal(){
		
	}
	
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
			
			while(res.next()){
				jadwalKerja.add(new ShiftKerja(res.getInt("id"), res.getString("jam"), res.getString("hari")));
			}
			conn.close();
		}catch (ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException e) {
		}
	}
}
