package mainpackage;

/*Esercizio n1:

far inserire all'utente un numero intero e stampare la tabellina per quel numero. Ad es: l'utente inserisce 3, stamperà i numeri da 3 a 30.

PS: assicurarsi che il numero inserito sia positivo...

Esercizio n.2

far inserire all'utente un numero intero e verificare quante cifre siano presenti in quel numero. Es: l'utente inserisce il numero 5490, l'output sarà 4
*/
import java.util.Scanner;

public class LoopsEsercizio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner= new Scanner(System.in);
		int numero;
		   
		/*	System.out.println("inserisci un numero positivo");
			 numero =scanner.nextInt();*/
			do { 
				 System.out.println("inserisci un numero intero");
				 numero= scanner.nextInt();
			}
			while(numero<=0);
			  
			 /*while(numero<=0) {
				 System.out.println("inserisci un numero positivo");
				 System.out.println("inserisci un numero intero");
				 numero= scanner.nextInt();
			 }*/
			 
			 for(int i=1;i<=10;i++) {
				 System.out.println(numero*i);
				 
			 }
			
		

	}

}
