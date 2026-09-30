package Mastermind;

import java.util.Scanner;

public class masterMind {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// begin schrem
		System.out.println("------------------------------------------------------------------------------------------------");
		System.out.println("Welkom in Mastermind 2026!");
		System.out.println("'Zwart' = Goede kleur op de goede plaats");
		System.out.println("'Wit' = Goede kleur verkeerde plaats");
		System.out.println("Je kiest uit de kleuren: Rood, Groen, Geel, Oranje, Paars, Blauw. Let op hoofd leters");
		System.out.println("------------------------------------------------------------------------------------------------");
		System.out.println();
		System.out.println("---- Raad de code en heel veel succes ----");
		System.out.println();

		// secret code
		String[] code = new String[4];
		code[0] = "Paars";
		code[1] = "Rood";
		code[2] = "Blauw";
		code[3] = "Groen";

		// de 4 kleuren van de speler
		String[] vakje = new String[4];

		// 10 rijen
		for (int rij = 1; rij <= 10; rij++) {

			System.out.println("Rij " + rij + " - Vul 4 kleuren in:");

			// 4 kleuren invoeren
			for (int j = 0; j < 4; j++) {
				System.out.println("Vakje"); 
				System.out.println(j + 1);
				vakje[j] = sc.next();
			}

			// 4 kleuren controleren
			for (int j = 0; j < 4; j++) {
				if (vakje[j].equals(code[j])) {
					System.out.println("Zwart");
				} else if (vakje[j].equals(code[0]) || vakje[j].equals(code[1]) || vakje[j].equals(code[2]) || vakje[j].equals(code[3])) {
					System.out.println("Wit");
				} else
					System.out.println("Leeg");
			}
		}

		sc.close();
	}
}