package com.corso.paesi;

import com.corso.dao.PaeseDAOImpl;

public class PaeseTest {
	public static void main(String[] args) {
	   PaeseDAOImpl<?> dao = new PaeseDAOImpl(); 
	   
	   
	   Paese<?> p  = new Paese();
       p.setCodice("XY");
       p.setNome("IDMlandia");
       
       dao.save(p); 
	   
       p.setNome("Republic of IDM");
	   dao.update(p);
	   
	   Paese<?> p2 = dao.get(p.getCodice());
	   System.out.println("P2 get: "+p2);

	   p2.setNome("IDMlandia");
	   dao.update(p2);
	   
	   Paese p3 = dao.getByNome("IDMlandia");
	   
	   dao.delete(p2);
	   
	}
}
