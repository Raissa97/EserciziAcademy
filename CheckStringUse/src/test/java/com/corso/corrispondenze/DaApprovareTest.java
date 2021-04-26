package com.corso.corrispondenze;

import java.util.Collection;
import java.util.Set;

import com.corso.corrispondenze.Corrispondenza;
import com.corso.dao.CorrispondenzaDAO;
import com.corso.dao.CorrispondenzaDAOImpl;
import com.corso.dao.DAO;
import com.corso.dao.PaeseDAO;
import com.corso.dao.PaeseDAOImpl;
import com.corso.paesi.Paese;

public class DaApprovareTest {
	public static void main(String[] args) {
		PaeseDAO pDao = new PaeseDAOImpl(); 
	    CorrispondenzaDAO cDao = new CorrispondenzaDAOImpl();
	    DAO dao = (DAO) cDao;
	    Paese p = pDao.get("IT");
		   
		Corrispondenza c  = new Corrispondenza();
        c.setCodiceAlgo("EditDistance1");
        c.setCorretta(false);
        c.setPaese(p);
        c.setParolaInserita("Itaglia");
       
        cDao.save(c); //salvo corrispondenza
        Collection<Corrispondenza> daApprovare = cDao.getAllDaApprovare();

	    System.out.println("..............TEST INCORRETTE............");
       
        dao.delete(c);
        
        String s = "Collection di corrispondenze da approvare = [";
        for(Corrispondenza cor: daApprovare) {
    	    s+=cor.getParolaInserita()+",";
        }
        s+="]";
        System.out.println(s);
	}
}