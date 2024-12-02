package mainpackage;
import java.util.Scanner;

public class PianoTariffario {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);

        System.out.println("Seleziona il piano tariffario");
        System.out.println("1. Piano Basic");
        System.out.println("2. Piano Standard");
        System.out.println("3. Piano Premium");
        int pianoScelto = scanner.nextInt();

        // Chiedere il numero di minuti utilizzati nel mese
        System.out.println("Inserisci il numero di minuti utilizzati");
        int minutiUtilizzati = scanner.nextInt();

        int costoFisso = 0;//costo fisso del mensile del piano
       
        int minutiInclusi = 0; //il numero dei minuti inclusi nel piano scelto
        
        double costoExtra = 0.0;  //costo per ogni minuto in piu rispetto ai minuti inclusi del piano
        

        // Calcoliamo il costo e minuti inclusi in base al piano scelto
        if (pianoScelto == 1) {  // Piano Basic
            costoFisso = 10;
            minutiInclusi = 50;
            costoExtra = 0.20;
        } else if (pianoScelto == 2) {  // Piano Standard
            costoFisso = 20;
            minutiInclusi = 150;
            costoExtra = 0.15;
        } else if (pianoScelto == 3) {  // Piano Premium
            costoFisso = 30;
            minutiInclusi = 300;
            costoExtra = 0.10;
        } else {
            System.out.println("Scelta del piano non valida!");
            return;  // Termina il programma se il piano scelto non è valido
        }

        // Calcoliamo il costo totale
        double costoTotale = costoFisso;
        
        if (minutiUtilizzati > minutiInclusi) {
            int minutiExtra = minutiUtilizzati - minutiInclusi;
            costoTotale += minutiExtra * costoExtra;  // Usa costoExtra qui, che è stato inizializzato correttamente
            System.out.println("Costo totale: " + costoTotale + " €. Hai superato i minuti inclusi di " + minutiExtra + " minuti.");
        } else {
            System.out.println("Costo totale: " + costoTotale + " €. Non hai superato i minuti inclusi.");
        }

        // Chiudiamo lo scanner
        scanner.close();
    }
}



