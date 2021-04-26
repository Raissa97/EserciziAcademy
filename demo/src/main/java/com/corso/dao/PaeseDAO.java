package com.corso.dao;

import java.util.Collection;

import com.corso.paesi.Paese;

public interface PaeseDAO {

	Paese get(String codice);
	void update(Paese p);
	void save(Paese p);
	Collection<String> getNomiPaesi();
	public Paese getByNome(String nome);
	Collection<Paese> getAll();
	
}
