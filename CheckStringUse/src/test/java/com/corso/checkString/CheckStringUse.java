package com.corso.checkString;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.corso.corrispondenze.Corrispondenza;
import com.corso.dao.CorrispondenzaDAOImpl;
import com.corso.dao.PaeseDAOImpl;
import com.corso.paesi.Paese;

import handlers.Match;
import test.Test;

public class CheckStringUse {
	
	static void loadArr(ArrayList<String> array){
		PaeseDAOImpl dao = new PaeseDAOImpl();
		List<Paese> paesi =dao.getAll();
		for(Paese p: paesi) {
			array.add(p.getNome());
		}
	}
	
	public static ArrayList<String> getDB(){
		ArrayList<String> dizionario = new ArrayList();
		loadArr(dizionario);
		return dizionario;
	}
	
	public static Corrispondenza checkString(ArrayList<String> dizionario, String inserita) {
		CorrispondenzaDAOImpl cDao = new CorrispondenzaDAOImpl();
		PaeseDAOImpl pDao = new PaeseDAOImpl();
		
		Match ris = Test.editDistance(dizionario, inserita);
		Corrispondenza c = new Corrispondenza();
		
		if(ris!=null) {
			c.setApprovata(false);
			c.setCorretta(false);
			c.setCodiceAlgo(ris.getAlgoritmo());
			c.setParolaInserita(inserita);
			
			Paese p = pDao.getByNome(ris.getResult());
			c.setPaese(p);
			
			if(!cDao.isInDB(c)) { //controllo se c è già salvata
				cDao.save(c);
				//cDao.delete(c);
			}else {
				c = cDao.get(inserita);
			}
		}
		return c;
	}
	
	public static Collection<String> getSinonimi(ArrayList<String> dizionario, String inserita){
		CorrispondenzaDAOImpl dao = new CorrispondenzaDAOImpl(); 
		Collection<String> res = new ArrayList();
		Corrispondenza c = dao.get(inserita);
		if(c!=null) {
		    Collection<Corrispondenza> cor =  dao.getAllSinonimi(c) ;
		    for(Corrispondenza c2 : cor) {
		    	res.add(c2.getPaese().getNome());
		    }
		}else { //altrimenti inserisco la nuova corrispondenza e poi ritorno i sinonimi
			Corrispondenza nuova = checkString(dizionario,inserita);
			Collection<Corrispondenza> cor = dao.getAllSinonimi(nuova);
		    for(Corrispondenza c2 : cor) {
		    	res.add(c2.getPaese().getNome());
		    }
		}
		
		return res;
	}
	
	public static void main(String[] args) throws IOException {
		ArrayList<String> dizionario = getDB();
		String s = "Franciaa";
		
		System.out.println(checkString(dizionario,s));
		
		System.out.println(getSinonimi(dizionario,s));
	}

}
