package com.corso.corrispondenze;

import com.corso.dao.CorrispondenzaDAOImpl;
import com.corso.dao.PaeseDAOImpl;
import com.corso.paesi.Paese;

public class CorrispondenzeDAOTest {
	public static void main(String[] args) {
	   CorrispondenzaDAOImpl dao = new CorrispondenzaDAOImpl(); 
	   PaeseDAOImpl pDao = new PaeseDAOImpl();
	   
	   Paese p = (Paese) pDao.get("IT");
	   
	   Corrispondenza c  = new Corrispondenza();
       c.setCodiceAlgo("EditDistance1");
       c.setPaese(p);
       c.setParolaInserita("Iitalia");
       c.setCorretta(false);
       
       dao.save(c); 
	   
      /* p.setNome("Republic of IDM");
	   dao.update(p);
	   
	   Paese<?> p2 = dao.get(p.getCodice());
	   System.out.println("P2 get: "+p2);

	   p2.setNome("IDMlandia");
	   dao.update(p2);
	   
	   dao.delete(p2);
	   
	   dao.getSession().close();*/
	}
}
