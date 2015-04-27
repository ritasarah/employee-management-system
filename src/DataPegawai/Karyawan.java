package DataPegawai;

import java.util.List;

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
    
    private int absensi;
    private int presensi;
    
    private List<ShiftKerja> hariAvailable;
    

    public int getGajibulanan() {
	return gajibulanan;
    }

    public void setGajibulanan(int gajibulanan) {
	this.gajibulanan = gajibulanan;
    }
    
    private int gajibulanan;
    
    public Karyawan(String inNama, int inNIP, String inHP, String inAlamat, int inRate, List<ShiftKerja> inHari){
	nama = inNama;
	nip = inNIP;
	no_hp = inHP;
	alamat = inAlamat;
	id_rate_gaji = inRate;
	hariAvailable = inHari;
	gajibulanan = 0;
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
    
    public Karyawan(String inNama, int inNIP, String inHP, String inAlamat, int inRate){
	nama = inNama;
	nip = inNIP;
	no_hp = inHP;
	alamat = inAlamat;
	id_rate_gaji = inRate;
	gajibulanan = 0;
    }

    public String getNama() {
        return nama;
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

    public List<ShiftKerja> getHariAvailable() {
	return hariAvailable;
    }

    public void setHariAvailable(List<ShiftKerja> hariAvailable) {
	this.hariAvailable = hariAvailable;
    }

    public String toString(){
	String karString = "Nama : " + nama + "\nNIP : " + nip + "\nHP : " + no_hp + 
		"\nAlamat : " + alamat + "\nID Pekerjaan : " + id_rate_gaji + "\nGaji : " + gajibulanan + "\n";
	return karString;
    }
}
