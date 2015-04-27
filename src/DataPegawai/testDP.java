/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DataPegawai;

import java.util.List;

/**
 *
 * @author SPM
 */
public class testDP {
    public static void main (String[] args){
	ShiftKerja shift = new ShiftKerja();
	DaftarKaryawan DK = new DaftarKaryawan();
	Bulan Moon = new Bulan(5);
	Moon.countGajiBulanan();
	
	for (int i = 0; i < Moon.getListPegawai().size(); i++){
	    Moon.getListPegawai().get(i).toString();
	}
    }
}
