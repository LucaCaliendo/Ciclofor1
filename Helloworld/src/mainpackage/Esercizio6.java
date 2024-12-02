package mainpackage;
import java.util.Scanner;
public class Esercizio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner = new Scanner (System.in);
System.out.println("inserisci la lunghezza del del quadrato");

double lato= scanner.nextDouble();

double perimetro =4*lato;
System.out.println("il perimetro è :" + perimetro);

scanner.close();

	}

}
