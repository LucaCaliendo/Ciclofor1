/*4. Numero perfetto 
Scrivi un programma che verifica se un numero intero positivo è "perfetto".

Specifiche:
Chiedi all’utente un numero intero positivo.
Un numero è perfetto se la somma dei suoi divisori propri (escluso il numero stesso) è uguale al numero stesso.
Esempio: 6 è perfetto perché i suoi divisori propri sono 1, 2 e 3, e 1+2+3 = 6
Stampa "Il numero X è perfetto" o "Il numero X non è perfetto".
Requisiti:
Usa un ciclo per calcolare i divisori del numero.
Usa una variabile per accumulare la somma dei divisori.
Usa un if per confrontare la somma con il numero.*/

package Esercitazione.EsSettProf;

import java.util.Scanner;

public class NumeriPerfetti {
//8 è 2+4=6  10 2+5=7 non perfetti
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sca = new Scanner(System.in);
		System.out.println("inserire un numero intero");
		int numero = sca.nextInt();

		if (numero <= 0) {
			System.out.println("il numero inserito non è positivo");
			return;
		}
		int somma = 0;
		for (int i = 1; i < numero; i++) {
			System.out.println("tutti i numeri: " + i);
			if (numero % i == 0) {
				System.out.println("i numeri divisibile: " + i);
				somma += i; // sommo i divisori per verificare se corrispondono al numero inserito
			}
		}
		System.out.println(somma);
		if (numero == somma) {
			System.out.println("il numero " + numero + " è perfetto");

		} else {
			System.out.println("il numero " + numero + " non è perfetto");
		}
	}

}
