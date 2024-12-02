package mainpackage;

import java.util.Scanner;

public class Parco
 {
    public static void main(String[] args) {

        // Apertura dello scanner per ricevere input
        Scanner scanner = new Scanner(System.in);

        // Orario di apertura del parco (in minuti)
        int minutiApertura = 720; // 12 ore

        // Variabili per la Montagna Russa
        String attrazione1 = "Montagna Russa";
        int capacitaCorsa1 = 10;
        int costogiro1 = 5;
        int biglietto1 = 15;
        int maxGiri1 = 48;
        int tempoGiro1 = 10;
        int coda1 = 0;
        int clientisi1 = 0;
        int guadagno1 = 0;
        int costoTot1 = 0;

        // Variabili per la Ruota Panoramica
        String attrazione2 = "Ruota Panoramica";
        int capacitaCorsa2 = 5;
        int costogiro2 = 40;
        int biglietto2 = 10;
        int maxGiri2 = 72;
        int tempoGiro2 = 10;
        int coda2 = 0;
        int clientisi2 = 0;
        int guadagno2 = 0;
        int costoTot2 = 0;

        // Variabili per la Casa degli Orrori
        String attrazione3 = "Casa degli Orrori";
        int capacitaCorsa3 = 5;
        int costogiro3 = 30;
        int biglietto3 = 10;
        int maxGiri3 = 72;
        int tempoGiro3 = 10;
        int coda3 = 0;
        int clientisi3 = 0;
        int guadagno3 = 0;
        int costoTot3 = 0;

        // Variabili per il calcolo del guadagno totale e costi
        int guadagnoTotale = 0;
        int costoTotale = 0;
        int clientiSoddisfattiTot = 0;

        // Ciclo per simulare l'apertura del parco (720 minuti)
        for (int minuto = 0; minuto < minutiApertura; minuto++) {
            // Generazione casuale di un cliente con budget e pazienza
            int budget = 10 + (int) (Math.random() * 26);  // Budget casuale tra 10 e 35 euro
            int pazienza = 10 + (int) (Math.random() * 26);  // Pazienza casuale tra 10 e 35 minuti

            // Calcolo tempo attesa per ogni attrazione
            int tempoAttesa1 = (coda1 / capacitaCorsa1) * tempoGiro1;
            int tempoAttesa2 = (coda2 / capacitaCorsa2) * tempoGiro2;
            int tempoAttesa3 = (coda3 / capacitaCorsa3) * tempoGiro3;

            // Determinazione dell'attrazione che il cliente sceglie
            int sceltaAttrazione = -1;
            if (pazienza >= tempoAttesa1 && budget >= biglietto1) {
                sceltaAttrazione = 1; // Montagna Russa
            } else if (pazienza >= tempoAttesa2 && budget >= biglietto2) {
                if (sceltaAttrazione == -1 || coda2 < coda1) {
                    sceltaAttrazione = 2; // Ruota Panoramica
                }
            } else if (pazienza >= tempoAttesa3 && budget >= biglietto3) {
                if (sceltaAttrazione == -1 || (coda3 < coda1 && coda3 < coda2)) {
                    sceltaAttrazione = 3; // Casa degli Orrori
                }
            }

            // Aggiornamento della coda e dei clienti soddisfatti
            if (sceltaAttrazione == 1) {
                coda1++;
                clientisi1++;
            } else if (sceltaAttrazione == 2) {
                coda2++;
                clientisi2++;
            } else if (sceltaAttrazione == 3) {
                coda3++;
                clientisi3++;
            }

            // Gestione dei giri per ogni attrazione (ogni 10 minuti)
            if (minuto % 10 == 0) {
                // Montagna Russa
                if (clientisi1 > 0) {
                    int personePerGiro1 = Math.min(clientisi1, capacitaCorsa1);
                    guadagno1 += personePerGiro1 * biglietto1;
                    costoTot1 += personePerGiro1 * costogiro1;
                    clientisi1 -= personePerGiro1;
                    coda1 -= personePerGiro1;
                }
                // Ruota Panoramica
                if (clientisi2 > 0) {
                    int personePerGiro2 = Math.min(clientisi2, capacitaCorsa2);
                    guadagno2 += personePerGiro2 * biglietto2;
                    costoTot2 += personePerGiro2 * costogiro2;
                    clientisi2 -= personePerGiro2;
                    coda2 -= personePerGiro2;
                }
                // Casa degli Orrori
                if (clientisi3 > 0) {
                    int personePerGiro3 = Math.min(clientisi3, capacitaCorsa3);
                    guadagno3 += personePerGiro3 * biglietto3;
                    costoTot3 += personePerGiro3 * costogiro3;
                    clientisi3 -= personePerGiro3;
                    coda3 -= personePerGiro3;
                }
            }

            // Calcolare il guadagno totale e il costo totale
            guadagnoTotale = guadagno1 + guadagno2 + guadagno3;
            costoTotale = costoTot1 + costoTot2 + costoTot3;
            clientiSoddisfattiTot = clientisi1 + clientisi2 + clientisi3;
        }

        // Stampa finale dei risultati
        System.out.println("Guadagno totale del parco: €" + guadagnoTotale);
        System.out.println("Spese totali del parco: €" + costoTotale);
        System.out.println("Guadagno Montagna Russa: €" + guadagno1);
        System.out.println("Spese Montagna Russa: €" + costoTot1);
        System.out.println("Clienti soddisfatti Montagna Russa: " + clientisi1);
        System.out.println("Guadagno Ruota Panoramica: €" + guadagno2);
        System.out.println("Spese Ruota Panoramica: €" + costoTot2);
        System.out.println("Clienti soddisfatti Ruota Panoramica: " + clientisi2);
        System.out.println("Guadagno Casa degli Orrori: €" + guadagno3);
        System.out.println("Spese Casa degli Orrori: €" + costoTot3);
        System.out.println("Clienti soddisfatti Casa degli Orrori: " + clientisi3);
        System.out.println("Clienti soddisfatti totali: " + clientiSoddisfattiTot);
    }
}

