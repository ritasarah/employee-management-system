package DataPegawai;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Cilvia
 */
public class ShiftKerja {
    private String jam, hari;
	private List<Karyawan> listOfKaryawan;
	private List<Karyawan> listKaryawanAvailable;
	
	public ShiftKerja(){
		listOfKaryawan = new ArrayList<>();
		listKaryawanAvailable = new ArrayList<>();
	}
	
	public List<Karyawan> getListOfKaryawan(){
		return listOfKaryawan;
	}
	
	public void setListOfKaryawan(List<Karyawan> listKaryawan){
		listOfKaryawan = listKaryawan;
	}
	
	public void putKaryawan(Karyawan org){
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
	
	
}
