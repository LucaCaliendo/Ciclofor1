package mainpackage;

import java.util.Scanner;
public class Esercizio3 {

	public static void main(String[] args) {
	


 // Crea un oggetto Scanner per leggere l'input dell'utente
 Scanner scanner = new Scanner(System.in);

	 // Chiedi all'utente di inserire il primo numero 
	   System.out.print("Inserisci il primo numero: ");
	  double numero1 = scanner.nextDouble();

// Chiedi all'utente di inserire il secondo numero (divisore)
	  System.out.print("Inserisci il secondo numero: ");
		        double numero2 = scanner.nextDouble();

		        
		        
	
		        if (numero2 != 0) {
		            double risultato = numero1 / numero2;
		            System.out.println("Il risultato della divisione è: " + risultato);
		        } else {
		            // Se il secondo numero è zero, non si può dividere per zero
		            System.out.println("Errore: Non si può dividere per zero.");
		        }

		        // Chiude lo scanner
		        scanner.close();
		    }
		
	}


