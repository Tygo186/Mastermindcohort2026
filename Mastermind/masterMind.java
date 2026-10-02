package Mastermind;

import java.util.Scanner;

public class masterMind {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("------------------------------------------------------------------------------------------------");
		System.out.println("Welkom in Mastermind 2026!");
		System.out.println("'Zwart' = Goede kleur op de goede plaats");
		System.out.println("'Wit' = Goede kleur verkeerde plaats");
		System.out.println("'Leeg' = Verkeerde kleur");
		System.out.println("Je kiest uit de kleuren: Rood, Groen, Geel, Oranje, Paars, Blauw. Let op hoofd leters");
		System.out.println("------------------------------------------------------------------------------------------------");
		System.out.println();
		System.out.println("---- Raad de code en heel veel succes ----");
		System.out.println();

	
		String[] code = new String[4];
		code[0] = "Paars";
		code[1] = "Rood";
		code[2] = "Blauw";
		code[3] = "Groen";

		
		String[] vakje = new String[4];

	
		for (int rij = 1; rij <= 10; rij++) {

			System.out.println("Rij " + rij + " - Vul 4 kleuren in:");

			
			for (int j = 0; j < 4; j++) {
				System.out.println("Vakje"); 
				System.out.println(j + 1);
				vakje[j] = sc.next();
			}

			
			for (int j = 0; j < 4; j++) {

			    if (vakje[j].equals(code[j])) {
			        System.out.println("Zwart");

			    } else {
			        boolean wit = false;

			        for (int k = 0; k < 4; k++) {
			            if (vakje[j].equals(code[k])) {
			                wit = true;
			            }
			        }

			        if (wit) {
			            System.out.println("Wit");
			        } else {
			            System.out.println("Leeg");
			        }
			    }
			}
		
		}
	
	sc.close();
}
}


