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
 * @author SPM
 */
public class testDP {
    public static void main (String[] args){
	ShiftKerja shift = new ShiftKerja();
	shift.setId(4);
	shift.setHari("selasa");
	shift.setJam("malam");
	shift.getListKaryawanAvailFromDB();
	
	
	ShiftKerja shift1 = new ShiftKerja();
	shift1.setId(5);
	shift1.setHari("selasa");
	shift1.setJam("malam");
	shift1.getListKaryawanAvailFromDB();
	
	
	ShiftKerja shift2 = new ShiftKerja();
	shift2.setId(6);
	shift2.setHari("selasa");
	shift2.setJam("malam");
	shift2.getListKaryawanAvailFromDB();
	
	List <ShiftKerja> lishift = new ArrayList<ShiftKerja>();
	lishift.add(shift);
	lishift.add(shift1);
	lishift.add(shift2);
	
	
	
//	System.out.println(shift.printListKaryawanAvail());
	Bulan moo = new Bulan(5);
	moo.countGajiBulanan();
	List<Karyawan> lika = moo.getListPegawai();
	for (Karyawan Kar : lika){
	    Kar.editHariAvailable(lishift);
	    System.out.println(Kar.getDaftarJadwal());
	}
    }
}
