package Mastermind;

import java.util.Random;

public class RandomCode {
	
	public String[] genereerCode(String[] kleuren, int lengte) {
		Random random = new Random();
		String[] codes = new String[lengte];
		 
		for (int i = 0; i<lengte; i++) {
			int willekeurigeCode = random.nextInt(kleuren.length);
			codes[i] = kleuren[willekeurigeCode];
			
		}
		return codes;
	}
	
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
