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
public class Setting {
	List<Integer> jumlahPegawaiPerKerja;
	List<Integer> rateGaji;
	
	public Setting(){
		jumlahPegawaiPerKerja = new ArrayList<>();
		rateGaji = new ArrayList<>();
	}
	
	public List<Integer> getJumlahPegawaiPerKerja(){
		return jumlahPegawaiPerKerja;
	}
	
	public List<Integer> getRateGaji(){
		return rateGaji;
	}
	
	public void getSettingData(){
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
				jumlahPegawaiPerKerja.add(res.getInt("min_cuci"));
				jumlahPegawaiPerKerja.add(res.getInt("min_masak"));
				jumlahPegawaiPerKerja.add(res.getInt("min_hall"));
				jumlahPegawaiPerKerja.add(res.getInt("min_bartender"));
				jumlahPegawaiPerKerja.add(res.getInt("min_kasir"));
			}
			
			res = st.executeQuery("Select * from rate_gaji");
			while(res.next()){
				rateGaji.add(res.getInt("nominal"));
			}
			
			conn.close();
		}catch (ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException e) {
		}
	}
	
	public void setSettingInDB(int minCuci, int minMasak, int minHall, int minBartender, int minKasir){
		String url = "jdbc:mysql://localhost:3306/employee_management";
		String driver = "com.mysql.jdbc.Driver";
		String userName = "root"; 
		String password = "";
		try{
			Class.forName(driver).newInstance();
			Connection conn = DriverManager.getConnection(url,userName,password);
			Statement st = conn.createStatement();
			
			int res = st.executeUpdate("Update system_setting set min_cuci="+minCuci+
					" min_masak="+minMasak+" min_hall="+minHall+" min_bartender="+minBartender+
					" min_kasir="+minKasir+" where id=1");
			conn.close();
		}catch (ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException e) {
		}
	}
	
	public void setRateGajiInDB(List<Integer> rateGaji){
		String url = "jdbc:mysql://localhost:3306/employee_management";
		String driver = "com.mysql.jdbc.Driver";
		String userName = "root"; 
		String password = "";
		try{
			Class.forName(driver).newInstance();
			Connection conn = DriverManager.getConnection(url,userName,password);
			Statement st = conn.createStatement();
			int res;
			for(int i=0;i<rateGaji.size();i++){
				res = st.executeUpdate("Update rate_gaji set nominal="+rateGaji.get(i)+" where id="+(i+20));
			}
			conn.close();
		}catch (ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException e) {
		}
	}
}
