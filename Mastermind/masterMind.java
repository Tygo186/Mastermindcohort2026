package Mastermind;

import java.util.Scanner;

public class masterMind {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		start Scherm mastermind
		System.out.println("Welkom in Mastermind 2026!");
		System.out.println("'Zwart' = Goede kleur op de goede plaats");
		System.out.println("'Wit' = Goede kleur verkeerde plaats");
		System.out.println("'Leeg' = Verkeerde kleur");
		System.out.println("Je kiest uit de kleuren: Rood, Groen, Geel, Oranje, Paars, Blauw. Let op hoofd leters!");
		System.out.println("Raad de code en heel veel succes");
	

//		// Kleuren waaruit je kunt kiezen
		String[] kleuren = { "Rood", "Groen", "Geel", "Oranje", "Paars", "Blauw" };

		// Secret code
		String[] codes = { kleuren[1], kleuren[2], kleuren[2], kleuren[5] };
//		vakjes voor input
		String[] vakjes = new String[codes.length];
//		herhalings loop voor je beurten
		for (int rij = 1; rij <= 10; rij++) {

			System.out.println("Rij " + rij + " - Vul 4 kleuren in:");
//			input voor je kleuren
			for (int j = 0; j < vakjes.length; j++) {
				System.out.println("Vakje");
				System.out.println(j + 1);
				vakjes[j] = sc.next();
			}
//			win rule begin zetten
			int zwart = 0;
//			kleuren checker
			for (int j = 0; j < vakjes.length; j++) {
//				zwart als je gelijke kleuren hebt
				if (vakjes[j].equals(codes[j])) {
					System.out.println("Zwart");
					zwart++;
//			        anders wit als het goede kleur is verkeerde plek
				} else {
					boolean wit = false;

					for (int k = 0; k < vakjes.length; k++) {
						if (vakjes[j].equals(codes[k])) {
							wit = true;
						}
					}
					if (wit) {
						System.out.println("Wit");
					} else {
//			        	anders leeg als het niet klopt
						System.out.println("Leeg");
					}
				}
			}
//			als je 4 zwart hebt heb je gewonnen dat word gecontroleerd
			if (zwart == vakjes.length) {
				System.out.println("je hebt gewonnen");
				return;
			}
//			als je tien beurten voorbij zijn heb je verloren
			if (rij == 10)
				System.out.println("je hebt verloren");
		}

		sc.close();
	}
}