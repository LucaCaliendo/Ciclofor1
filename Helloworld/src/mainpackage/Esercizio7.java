package mainpackage;
import java.util.Scanner;
public class Esercizio7 {
	
	public static void main (String []args) {

		Scanner scanner = new Scanner (System.in);
		System.out.println("inserisci il primo numero");
		double numero1= scanner.nextDouble();
		
		System.out.println("inserisci il second numero");
		double numero2= scanner.nextDouble();
		
		System.out.println("inserisci il terz numero");
		double numero3= scanner.nextDouble();
		
		double media= (numero1+numero2+numero3)/3;
		
		System.out.println("la media dei numeri è" + media);
		
		scanner.close();
}
	
}