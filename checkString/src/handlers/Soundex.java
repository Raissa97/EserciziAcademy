package handlers;

public abstract class Soundex extends CheckStringHandler{
	
	/*@Override
	public boolean myCheck(String s1, String s2) {
		//System.out.println(soundex(s1) + "    "+ soundex(s2));
		//System.out.println("distance = "+ EditDistance.edit_distance_dyn(soundex(s1),soundex(s2)));
		return false; //check(soundex(s1),soundex(s2));
	}
	public static String soundex(String s) { 
        char[] x = s.toUpperCase().toCharArray();
        char firstLetter = x[0];

        //Convert letters to numeric code
        for (int i = 0; i < x.length; i++) {
            switch (x[i]) {
            case 'B', 'F', 'P', 'V': 
                x[i] = '1';
                break;
            case 'C', 'G', 'J', 'K', 'Q', 'S', 'X', 'Z': 
                x[i] = '2';
                break;
            case 'D', 'T': 
                x[i] = '3';
                break;
            case 'L': 
                x[i] = '4';
                break;
            case 'M', 'N':
                x[i] = '5';
                break;
            case 'R':
                x[i] = '6';
                break;
            default:
                x[i] = '0';
                break;
            }
        }

        String output = "" + firstLetter;
         
        for (int i = 1; i < x.length; i++) {
            if (x[i] != x[i - 1] && x[i] != '0') {
                output += x[i];
            }
        }
 
        output = output + "";
        return output;
    }

	@Override
	public String toString() {
		return "Soundex";
	}
	*/
	
}
