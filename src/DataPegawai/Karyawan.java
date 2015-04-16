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
    private String id_rate_gaji;
    
    private ShiftKerja hariAvailable;
    
    public Karyawan(String inNama, String inNIP, String inHP, String inAlamat, String inRate, ShiftKerja inHari){
	nama = inNama;
	nip = inNIP;
	no_hp = inHP;
	alamat = inAlamat;
	id_rate_gaji = inRate;
	hariAvailable = inHari;
    }
    
    public Karyawan(String inNama, String inNIP, String inHP, String inAlamat, String inRate){
	nama = inNama;
	nip = inNIP;
	no_hp = inHP;
	alamat = inAlamat;
	id_rate_gaji = inRate;
    }

    public String getNama() {
	return nama;
    }

    public void setNama(String nama) {
	this.nama = nama;
    }

    public String getNip() {
	return nip;
    }

    public void setNip(String nip) {
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

    public String getId_rate_gaji() {
	return id_rate_gaji;
    }

    public void setId_rate_gaji(String id_rate_gaji) {
	this.id_rate_gaji = id_rate_gaji;
    }

    public ShiftKerja getHariAvailable() {
	return hariAvailable;
    }

    public void setHariAvailable(ShiftKerja hariAvailable) {
	this.hariAvailable = hariAvailable;
    }

    
    @Override
    public String toString(){
	String karString = "Nama : " + nama + "\nNIP : " + nip + "\nHP : " + no_hp + "\nAlamat : " + alamat + "\nID Pekerjaan : " + id_rate_gaji + "\n";
	return karString;
    }
}
