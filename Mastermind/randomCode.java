package Mastermind;

import java.util.Random;

public class randomCode {
	
	public static String[] genereerCode(String[] kleuren, int lengte) {
		Random random = new Random();
		String[] codes = new String[lengte];
		 
		for (int i = 0; i<lengte; i++) {
			int willekeurigeCode = random.nextInt(kleuren.length);
			codes[i] = kleuren[willekeurigeCode];
			
		}
		return codes;
	}
}
