/* 3. Numeri primi
Scrivi un programma che verifica se un numero è primo.

Specifiche:
Chiedi all’utente un numero intero positivo.
Determina se il numero è primo (un numero è primo se è divisibile solo per 1 e per sé stesso).
Stampa il risultato: "Il numero X è primo" o "Il numero X non è primo".

Requisiti:

Usa un ciclo per verificare i divisori del numero da 2 fino a numero−1.
Usa un if per verificare se esiste un divisore.
Usa una variabile booleana per memorizzare lo stato di "primo" o "non primo".*/

package Esercitazione.EsSettProf;

import java.util.Scanner;

public class NumeriPrimi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sca = new Scanner(System.in);

		System.out.println("inserisci un numero intero positivo");

		int numero = sca.nextInt();

		if (numero <= 0) {
			System.out.println("Stai inserendo un numero non positivo ");

		}

		boolean numeriPrimi = true;

		for (int i = 2; i < numero; i++) { // ciclo per verificare i divisori 2 e -1

			// come sappiamo parte da 2 e finisce a 5 per vedere se un numero è primo o meno

			System.out.println(numero % i + "i: " + i);
			if (numero % i == 0) { // provo a dividere il numero inserito per i suoi precedenti
				// e se ci sono altri numeri ad eccezion di 1 e se stesso non è un numero primo
				// infatti se facciamo 5/2,3,4, il risultato non è esatto perche esce un numero
				// con la virgola
				// System.out.println(numero%i);

				numeriPrimi = false;// se un numero non è divsibile solo per se stesso e per 1 non è un numero primo
				break;// es con 4 appena verifico se è divisibile per 2 esco dal ciclo for

				// 4 non è primo perche è divisibile per 2 ,1,4
				// 5 divisibile solo per 1 e 5 infatti è un numero primo
			}
		}

		if (numero == 1) {
			System.out.println("il numero 1 non è primo perche ha un solo divisiore ");
		} else if (numeriPrimi) {
			System.out.println("Il numero " + numero + " primo ");
		} else {
			System.out.println("Il numero  " + numero + " non è primo ");
		}

	}

}
