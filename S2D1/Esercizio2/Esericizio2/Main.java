package Esericizio2;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		try {

			System.out.print("Inserisci il numero di km percorsi: ");
			int kmPercorsi = Integer.parseInt(scanner.nextLine());

			System.out.print("Inserisci il numero di litri di carburante consumati: ");
			int litriConsumati = Integer.parseInt(scanner.nextLine());

			if (litriConsumati == 0) {
				throw new ArithmeticException("Non è possibile dividere per zero!");
			}
			if (kmPercorsi < 0 || litriConsumati < 0) {
				throw new IllegalArgumentException("Non è possibile inserire numeri negativi!");
			}

			double kmPerLitro = kmPercorsi / litriConsumati;
			System.out.println("Il consumo dell'auto è di: " + kmPerLitro + " km/litro");

		} catch (NumberFormatException e) {
			System.out.println("Input non valido. Assicurati di inserire un numero.");
		} catch (ArithmeticException e) {
			System.out.println("Si è verificato un errore: " + e.getMessage());
			System.out.println("Inserisci nuovamente i dati.");
		} catch (IllegalArgumentException e) {
			System.out.println("Si è verificato un errore: " + e.getMessage());
			System.out.println("Inserisci nuovamente i dati.");
		} finally {
			scanner.close();
		}
	}

}
