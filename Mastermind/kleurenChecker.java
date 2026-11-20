package Mastermind;

public class kleurenChecker {

	public static String controleerKleur(String invoer, String[] codes, int positie) {

	    if (invoer.equals(codes[positie])) {
	        return "Zwart";
	    }

	    for (int i = 0; i < codes.length; i++) {
	        if (invoer.equals(codes[i])) {
	            return "Wit";
	        }
	    }
	    return "Leeg";
	}
}