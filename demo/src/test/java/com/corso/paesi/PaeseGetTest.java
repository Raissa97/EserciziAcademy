package com.corso.paesi;

import com.corso.corrispondenze.Corrispondenza;
import com.corso.dao.CorrispondenzaDAOImpl;
import com.corso.dao.PaeseDAOImpl;

public class PaeseGetTest {
	public static void main(String[] args) {
		   PaeseDAOImpl<?> dao = new PaeseDAOImpl(); 
		   Corrispondenza c = new Corrispondenza();
		   CorrispondenzaDAOImpl cDao = new CorrispondenzaDAOImpl();  
		 
		   
		   Paese p = dao.getByNome("Afghanistan");
		   
		   System.out.println("Paese trovato = "+p);
		   c.setCodiceAlgo("EditDistance2");
		   c.setPaese(p);
		   c.setParolaInserita("Afganista");
		   c.setCorretta(false);
		   
		   System.out.println("corrispondenza = "+c);
		   cDao.save(c);
		  
		}
}
