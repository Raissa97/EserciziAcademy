package com.corso.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.corso.algoritmi.Algoritmo;

public class AlgoritmoDAOImpl extends DAO<Algoritmo> implements AlgoritmoDAO {

	@Override
	public Class<?> getStringClass() {
		return Algoritmo.class;
	}
	
}
