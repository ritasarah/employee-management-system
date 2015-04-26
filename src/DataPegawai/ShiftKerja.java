package DataPegawai;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Cilvia
 */
public class ShiftKerja {
	private int id;
    private String jam, hari;
	// list karyawan yang bekerja pada shift kerja
	private List<Integer> listOfKaryawan; 
	// list karyawan yang available bekerja pada shift kerja
	private List<Integer> listKaryawanAvailable; 
	// list karyawan yang available bekerja pada shift kerja berdasarkan pekerjaan
	private List<Integer> karyawanCuci, karyawanMasak, karyawanHall, karyawanBartender, karyawanKasir; 
	
	
	public ShiftKerja(){
		listOfKaryawan = new ArrayList<>();
		listKaryawanAvailable = new ArrayList<>();
		karyawanCuci = new ArrayList<>();
		karyawanMasak = new ArrayList<>();
		karyawanHall = new ArrayList<>();
		karyawanBartender = new ArrayList<>();
		karyawanKasir = new ArrayList<>();
	}
	
	public ShiftKerja(int _id, String j, String h){
		listOfKaryawan = new ArrayList<>();
		listKaryawanAvailable = new ArrayList<>();
		karyawanCuci = new ArrayList<>();
		karyawanMasak = new ArrayList<>();
		karyawanHall = new ArrayList<>();
		karyawanBartender = new ArrayList<>();
		karyawanKasir = new ArrayList<>();
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
	
	// assign karyawan yang available ke jadwal shift kerja
	// dengan asumsi jumlah karyawan available selalu lebih banyak dari yang dibutuhkan
	// Precondition: sudah dilakukan prosedur getListKaryawanAvailFromDB dan getIntersectionKaryawan
	public void assignShiftKaryawan(int jumlahCuci, int jumlahMasak, int jumlahHall, int jumlahKasir, int jumlahBartender){
//		int totalKaryawanShift = jumlahCuci+jumlahMasak+jumlahHall+jumlahKasir+jumlahBartender;
		Random rand = new Random();
		int index;
		
		System.out.println("jumlahCuci="+jumlahCuci);
		System.out.println("karyawanCuci size="+karyawanCuci.size());
		if (karyawanCuci.size() <= jumlahCuci){ // jika jumlah yang available kurang dari yang dibutuhkan
			for(Integer i: karyawanCuci){
				listOfKaryawan.add(i);
			}
		} else {
			for(int i=0;i<jumlahCuci;i++){
				do{
					index = rand.nextInt() % karyawanCuci.size();
				} while(index < 0);
				System.out.println(index);
				listOfKaryawan.add(karyawanCuci.remove(index));
			}
		}
		
		System.out.println("jumlahMasak="+jumlahMasak);
		System.out.println("karyawanMasak size="+karyawanMasak.size());
		if (karyawanMasak.size() <= jumlahMasak){ // jika jumlah yang available kurang dari yang dibutuhkan
			for(Integer i: karyawanMasak){
				listOfKaryawan.add(i);
			}
		} else {
			for(int i=0;i<jumlahMasak;i++){
				do{
					index = rand.nextInt() % karyawanMasak.size();
				} while(index < 0);
				System.out.println(index);
				listOfKaryawan.add(karyawanMasak.remove(index));
			}
		}
		
		System.out.println("jumlahHall="+jumlahHall);
		System.out.println("karyawanHall size="+karyawanHall.size());
		if (karyawanHall.size() <= jumlahHall){ // jika jumlah yang available kurang dari yang dibutuhkan
			for(Integer i: karyawanHall){
				listOfKaryawan.add(i);
			}
		} else {
			for(int i=0;i<jumlahHall;i++){
				do{
					index = rand.nextInt() % karyawanHall.size();
				} while(index < 0);
				System.out.println(index);
				listOfKaryawan.add(karyawanHall.remove(index));
			}
		}
		
		System.out.println("jumlahKasir="+jumlahKasir);
		System.out.println("karyawanKasir size="+karyawanKasir.size());
		if (karyawanKasir.size() <= jumlahKasir){ // jika jumlah yang available kurang dari yang dibutuhkan
			for(Integer i: karyawanKasir){
				listOfKaryawan.add(i);
			}
		} else {
			for(int i=0;i<jumlahKasir;i++){
				do{
					index = rand.nextInt() % karyawanKasir.size();
				} while(index < 0);
				System.out.println(index);
				listOfKaryawan.add(karyawanKasir.remove(index));
			}
		}
		
		System.out.println("jumlahBartender="+jumlahBartender);
		System.out.println("karyawanBartender size="+karyawanBartender.size());
		if (karyawanBartender.size() <= jumlahBartender){ // jika jumlah yang available kurang dari yang dibutuhkan
			for(Integer i: karyawanBartender){
				listOfKaryawan.add(i);
			}
		} else {
			for(int i=0;i<jumlahBartender;i++){
				do{
					index = rand.nextInt() % karyawanBartender.size();
				} while(index < 0);
				System.out.println(index);
				listOfKaryawan.add(karyawanBartender.remove(index));
			}
		}
	}
	
	public String printListKaryawanAvail(){
		String result = "";
		for(Integer nip: listKaryawanAvailable){
			result += nip + "\n";
		}
		return result;
	}
	
	
}
