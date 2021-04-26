package com.corso.algoritmi;

import java.io.Serializable;

/**
 * un BEAN deve avere variabili private, costruttore vuoto e tutti i getter e setter
 * @author rpaga
 *
 */
public class Algoritmo<T> implements Serializable {

	private String id;
	private String descrizione;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	public String getDescrizione() {
		return descrizione;
	}
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	@Override
	public String toString() {
		return "Algoritmo [id=" + id + ", descrizione=" + descrizione + "]";
	}
	
}
