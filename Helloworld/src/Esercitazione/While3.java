package Esercitazione;
/* Trova il massimo tra numeri inseriti dall'utente
Chiedi all'utente di inserire numeri fino a quando non inserisce un numero negativo. 
Alla fine, stampa il numero massimo inserito.*/

import java.util.Scanner;
public class While3 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero, massimo = 0;  // Impostiamo massimo a 0, va bene in questo contesto
        boolean trovatoPositivo = false;  // Flag per verificare se è stato inserito almeno un numero positivo

        System.out.println("Inserisci numeri (termina con un numero negativo):");

        // Primo input fuori dal ciclo
        numero = scanner.nextInt();

        // Ciclo che continua finché l'utente non inserisce un numero negativo
        while (numero >= 0) {
            if (numero > massimo) {
                massimo = numero; // Aggiorna massimo se il numero corrente è maggiore
            }
            trovatoPositivo = true;  // Segna che almeno un numero positivo è stato inserito

            numero = scanner.nextInt();  // Chiede il prossimo numero
        }

        // Stampa il risultato finale
        if (trovatoPositivo) {
            System.out.println("Il massimo è: " + massimo);
        } else {
            System.out.println("Non hai inserito numeri positivi.");
        }

        scanner.close();
    }

}
