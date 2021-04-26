package com.corso.paesi;

import java.io.Serializable;
import java.util.Set;

import com.corso.corrispondenze.Corrispondenza;

/**
 * un BEAN deve avere variabili private, costruttore vuoto e tutti i getter e setter
 * @author rpaga
 *
 */
public class Paese<T> implements Serializable {

	private String codice;
	private String nome;
	private Set<Corrispondenza> corrispondenze;
	
	public String getCodice() {
		return codice;
	}
	public void setCodice(String codice) {
		this.codice = codice;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Set<Corrispondenza> getCorrispondenze() {
		return corrispondenze;
	}
	public void setCorrispondenze(Set<Corrispondenza> corrispondenze) {
		this.corrispondenze = corrispondenze;
	}
	@Override
	public String toString() {
		return "Paese [codice=" + codice + ", nome=" + nome + "]";
	}
	
	
}
