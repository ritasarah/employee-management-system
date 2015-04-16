package GUI;

import DataPegawai.*;


/**
 *
 * @author ASUS
 */
public class SI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Jadwal jd = new Jadwal();
		
		jd.initListKaryawan();
		for(ShiftKerja sk: jd.getJadwalKerja()){
			System.out.println(sk.getId());
			System.out.println(sk.getHari());
			System.out.println(sk.getJam());
			System.out.println("jumlah available="+sk.getListKaryawanAvailable().size());
			System.out.println(sk.printListKaryawanAvail());
			System.out.println("------");
			
		}
		
    }
    
}
