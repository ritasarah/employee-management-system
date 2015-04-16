package DataPegawai;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Rita
 */
public class Bulan {

    private int nomor;
    private List<Karyawan> listPegawai;
	
    public Bulan(){
	listPegawai = new ArrayList<>();}
    
    public int getNomor(){
        return nomor;}
    
    public void setNomor(int x){
        nomor=x;}
    
    public List<Karyawan> getListPegawai(){
        return listPegawai;}
    
    public void setListPegawai(List<Karyawan> listk){
        listPegawai = listk;}
	
}
