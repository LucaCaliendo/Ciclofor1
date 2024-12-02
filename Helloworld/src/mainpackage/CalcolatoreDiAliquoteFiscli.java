package mainpackage;
import java.util.Scanner;
public class CalcolatoreDiAliquoteFiscli {
	

 public static void main(String[] args) {
	 Scanner scanner = new Scanner(System.in);
	// Richiedere il reddito annuale
     System.out.println("Inserisci il tuo reddito annuale:");
     double reddito = scanner.nextDouble();

     // Variabili per calcolare le tasse
     double tasse = 0;
     String fasciaFiscale = "";

     // Calcolo delle tasse in base alle fasce fiscali
     if (reddito <= 15000) {
         // Fascia 1: fino a 15,000 €
         tasse = 0;
         fasciaFiscale = "Fascia 1";
     } else if (reddito <= 30000) {
         // Fascia 2: da 15,001 € a 30,000 €
         tasse = (reddito - 15000) * 0.15;
         fasciaFiscale = "Fascia 2";
     } else if (reddito <= 50000) {
         // Fascia 3: da 30,001 € a 50,000 €
         tasse =  (reddito - 30000) * 0.20;
         fasciaFiscale = "Fascia 3";
     } else  {
         // Fascia 4: oltre 50,000 €
         tasse =(reddito - 50000) * 0.25;
         fasciaFiscale = "Fascia 4";
     }

     // Stampare il risultato
     System.out.println("=== Dettagli del calcolo fiscale ===");
     System.out.println("Reddito annuale: " + reddito + " €");
     System.out.println("Tasse da pagare: " + tasse + " €");
     System.out.println("Rientri nella " + fasciaFiscale + ".");
     // Chiudere lo scanner
     scanner.close();
 }
}


	
		
		
		

