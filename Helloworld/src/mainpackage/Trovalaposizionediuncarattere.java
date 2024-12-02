package mainpackage;

/*Trova la posizione di un carattere: scrivi un programma che chieda all’utente 
 * una stringa e un carattere, 
 * e restituisca la posizione della prima occorrenza del carattere.  */
import java.util.Scanner;
public class Trovalaposizionediuncarattere {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sca= new Scanner(System.in);

System.out.println("inserisci una stringa");
String input=sca.next();

System.out.println("inserisci un carattere");
char carattere = sca.next().charAt(0); // legg il primo carattere
System.out.println(input.indexOf(carattere));


	}

}
