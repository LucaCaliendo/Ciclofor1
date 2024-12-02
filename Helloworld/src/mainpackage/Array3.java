package mainpackage;

import java.util.Scanner;

/* Esercizio n.1: Inverti un array
Scrivi un programma che:

Chieda all'utente di inserire un array di 6 numeri.
Crei un nuovo array che contenga gli elementi in ordine inverso rispetto al primo.
Stampi il nuovo array. */
public class Array3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sca = new Scanner(System.in);
//creareun array con sei posiz per memorizzare i numeri iseriti
		int[] array = new int[6];

	//	creare un altro Array per contenere gli stessi numeri ma in ordine inverso
		int[] reversed = new int[6];

		// Stampa un mexx per chiedere utente di inserirei numeri 
		System.out.println("Inserisci 6 numeri:");
		
		//si fa un ciclo for che parte da 0 fino a 5 
		for (int i = 0; i < array.length; i++) {
			System.out.print("Numero " + (i + 1) + ": ");
			array[i] = sca.nextInt(); //legge il numero inserito dall utente e lo memorizz
		}

		// Inverti l'array
		for (int i = 0; i < array.length; i++) {
			reversed[i] = array[array.length - 1 - i]; 
			//prendere l'elemento da destra (l'ultimo elemento) 
			//e copiarlo nella prima posizione dell'array reversed.
			// Copia in ordine inverso
			
			//reversed [i] memorizza i valori e li mette  in un array reversed[]
			//cioè sara array originale ma in ordine inverso
		}

		// Stampa l'array inverso
		System.out.println("Array inverso:");
		for (int i = 0; i < reversed.length; i++) {
			System.out.print(reversed[i] + " ");
		}
	}

}
