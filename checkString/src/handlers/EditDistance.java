package handlers;

public class EditDistance extends CheckStringHandler{
	
	private int sogliaMax;
	
	@Override
	public Match myCheck(String s1, String s2) {
		//System.out.println("distance = "+edit_distance_dyn(s1,s2));
		return edit_distance_dyn(s1,s2);
	}
	
	/**
	  * method edit_distance_dyn: dynamic and iterative
	  * @param s1: the "correct" string
	  * @param s2: the string which has to be compared with
	  * the first one.
	  * The method creates a matrix and compares the characters of s1
	  * with those of s2.
	  * @return: the value in the angle of the matrix which is the
	  * edit distance between s1 and s2.
	  * This method is faster than the recursive one.
	  */
	  public Match edit_distance_dyn(String s1, String s2){
		int[][] m = new int[s1.length()+1][s2.length()+1];
		int j = 0;
		int i = 0;
		m[0][0] = 0;
		if(j == 0){
		  for(int b = 1; b <= s1.length(); b++){
		    m[b][0] = b;
		  }
		}
		if(i == 0){
		  for(int a = 1; a <= s2.length(); a++){
		    m[0][a] = a;
		  }
		}
		for(j = 1; j < s2.length()+1; j++){
		  for(i = 1; i < s1.length()+1; i++){
		    if(s1.charAt(i-1) == s2.charAt(j-1)){
			  m[i][j] = m[i-1][j-1];
			} else{
			  m[i][j] = Math.min(m[i-1][j], m[i][j-1])+1;
			}
		  }
		} 
		if(m[s1.length()][s2.length()]<=this.sogliaMax) {
			//.out.println(s1);
			return new Match(this.getClass().getSimpleName(),s1);
		}else {
			return null;
		}
	  }
	  
	
	public void setSogliaMax(int max) {
		this.sogliaMax=max;
	}
	  
	@Override
	public String toString() {
		return "EditDistance1";
	}


}
