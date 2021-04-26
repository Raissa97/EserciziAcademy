package com.corso.dao;

import java.util.Collection;

import com.corso.corrispondenze.Corrispondenza;

public interface CorrispondenzaDAO {
	Corrispondenza get(String codice);
	void update(Corrispondenza c);
	void save(Corrispondenza c);
	Collection<Corrispondenza> getAllSinonimi(Corrispondenza c);	
	
	//per correttezza corrispondenze
	void approva(Corrispondenza c);
	void disapprova(Corrispondenza c);
	
	Collection<Corrispondenza> getAllDaApprovare();
}
