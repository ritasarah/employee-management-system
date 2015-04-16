package DataPegawai;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Rita
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
