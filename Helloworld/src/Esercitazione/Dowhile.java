package Esercitazione;

import java.util.Scanner;

public class Dowhile {
//che controlla i dati messi in input e validare questi 
//solo se maggiori di 0 e minori di 11
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		int i;

		do {
			System.out.println("inserisci un numero  tra uno e 11");
			i = scanner.nextInt();

		} while (i < 0 || i > 11);
		System.out.println("numero valido " + i);
		scanner.close();

	}

}
