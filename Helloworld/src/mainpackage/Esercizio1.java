package mainpackage;
import java.util.Scanner;
public class Esercizio1 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("inserisci il primo numero");
		
		int num1 = scanner.nextInt();
		
		System.out.println("inserisci il secondo numero");
		
		int num2 = scanner.nextInt();
		
		int somma= num1+num2;
		int differenza=num1-num2;
		
		System.out.println("la somma dei numeri e:"+ somma);
		 System.out.println("la differenza è:"+ differenza);
		scanner.close();
		

	}

}
