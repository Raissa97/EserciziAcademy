package com.corso.dao;

import java.util.Collection;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.query.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.corso.paesi.Paese;

//DAO = DataAccesObject, si occupa del dialogo con il db
public class PaeseDAOImpl<T> extends DAO<Paese> implements PaeseDAO{

	@Override
	public void delete(Paese t) {
		super.delete(t);
	}
	
	@Override
	public Collection<String> getNomiPaesi() {
		openCurrentSessionwithTransaction();
		
		String sql = "Select name from paesi";
		Query query = getCurrentSession().createSQLQuery(sql);
		
	    List<String> nomi = query.getResultList();
		
		closeCurrentSessionWithTransaction();
		
		return nomi;
	}

	@Override
	public Paese getByNome(String nome) {
		openCurrentSessionwithTransaction();
		Paese p = null;
	
		String hql = "from Paese where nome=:nome";
		Query q = getCurrentSession().createQuery(hql);
		
		q.setParameter("nome", nome);
		p = (Paese) q.uniqueResult();
		
		closeCurrentSessionWithTransaction();
			
		return p;
	}

	@Override
	public Class<?> getStringClass() {
		return Paese.class;
	}

}
