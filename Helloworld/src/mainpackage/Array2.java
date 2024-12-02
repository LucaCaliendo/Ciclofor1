package mainpackage;

public class Array2 {

    public static void main(String[] args) {
        // Dichiarare l'array di numeri interi
        int[] array = {4, 3, 2, 7, 8, 2, 3, 1};

        // Ciclo per trovare gli elementi duplicati
        System.out.println("Elementi duplicati: ");
        
        // Scorri ogni elemento dell'array
        for (int i = 0; i < array.length; i++) {
            // per identificare se un elemento è duplicato
            boolean isDuplicate = false;

            // Stampa per vedere quale elemento stiamo 
            System.out.println("\nVerifica l'elemento array[" + i + "] = " + array[i]); 

            // Confronta l'elemento corrente con gli altri elementi precedenti
            for (int j = 0; j < i; j++) {
                // Stampa per vedere quale elemento stiamo confrontando
                System.out.println("  Confronta con array[" + j + "] = " + array[j]); 

                // Se troviamo una corrispondenza, segniamo come duplicato
                if (array[i] == array[j]) {
                    isDuplicate = true;
                    System.out.println("  Trovato duplicato: " + array[i] + " uguale a " + array[j]);
                    break; // Uscire dal ciclo interno se è duplicato
                }
            }

            // Se l'elemento è duplicato, stampalo
            if (isDuplicate) {
                System.out.println("  " + array[i] + " è duplicato e lo stampo.");
            } else {
                System.out.println("  " + array[i] + " NON è duplicato.");
            }
        }
    }
}
