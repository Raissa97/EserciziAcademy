package com.corso.corrispondenze;

import java.util.Collection;

import com.corso.dao.CorrispondenzaDAOImpl;

public class SinonimiTest {
	public static void main(String[] args) {
		CorrispondenzaDAOImpl dao = new CorrispondenzaDAOImpl(); 
	   
	    Corrispondenza c  = dao.get("Iitalia");
	    
	    Collection<Corrispondenza> cor = dao.getAllSinonimi(c) ;
	    
	    String r = " sinonimi di "+c.getParolaInserita()+" = ";
	    for(Corrispondenza c2: cor) {
	    	r+=c2.getParolaInserita()+" ";
	    }
	    System.out.println(r);
	    
	}
}
