package handlers;

import java.util.ArrayList;

public class IsContained extends CheckStringHandler{
	
	public IsContained(CheckString next) {
		this.setNext(next);
	}

	@Override
	public Match myCheck(String s1, String s2){
		
		if(s2.contains(s1)) {
			//System.out.println(s1.length() +  "  "+ s2.length());
			return new Match(this.getClass().getSimpleName(),s1);
		}else {
			return null;
		}
	}

}
