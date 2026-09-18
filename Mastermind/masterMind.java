package Mastermind;

import java.util.Scanner;

public class masterMind {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		 System.out.println("------------------------------------------------------------------------------------------------");
	     System.out.println("Welkom in Mastermind 2026!");
	     System.out.println("'Zwart' = Goede kleur op de goede plaats");
	     System.out.println("'White' = Goede kleur verkeerde plaats");
	     System.out.println("Je kiest uit de kleuren: Rood, Groen, Geel, Oranje, Paars, Blauw");
	     System.out.println("------------------------------------------------------------------------------------------------");
	     System.out.println();
	     System.out.println("---- Raad de code en heel veel succes ----");
	     System.out.println();
		
		String rodePin = "Rood";
		String blauwePin = "Blauw";
		String gelePin = "Geel";
		String groenePin = "Groen";
		String oranjePin = "Oranje";
		String paarsePin = "Paars";
		
		String secretCode = "paarsePin, rodePin, blauwePin, groenePin";
		  
		String zwartePin = "Zwart";
		String wittePin = "Wit";
		String legePin = "Leeg";
		
		System.out.println("Rij 1 - Vakje 1: ");
		String vakje1Rij1 = sc.next();
		System.out.println("Rij 1 - Vakje 2: ");
		String vakje2Rij1 = sc.next();
		System.out.println("Rij 1 - Vakje 3: ");
		String vakje3Rij1 = sc.next();
		System.out.println("Rij 1 - Vakje 4: ");
		String vakje4Rij1 = sc.next();

		System.out.println("Rij 2 - Vakje 1: ");
		String vakje1Rij2 = sc.next();
		System.out.println("Rij 2 - Vakje 2: ");
		String vakje2Rij2 = sc.next();
		System.out.println("Rij 2 - Vakje 3: ");
		String vakje3Rij2 = sc.next();
		System.out.println("Rij 2 - Vakje 4: ");
		String vakje4Rij2 = sc.next();

		System.out.println("Rij 3 - Vakje 1: ");
		String vakje1Rij3 = sc.next();
		System.out.println("Rij 3 - Vakje 2: ");
		String vakje2Rij3 = sc.next();
		System.out.println("Rij 3 - Vakje 3: ");
		String vakje3Rij3 = sc.next();
		System.out.println("Rij 3 - Vakje 4: ");
		String vakje4Rij3 = sc.next();

		System.out.println("Rij 4 - Vakje 1: ");
		String vakje1Rij4 = sc.next();
		System.out.println("Rij 4 - Vakje 2: ");
		String vakje2Rij4 = sc.next();
		System.out.println("Rij 4 - Vakje 3: ");
		String vakje3Rij4 = sc.next();
		System.out.println("Rij 4 - Vakje 4: ");
		String vakje4Rij4 = sc.next();

		System.out.println("Rij 5 - Vakje 1: ");
		String vakje1Rij5 = sc.next();
		System.out.println("Rij 5 - Vakje 2: ");
		String vakje2Rij5 = sc.next();
		System.out.println("Rij 5 - Vakje 3: ");
		String vakje3Rij5 = sc.next();
		System.out.println("Rij 5 - Vakje 4: ");
		String vakje4Rij5 = sc.next();

		System.out.println("Rij 6 - Vakje 1: ");
		String vakje1Rij6 = sc.next();
		System.out.println("Rij 6 - Vakje 2: ");
		String vakje2Rij6 = sc.next();
		System.out.println("Rij 6 - Vakje 3: ");
		String vakje3Rij6 = sc.next();
		System.out.println("Rij 6 - Vakje 4: ");
		String vakje4Rij6 = sc.next();

		System.out.println("Rij 7 - Vakje 1: ");
		String vakje1Rij7 = sc.next();
		System.out.println("Rij 7 - Vakje 2: ");
		String vakje2Rij7 = sc.next();
		System.out.println("Rij 7 - Vakje 3: ");
		String vakje3Rij7 = sc.next();
		System.out.println("Rij 7 - Vakje 4: ");
		String vakje4Rij7 = sc.next();

		System.out.println("Rij 8 - Vakje 1: ");
		String vakje1Rij8 = sc.next();
		System.out.println("Rij 8 - Vakje 2: ");
		String vakje2Rij8 = sc.next();
		System.out.println("Rij 8 - Vakje 3: ");
		String vakje3Rij8 = sc.next();
		System.out.println("Rij 8 - Vakje 4: ");
		String vakje4Rij8 = sc.next();

		System.out.println("Rij 9 - Vakje 1: ");
		String vakje1Rij9 = sc.next();
		System.out.println("Rij 9 - Vakje 2: ");
		String vakje2Rij9 = sc.next();
		System.out.println("Rij 9 - Vakje 3: ");
		String vakje3Rij9 = sc.next();
		System.out.println("Rij 9 - Vakje 4: ");
		String vakje4Rij9 = sc.next();

		System.out.println("Rij 10 - Vakje 1: ");
		String vakje1Rij10 = sc.next();
		System.out.println("Rij 10 - Vakje 2: ");
		String vakje2Rij10 = sc.next();
		System.out.println("Rij 10 - Vakje 3: ");
		String vakje3Rij10 = sc.next();
		System.out.println("Rij 10 - Vakje 4: ");
		String vakje4Rij10 = sc.next();
		
		
		String makervakje1Rij1;
		String makervakje2Rij1;
		String makervakje3Rij1;
		String makervakje4Rij1;
		
		String makervakje1Rij2;
		String makervakje2Rij2;
		String makervakje3Rij2;
		String makervakje4Rij2;
		
		String makervakje1Rij3;
		String makervakje2Rij3;
		String makervakje3Rij3;
		String makervakje4Rij3;
		
		String makervakje1Rij4;
		String makervakje2Rij4;
		String makervakje3Rij4;
		String makervakje4Rij4;
		
		String makervakje1Rij5;
		String makervakje2Rij5;
		String makervakje3Rij5;
		String makervakje4Rij5;
		
		String makervakje1Rij6;
		String makervakje2Rij6;
		String makervakje3Rij6;
		String makervakje4Rij6;
		
		String makervakje1Rij7;
		String makervakje2Rij7;
		String makervakje3Rij7;
		String makervakje4Rij7;
		
		String makervakje1Rij8;
		String makervakje2Rij8;
		String makervakje3Rij8;
		String makervakje4Rij8;
		
		String makervakje1Rij9;
		String makervakje2Rij9;
		String makervakje3Rij9;
		String makervakje4Rij9;
		
		String makervakje1Rij10;
		String makervakje2Rij10;
		String makervakje3Rij10;
		String makervakje4Rij10;
		
		
	
		sc.close();
	}
}
