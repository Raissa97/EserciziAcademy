package test;

import java.util.*;

import context.*;
import handlers.*;

public class Utilizzo {
    
    public static Match analysis(ArrayList<String> dizionario, String daCorreggere) {
    	CheckString ed3 = new EditDistance3(null);
    	CheckString ed2 = new EditDistance2(ed3);
		CheckString ed1 = new EditDistance1(ed2);
		
		CheckString c2 = new IsContained(null);
		CheckString c1 = new Contains(c2);
    
    	ed1.setNext(ed2);
    	ed2.setNext(ed3);
	    Context context1 = new Context(ed1);
	    
	    c1.setNext(c2);
	    Context context2 = new Context(c1);

	    Match m = context1.check(dizionario, daCorreggere);
    	if(m!=null) {
    		return m;
    	} else {
    		return null;
    	}
    	
    }
}