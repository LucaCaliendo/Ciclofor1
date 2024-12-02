package Esercitazione.EsercitazioneconF;
//Trova il massimo tra 5 numeri

import java.util.Scanner;

public class For4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numero, max = 0;

		Scanner Scanner = new Scanner(System.in);

//System.out.println("Inserisci un numero");

//numero=Scanner.nextInt();

		for (int i = 1; i <= 5; i++) {
			System.out.println("Inserisci un numero");

			numero = Scanner.nextInt();

			if (numero > max) {
				max = numero;

			}
		}
		System.out.println("Stampare il massimo è  "+ max);
	}

}
