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
public class DataBulanan {
    private List<Bulan> listBulan;
	
    public DataBulanan(){
	listBulan = new ArrayList<>();}

    public List<Bulan> getListBulan(){
        return listBulan;}
    
    public void setListBulan(List<Bulan> listk){
        listBulan = listk;}
}
