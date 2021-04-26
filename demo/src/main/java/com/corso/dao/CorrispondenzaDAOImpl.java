package com.corso.dao;

import java.util.ArrayList;
import java.util.Collection;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.corso.corrispondenze.Corrispondenza;
import com.corso.paesi.Paese;


public class CorrispondenzaDAOImpl extends DAO<Corrispondenza> implements CorrispondenzaDAO {

	@Override
	public Collection<Corrispondenza> getAllSinonimi(Corrispondenza c) {
		Paese p = c.getPaese();
		return p.getCorrispondenze();
	}

	@Override
	public void approva(Corrispondenza c) {
		c.setApprovata(true);
		update(c);
	}

	@Override
	public void disapprova(Corrispondenza c) {
		c.setApprovata(false);
		update(c);
	}

	@Override
	public Collection<Corrispondenza> getAllDaApprovare() {
		Collection<Corrispondenza> corrispondenze = super.getAll();
		Collection<Corrispondenza> risultato = new ArrayList();
		for(Corrispondenza c : corrispondenze) {
			if(!c.isApprovata()) {
				risultato.add(c);
			}
		}
		return risultato;
	}

	@Override
	public Class<?> getStringClass() {
		return Corrispondenza.class;
	}

	public boolean isInDB(Corrispondenza c) {
		return getAll().contains(c);
	}


}
