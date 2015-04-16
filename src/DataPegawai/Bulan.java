/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DataPegawai;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ASUS
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
