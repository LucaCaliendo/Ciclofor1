package Esercitazione;

import java.util.Scanner;

//Chiedi all'utente di inserire un numero n e utilizza un ciclo while per calcolare la somma dei numeri da 1 a n.
public class While2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero;
		Scanner scanner = new Scanner(System.in);

		System.out.println("inserisci un numero");

		numero = scanner.nextInt();
		int i = 1, somma = 0;

		while (i <= numero) {
			System.out.println("contatore: " + i);
			somma += i;
			i++;

		}
		System.out.println("la somma è: " + somma);

	}

}
