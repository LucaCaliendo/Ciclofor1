package Esercitazione.EsercitazioneconF;
//Stampa la tabellina di un numero

import java.util.Scanner;

public class For5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.println("insserisci un numero");
		int numero = scanner.nextInt();

		for (int i = 1; i <= 10; i++) {

			System.out.println(numero + "x" + i + "=" + numero * i);

		}

	}

}
