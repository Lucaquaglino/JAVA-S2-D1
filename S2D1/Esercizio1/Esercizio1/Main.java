package Esercizio1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// Creo array di 5 interi con valori casuali tra 1 e 10
		int[] array = new int[5];
		Random random = new Random();
		for (int i = 0; i < 5; i++) {
			array[i] = random.nextInt(10) + 1;
		}

		System.out.println("Array iniziale: " + Arrays.toString(array));

		// Ripeti fino a quando l'utente inserisce 0
		Scanner scanner = new Scanner(System.in);

		while (true) {
			try {
				System.out.print("Inserisci un numero: ");
				int userInput = scanner.nextInt();

				if (userInput == 0) {
					break;
				}

				System.out.print("Inserisci una posizione (0-4): ");
				int position = scanner.nextInt();

				if (position < 0 || position > 4) {
					throw new IllegalArgumentException("Posizione non valida");
				}

				array[position] = userInput;
				System.out.println("Nuovo stato dell'array: " + Arrays.toString(array));
			} catch (IllegalArgumentException e) {
				System.out.println("Errore: " + e.getMessage());
			} catch (Exception e) {
				System.out.println("Errore: input non valido");
				scanner.nextLine();
			}
		}

		System.out.println("Programma terminato.");
		scanner.close();
	}
}
