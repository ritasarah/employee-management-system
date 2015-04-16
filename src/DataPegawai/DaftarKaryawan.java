/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DataPegawai;

import java.util.ArrayList;
import java.util.List;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;


/**
 *
 * @author SPM
 */
public class DaftarKaryawan {
    public List<Karyawan> listKaryawan;
    
    public DaftarKaryawan(){
		listKaryawan = new ArrayList();
    }
    
    public void getListKaryawan(){
		String url = "jdbc:mysql://localhost:3306/employee_management";
		String driver = "com.mysql.jdbc.Driver";
		String userName = "root"; 
		String password = "";

		ResultSet res = null;
		Statement st = null;
		try{
			Class.forName(driver).newInstance();
			Connection conn = DriverManager.getConnection(url,userName,password);
			st = conn.createStatement();
			res = st.executeQuery("SELECT * FROM `pegawai`");
			while(res.next()){
				//konstruktur kar String inNama, String inNIP, String inHP, String inAlamat
				listKaryawan.add(new Karyawan (res.getString("nama"), res.getString("nip"), res.getString("no_hp"), res.getString("alamat")));
			}

			checkList();
		}
		catch (SQLException ex){

			System.out.println("SQLException: " + ex.getMessage());
			System.out.println("SQLState: " + ex.getSQLState());
			System.out.println("VendorError: " + ex.getErrorCode());
		}
		catch (Exception ex){
			System.out.println(ex.toString());
		}	
    }
    
    public void checkList(){
		for (int i = 0; i < listKaryawan.size(); i++){
			System.out.println(listKaryawan.get(i).toString());
		}
    }
    
    public Karyawan getKaryawanByID(int ID){
	//TODO
	return new Karyawan ("dummy", "dummy", "dummy", "dummy", new ShiftKerja());
    }
    public void deleteKaryawanByID(int ID){
	//TODO
    }
    public void editKaryawanByID(int ID, Karyawan newData){
	//TODO
	
    }
    
}
