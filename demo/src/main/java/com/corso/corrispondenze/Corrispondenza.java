package com.corso.corrispondenze;

import java.io.Serializable;

import com.corso.paesi.Paese;

/**
 * un BEAN deve avere variabili private, costruttore vuoto e tutti i getter e setter
 * @author rpaga
 *
 */
public class Corrispondenza<T> implements Serializable {

	private String parolaInserita;
	private Paese paese;
	private String codiceAlgo;
	private boolean corretta;
	private boolean approvata;
	
	public String getParolaInserita() {
		return parolaInserita;
	}
	public void setParolaInserita(String parolaInserita) {
		this.parolaInserita = parolaInserita;
	}
	
	public Paese getPaese() {
		return paese;
	}
	public void setPaese(Paese paese) {
		this.paese = paese;
	}
	public String getCodiceAlgo() {
		return codiceAlgo;
	}
	public void setCodiceAlgo(String codiceAlgo) {
		this.codiceAlgo = codiceAlgo;
	}
	
	public boolean isCorretta() {
		return corretta;
	}
	public void setCorretta(boolean corretta) {
		this.corretta = corretta;
	}
	public boolean isApprovata() {
		return approvata;
	}
	public void setApprovata(boolean approvata) {
		this.approvata = approvata;
	}
	@Override
	public String toString() {
		return "Corrispondenza [parolaInserita=" + parolaInserita + ", paese=" + paese + ", codiceAlgo=" + codiceAlgo
				+ ", corretta=" + corretta + ", approvata=" + approvata + "]";
	}
	
}
