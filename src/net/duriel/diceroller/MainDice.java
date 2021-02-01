package net.duriel.diceroller;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainDice {

	public static void main(String[] args) {
		Scanner answer = new Scanner(System.in);

		int faces = 0;
		int result = 0;
		int ans = 0;

		DefaultDice defaultdice = new DefaultDice();

		boolean quit = false;

		try {
			System.out.println("Bienvenue dans l'application Lancer de Dé de Duriel !");
			do {
				System.out.println("Voulez-vous lancer un d� ? 1 = oui et 0 = non, puis Entr�e");
				ans = answer.nextInt();

				if (ans == 0) {System.out.println("L'application va fermer"); quit = true;}
				else if (ans != 0 && ans != 1) {
					System.out.println("Vous n'avez pas tapé sur 0 ou 1, veuillez retenter");
				}
				else if (ans == 1) {
					System.out.println("Quel d� voulez-vous lancer ? Entrez la valeur puis Entrée");
					System.out.println("Vous pouvez choisir un d� pr�d�fini de 6, 10, 20 ou 100 faces");
					System.out.println("Si vous voulez un d� personnalis� veuillez taper la valeur d�sir�e et appuyer sur Entrée");
					System.out.println("Tapez 0 pour �teindre l'application");
					faces = answer.nextInt();
					if (faces == 0) {
						System.out.println("Vous avez choisi 0, l'application va s'éteindre.");
						quit = true;
					}
					if (faces == 6) {
						System.out.println("Vous avez choisi un d� pr�d�fini de 6");
						System.out.println("Lancer le d� ? 1 = oui et 0 = non, puis Entr�e");
						ans = answer.nextInt();
						while (ans == 1) {
							result = defaultdice.Die6();
							System.out.println("Le d� a fait " + result);
							System.out.println("Relancer le d� ?");
							ans = answer.nextInt();}
					}
					if (faces == 10) {
						System.out.println("Vous avez choisi un d� pr�d�fini de 10");
						System.out.println("Lancer le d� ? 1 = oui et 0 = non, puis Entr�e");
						ans = answer.nextInt();
						while (ans == 1) {
							result = defaultdice.Die10();
							System.out.println("Le d� a fait " + result);
							System.out.println("Relancer le d� ?");
							ans = answer.nextInt();}
					}
					if (faces == 20) {
						System.out.println("Vous avez choisi un d� pr�d�fini de 20");
						System.out.println("Lancer le d� ? 1 = oui et 0 = non, puis Entr�e");
						ans = answer.nextInt();
						while (ans == 1) {
							result = defaultdice.Die20();
							System.out.println("Le d� a fait " + result);
							System.out.println("Relancer le d� ?");
							ans = answer.nextInt();}
					}
					if (faces == 100) {
						System.out.println("Vous avez choisi un d� pr�d�fini de 100");
						System.out.println("Lancer le d� ? 1 = oui et 0 = non, puis Entr�e");
						ans = answer.nextInt();
						while (ans == 1) {
							result = defaultdice.Die100();
							System.out.println("Le d� a fait " + result);
							System.out.println("Relancer le d� ?");
							ans = answer.nextInt();}
					}
					if (faces != 6 && faces != 10 && faces != 20 && faces != 100 && faces != 0) {
						System.out.println("Vous avez choisi un d� personnalis� de " + faces + " faces, �tes-vous s�r ?");
						System.out.println("1 = oui et 0 = non, puis Entr�e");
						ans = answer.nextInt();
						if (ans == 1) {
							ChosenDice chosendice = new ChosenDice(faces);
							while (ans == 1) {
								result = chosendice.roll();
								System.out.println("Le d� a fait " + result);
								System.out.println("Relancer le d� ?");
								ans = answer.nextInt();}
						}
					}
				}
			}
			while (quit == false);
		}
		catch(InputMismatchException e) {System.out.println("Vous avez tap� une lettre, l'application va fermer");}
		finally {answer.close();}
	}
}
