package DataPegawai;

/**
 *
 * @author Felicia
 */
public class Karyawan {
    private String nama;
    private String nip;
    private String no_hp;
    private String alamat;
    private ShiftKerja hariAvailable;
    
    public Karyawan(String inNama, String inNIP, String inHP, String inAlamat, ShiftKerja inHari){
	nama = inNama;
	nip = inNIP;
	no_hp = inHP;
	alamat = inAlamat;
	hariAvailable = inHari;
    }
    
    public Karyawan(String inNama, String inNIP, String inHP, String inAlamat){
	nama = inNama;
	nip = inNIP;
	no_hp = inHP;
	alamat = inAlamat;
    }
    @Override
    public String toString(){
	String karString = "Nama : " + nama + "\nNIP : " + nip + "\nHP : " + no_hp + "\nAlamat : " + alamat + "\n";
	return karString;
    }
}
