package Esercitazione.EsercitazioneconF;
//Somma dei numeri da 1 a n

import java.util.Scanner;

public class For2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Sca = new Scanner(System.in);

		System.out.println("inserisci un numero ad n");
		int n = Sca.nextInt();

		int somma = 0;
		for (int i = 0; i <= n; i++) {
			somma += i;
			System.out.println("la somma dei numeri è :" + somma);
		}

	}

}
