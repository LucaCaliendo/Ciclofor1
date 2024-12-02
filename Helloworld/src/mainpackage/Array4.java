package mainpackage;

import java.util.Scanner;

public class Array4 {

    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int[][] matrice = new int[3][3]; //matrice bidimensionale
        //3 righe e 3 colonne  /i per riga e j per colnna

        System.out.println("Inserisci i valori di una matrice 3x3:");

        // Acquisizione dei valori dall'utente
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
           
                System.out.print("Valore per matrice[" + i + "][" + j + "]: ");
                matrice[i][j] = sca.nextInt();
                // matrice[i][j]  specifica la posizione cioè la 
                //cella della prima riga e della prima colonna
            }
        }

        // Stampa della matrice in formato tabellare
     
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
            	System.out.print(matrice[i][j] + " ");
            }
         
            System.out.println(); // Vai a capo alla fine di ogni riga
        } 
/* i= 0 → la prima riga: Ciclo interno: stampa 1, 2, 3
Dopo aver stampato tutta la prima riga con  System.out.println() va a capo.
Iterazione del ciclo esterno (seconda riga):

i = 1 →  stampa 4, 5, 6
Dopo aver stampato tutta la seconda riga, System.out.println() va a capo.
Iterazione del ciclo esterno (terza riga):

i = 2 →  (i valori sono 7, 8, 9)
Ciclo interno: stampa 7, 8, 9
Dopo aver stampato tutta la terza riga, il ciclo esterno termina.     */
        sca.close();
    }
}

