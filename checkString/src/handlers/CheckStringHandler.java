package handlers;

import java.util.ArrayList;

public abstract class CheckStringHandler implements CheckString {

	private CheckString next;
	
	public void setNext(CheckString handler) {
		this.next=handler;
	}

	@Override
	public Match check(ArrayList<String> dizionario, String stringaDaTrovare) {
		/*PaeseDAO pDao = new PaeseDAO();
		
		Corrispondenza cor = new Corrispondenza();
		CorrispondenzaDAO dao = new CorrispondenzaDAO();
		*/
		Match ret=null;
		for(int i=0; i<dizionario.size();i++) {
			if(myCheck(dizionario.get(i),stringaDaTrovare)!=null) {
				System.out.println("Soluzione TROVATA per '" +stringaDaTrovare+ "' con: "+this.getClass().getSimpleName());
				/* salvare la nuova corrispondenza nel DB
				if(true){ //parolaCercata not in table corrispondenza
					cor.setNumCercata(1);
					cor.setParolaInserita(stringaDaTrovare);
					cor.setCodiceAlgo(getClass().getSimpleName());
					
					System.out.println("parola del dizionario = "+dizionario.get(i));
					Paese p = pDao.getByNome(dizionario.get(i));
					
					System.out.println("paese trovato = "+p);
					cor.setPaese(p);
					
					System.out.println("corrispondenza = "+cor);
					dao.save(cor);
				}else {
					dao.get(stringaDaTrovare);
					cor.setNumCercata(cor.getNumCercata()+1);
					dao.update(cor);
				}*/
				//Match ris = new Match(null,dizionario.get(i));
				return myCheck(dizionario.get(i),stringaDaTrovare);
			}
		}
		System.out.println("Soluzione NON trovata per '" +stringaDaTrovare+ "' con: "+this.getClass().getSimpleName());
		if(next != null) {
			ret = next.check(dizionario,stringaDaTrovare);
		} else {
			System.out.println("Problema senza soluzione per '" +stringaDaTrovare+ "': ultimo passo = "+this.getClass().getSimpleName());
			//gestire
			ret = null;
		}
		
		return ret;
		
	}
	
	public abstract Match myCheck(String s1, String s2);
}
