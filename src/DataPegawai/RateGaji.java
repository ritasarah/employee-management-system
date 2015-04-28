/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DataPegawai;

/**
 *
 * @author Cilvia
 */
public class RateGaji {
	private int idRate;
	private String pekerjaan;
	private String status;
	private int nominal;

	public RateGaji() {
	}

	public RateGaji(int idRate, String pekerjaan, String status, int nominal) {
		this.idRate = idRate;
		this.pekerjaan = pekerjaan;
		this.status = status;
		this.nominal = nominal;
	}

	public int getIdRate() {
		return idRate;
	}

	public int getNominal() {
		return nominal;
	}

	public String getPekerjaan() {
		return pekerjaan;
	}

	public String getStatus() {
		return status;
	}

	public void setIdRate(int idRate) {
		this.idRate = idRate;
	}

	public void setNominal(int nominal) {
		this.nominal = nominal;
	}

	public void setPekerjaan(String pekerjaan) {
		this.pekerjaan = pekerjaan;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	
}
