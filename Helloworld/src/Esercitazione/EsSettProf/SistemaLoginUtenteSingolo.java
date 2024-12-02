package Esercitazione.EsSettProf;
/* 1. Sistema di login a utente singolo 
Scrivi un programma che simula un sistema di login con un solo utente.

Specifiche:
Predefinisci un username e una password (ad esempio admin e 1234).
Chiedi all’utente di inserire username e password.
Verifica se corrispondono a quelli memorizzati:
Se corretti, stampa "Accesso riuscito".
Se errati, consenti un massimo di 3 tentativi.
Dopo 3 tentativi falliti, stampa "Accesso bloccato".
Requisiti:
Usa variabili per username e password predefiniti.
Usa un ciclo per i tentativi.
Usa if per confrontare le credenziali. */

import java.util.Scanner;

public class SistemaLoginUtenteSingolo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String username = "Admin";
		String password = "1234";
		String u, p;
		Scanner scanner = new Scanner(System.in);

		int tentativi = 0;

		while (tentativi < 3) { // ciclo di tentativi è <=3
			// l'utente puo inserisce di nuovo username e pas
			System.out.println("inserisci username : ");
			u = scanner.next();
			System.out.println("inserisci password");
			p = scanner.next();
			if (u.equals(username) && p.equals(password)) { // Controllo se sono uguali ai predefiniti
				//con u== username controllava le variabili non il contenuto dentro
				System.out.println("Accesso Riuscito");
				break;// se è vero si esce dal ciclo
			} else {
				tentativi++; // incrementa i tentativi
			}

		}
		if (tentativi == 3) {// Abbiamo 3 tentativi altrimenti blocca
			System.out.println("Accesso bloccato");
		}

	}

}
