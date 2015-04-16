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
	getListKaryawan();
    }
    
    public boolean DKExec(String sqlQuery){
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
	    int resi = st.executeUpdate(sqlQuery);
	    conn.close();
	}
	catch (SQLException ex){
	    
	    System.out.println("SQLException: " + ex.getMessage());
	    System.out.println("SQLState: " + ex.getSQLState());
	    System.out.println("VendorError: " + ex.getErrorCode());
	    
	    return false;
	}
	catch (Exception ex){
	    System.out.println(ex.toString());
	    return false;
	}
	
	return true;
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
		listKaryawan.add(new Karyawan (res.getString("nama"), res.getString("nip"), res.getString("no_hp"), res.getString("alamat"), res.getString("id_rate_gaji")));
	    }
	    conn.close();
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
    
    public Karyawan getKaryawanByID(String ID){
	//TODO
	boolean found = false;
	int index = 0;
	while (!found && index < listKaryawan.size()){
	    if (listKaryawan.get(index).getNip().compareTo(ID) == 0 ){
		found = true;
	    }
	    else {
		index++;
	    }
	}
	if (index < listKaryawan.size()){
	    return listKaryawan.get(index);
	}
	
	return new Karyawan("Empty", "Empty", "Empty", "Empty", "Empty");
    }
    public void deleteKaryawanByID(String ID){
	boolean found = false;
	int index = 0;
	while (!found && index < listKaryawan.size()){
	    if (listKaryawan.get(index).getNip().compareTo(ID) == 0 ){
		found = true;
	    }
	    else {
		index++;
	    }
	}
	if (index < listKaryawan.size()){
	    System.out.println(DKExec("DELETE FROM `shift_available_pegawai` WHERE `nip_pegawai` = " + ID));
	    System.out.println(DKExec("DELETE FROM `karyawan` WHERE `nip` = " + ID));
	    System.out.println(DKExec("DELETE FROM `pegawai` WHERE `nip` = " + ID));
	    
	    getListKaryawan();
	}
	
	
    }
    public void editKaryawanByID(Karyawan newData){
	String ID = newData.getNip();
	boolean found = false;
	int index = 0;
	    
	    //konstruktur kar String inNama, String inNIP, String inHP, String inAlamat
	    System.out.println(DKExec("UPDATE `pegawai` SET `no_hp`= \'" + newData.getNo_hp() +
							"\' , `nama`= \'" + newData.getNama() + 
							"\' , `alamat`= \'" + newData.getAlamat() +
							"\' , `id_rate_gaji`= \'" + newData.getId_rate_gaji() +
				    "\' WHERE `nip` = " + ID));
	    
	    getListKaryawan();
    }
    
    public void addKaryawan(){
	//TODO
    }
    
}
