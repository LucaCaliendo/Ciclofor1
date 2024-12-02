package mainpackage;
/* sercizio: Trova la posizione di un elemento specifico
Descrizione: Scrivi un programma che trovi la posizione (indice) di un elemento specifico in un array.

Requisiti:

Dichiarare un array di numeri interi (esempio: {5, 10, 15, 20, 25}).
Richiedere in input un valore da cercare.
Stampare l'indice dell'elemento (o un messaggio se non trovato).

Le risposte a questa e-mail saranno pubblicate come risposta all’annuncio, che sarà visto da tutte le persone del corso.

*/

import java.util.Scanner;
public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int array []= {5,10,15,20,25};
		 
		Scanner scanner=new Scanner(System.in);
		System.out.println("inserisci il valore da cercare  ");
		int valoredatrovare=scanner.nextInt();
		
		 //int i = 0;

        // 
      //  for (int valore : array) {
		
		for(int i=0;i<array.length;i++) {
			
			if(array[i]==valoredatrovare) {
				System.out.println("Il valore " + valoredatrovare + " si trova all'indice " + i);
				return;//esce dal ciclo
				
			}
			
		}
		System.out.println("Il valore " + valoredatrovare + " non è presente nell'array.");
		
	}

}
