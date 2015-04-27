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
	
	Bulan Moon = new Bulan();
	Moon.countGajiBulanan();
	
	List<Karyawan> A = Moon.getListPegawai();
	for (int i = 0; i < A.size(); i++){
	    A.get(i).toString();
	}
    }
}
