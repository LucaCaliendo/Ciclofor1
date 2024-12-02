package mainpackage;

import java.util.Scanner;

public class Array5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Chieda all'utente di inserire un array di 8 numeri interi. Calcoli la somma
		 * degli elementi che si trovano in posizione pari (indice 0, 2, 4, ecc.).
		 * Stampi il risultato.
		 */
		Scanner scanner = new Scanner(System.in);
		int array[] = new int[8];
		int somma = 0;

		System.out.print("Inserisci 8 valori in array: ");

		for (int i = 0; i < array.length; i++) {
			array[i] = scanner.nextInt();  //posizione
		}
		for (int i = 0; i < array.length; i += 2) {
			somma += array[i];   

		}
		// System.out.println("array + (i+1) + " + ":");
		System.out.println("La somma dei valori in posizione pari dell'array è di: " + somma);

	}
}
