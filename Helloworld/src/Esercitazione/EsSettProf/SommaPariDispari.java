package Esercitazione.EsSettProf;

/* 2. Somma dei numeri dispari e pari
Scrivi un programma che calcola la somma separata dei numeri pari e dispari in un intervallo specificato.

Specifiche:
Chiedi all’utente due numeri interi, uno come limite inferiore e uno come limite superiore.
Calcola la somma dei numeri pari e dei numeri dispari nell’intervallo tra i due numeri (inclusi).
Stampa separatamente:
Somma dei pari.
Somma dei dispari.

Requisiti:
Usa un ciclo per scorrere l’intervallo.
Usa if per distinguere numeri pariù
 e dispari.
Usa due variabili separate per accumulare le somme.*/
import java.util.Scanner;

public class SommaPariDispari {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.println("Inserisci il minimo");
		int numeroinferiore = scanner.nextInt();
		System.out.println("inserisci il massimo");

		int numerosuperiore = scanner.nextInt();
		int sommapari = 0;
		int sommadispari = 0;

		for (int i = numeroinferiore; i <= numerosuperiore; i++) {// compreso intervallo fornito dall utente

			if (i % 2 == 0) {
				sommapari += i;

			} else {
				sommadispari += i;

			}

		}
		System.out.println("La somma dei pari è :" + sommapari);
		System.out.println("La somma dei dispari è :" + sommadispari);
	}
}
