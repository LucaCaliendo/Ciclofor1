/*  Esercizio 1: 

Scrivi un programma che chieda all’utente 1)
 una stringa e 2) un carattere da sostituire 3) 
 con un altro carattere. Stampa la stringa risultante. */

package mainpackage;

import java.util.Scanner;

public class SostituireCarattere {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sca = new Scanner(System.in);
		System.out.println("inserisci una stringa");
		String input = sca.nextLine();

		System.out.println("inserisci un carattere da sostituire");

		char caratteredasost = sca.next().charAt(0);

		System.out.println("inserisci un carattere da sostituire");
		char nuovoCarattere = sca.next().charAt(0);
		String stringaRisultante = input.replace(caratteredasost, nuovoCarattere);

		System.out.println("Stringa risultante: " + stringaRisultante);

		sca.close();
	}

}
