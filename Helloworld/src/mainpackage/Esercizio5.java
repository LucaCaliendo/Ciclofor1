package mainpackage;
import java.util.Scanner;
public class Esercizio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner (System.in);
		System.out.println("inserisci la base del rettangolo");
		double base= scanner.nextDouble();
		
		System.out.println("inserisci l'altezza del rettangolo");
		
		double altezza = scanner.nextDouble();
		
		//calcola area
		
		double area= base*altezza;
		
		System.out.println("l'area del rettangolo è :" + area);
		scanner.close();
		
 
	}

}
