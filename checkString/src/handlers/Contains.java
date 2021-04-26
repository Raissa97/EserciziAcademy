package handlers;

public class Contains extends CheckStringHandler{

	public Contains(CheckString next) {
		this.setNext(next);
	}
	
	@Override
	public Match myCheck(String s1, String s2){
		if(s1.contains(s2)) {
			//System.out.println(s1.length() +  "  "+ s2.length());
			return new Match(this.getClass().getSimpleName(),s1);
		}else {
			return null;
		}
	}

}
