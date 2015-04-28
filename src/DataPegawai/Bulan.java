package DataPegawai;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author Rita
 */
public class Bulan {

    private int nomor;
    private List<Karyawan> listPegawai;
    private static String url = "jdbc:mysql://localhost:3306/employee_management";
    private static String driver = "com.mysql.jdbc.Driver";
    private static String userName = "root"; 
    private static String password = "";
	
	
    public Bulan(){
	listPegawai = new ArrayList<>();}
    
    public Bulan(int noBulan){
	setNomor(noBulan);
	listPegawai = new ArrayList<Karyawan>();
	setDaftarKaryawanByBulan();
	System.out.println("Daftar Karyawan of month: " + MonthName() + " updated");
    }
    
    public int getNomor(){
        return nomor;}
    
    public void setNomor(int x){
        nomor=x;}
    
    public List<Karyawan> getListPegawai(){
        return listPegawai;}
    
    public void setListPegawai(List<Karyawan> listk){
        listPegawai = listk;}
    
    public String MonthName(){
	switch (nomor) {
	    case 1:{
		return ("Januari");
	    }
	    case 2:{
		return ("Februari");
	    }
	    case 3:{
		return ("Maret");
	    }
	    case 4:{
		return ("April");
	    }
	    case 5:{
		return ("Mei");
	    }
	    case 6:{
		return ("Juni");
	    }
	    case 7:{
		return ("Juli");
	    }
	    case 8:{
		return ("Agustus");
	    }
	    case 9:{
		return ("September");
	    }
	    case 10:{
		return ("Oktober");
	    }
	    case 11:{
		return ("November");
	    }
	    case 12:{
		return ("Desember");
	    }
	    default:{
		return ("null");
	    }
	}
    }
    
    public void setDaftarKaryawanByBulan(){
	ResultSet res = null;
	Statement st = null;
	listPegawai.clear();
	try{
	    Class.forName(driver).newInstance();
	    Connection conn = DriverManager.getConnection(url,userName,password);
	    st = conn.createStatement();
	    
	    res = st.executeQuery("SELECT * FROM `pegawai` JOIN `data_bulanan` "
		    + "ON (`pegawai`.`nip` = `data_bulanan`.`nip_pegawai`) "
		    + " WHERE (`data_bulanan`.`bulan` = '" + MonthName() + "')");
	    
	    while (res.next()){ //String inNama, int inNIP, String inHP, String inAlamat, int inRate
		Karyawan temp = new Karyawan(res.getString("nama"), res.getInt("nip"), res.getString("no_hp"), res.getString("alamat"), res.getInt("id_rate_gaji"));
		temp.setPresensi(res.getInt("presensi"));
		temp.setAbsensi(res.getInt("absensi"));
		
		listPegawai.add(temp);
		System.out.println(temp.toString());
		
	    }
	    
	} catch (SQLException ex){
	    System.out.println("SQLException: " + ex.getMessage());
	    System.out.println("SQLState: " + ex.getSQLState());
	    System.out.println("VendorError: " + ex.getErrorCode());
	} catch (Exception E){
	    System.out.println(E.toString());
	}
    }
    
    public void countGajiBulanan(){
	
	HashMap<Integer, Integer> tabelGaji = new HashMap<Integer, Integer>();
	HashMap<Integer, Integer> tabelPresensi = new HashMap<Integer, Integer>();
	HashMap<Integer, Integer> tabelAbsensi = new HashMap<Integer, Integer>();
	
	ResultSet res = null;
	Statement st = null;
	try{
	    Class.forName(driver).newInstance();
	    Connection conn = DriverManager.getConnection(url,userName,password);
	    st = conn.createStatement();
	    res = st.executeQuery("SELECT * FROM `pegawai` JOIN `rate_gaji` JOIN `data_bulanan` ON (`pegawai`.`id_rate_gaji` = `rate_gaji`.`id`) AND (`pegawai`.`nip` = `data_bulanan`.`nip_pegawai`) WHERE `bulan` = '" + MonthName() + "'");
	    
	    while (res.next()){
		tabelGaji.put(res.getInt("nip"), res.getInt("nominal"));
		tabelPresensi.put(res.getInt("nip"), res.getInt("presensi"));
		tabelAbsensi.put(res.getInt("nip"), res.getInt("absensi"));
		System.out.printf("1");
	    }
	    System.out.println("\nUpdate Gaji:");
	    for (Karyawan K: listPegawai){
		K.setGajibulanan(tabelGaji.get(K.getNip()) * tabelPresensi.get(K.getNip()));
		K.setPresensi(tabelPresensi.get(K.getNip()));
		K.setAbsensi(tabelAbsensi.get(K.getNip()));
		System.out.println(K.toString());
	    }
	    
	    conn.close();
	    
	    
	}
	catch (SQLException ex){
	    System.out.println("SQLException: " + ex.getMessage());
	    System.out.println("SQLState: " + ex.getSQLState());
	    System.out.println("VendorError: " + ex.getErrorCode());
	} catch (Exception ex){
	    System.out.println(ex.toString());
	}
	
    }
	
}
