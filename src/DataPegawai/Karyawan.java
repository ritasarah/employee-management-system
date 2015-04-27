package DataPegawai;

/**
 *
 * @author Felicia
 */
public class Karyawan {
    private String nama;
    private int nip;
    private String no_hp;
    private String alamat;
    private int id_rate_gaji;
    
    private ShiftKerja hariAvailable;
    
    private int absensi;
    private int presensi;
    
    public Karyawan(String inNama, int inNIP, String inHP, String inAlamat, int inRate, ShiftKerja inHari){
	nama = inNama;
	nip = inNIP;
	no_hp = inHP;
	alamat = inAlamat;
	id_rate_gaji = inRate;
	hariAvailable = inHari;
	absensi = 0;
	presensi = 0;
    }

    public int getAbsensi() {
	return absensi;
    }

    public void setAbsensi(int absensi) {
	this.absensi = absensi;
    }

    public int getPresensi() {
	return presensi;
    }

    public void setPresensi(int presensi) {
	this.presensi = presensi;
    }

    public String getNama() {
        return nama;
    }       
    
    public Karyawan(String inNama, int inNIP, String inHP, String inAlamat, int inRate){
	nama = inNama;
	nip = inNIP;
	no_hp = inHP;
	alamat = inAlamat;
	id_rate_gaji = inRate;
    }


    public void setNama(String nama) {
	this.nama = nama;
    }

    public int getNip() {
	return nip;
    }

    public void setNip(int nip) {
	this.nip = nip;
    }

    public String getNo_hp() {
	return no_hp;
    }

    public void setNo_hp(String no_hp) {
	this.no_hp = no_hp;
    }
    

    public String getAlamat() {
	return alamat;
    }

    public void setAlamat(String alamat) {
	this.alamat = alamat;
    }

    public int getId_rate_gaji() {
	return id_rate_gaji;
    }

    public void setId_rate_gaji(int id_rate_gaji) {
	this.id_rate_gaji = id_rate_gaji;
    }

    public ShiftKerja getHariAvailable() {
	return hariAvailable;
    }

    public void setHariAvailable(ShiftKerja hariAvailable) {
	this.hariAvailable = hariAvailable;
    }

    public String toString(){
	String karString = "Nama : " + nama + "\nNIP : " + nip + "\nHP : " + no_hp + 
		"\nAlamat : " + alamat + "\nID Pekerjaan : " + id_rate_gaji + "\n";
	return karString;
    }
}
