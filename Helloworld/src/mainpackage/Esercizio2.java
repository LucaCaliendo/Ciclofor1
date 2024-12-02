package mainpackage;

import java.util.Scanner;

public class Esercizio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("inserisci il primo numero");
		
		int numero1 = scanner.nextInt();
		
		System.out.println("inserisci il secondo numero");
		
		int numero2 = scanner.nextInt();
		
		
		int differenza=numero1-numero2;
		
		
		 System.out.println("la differenza è:"+ differenza);
		 
		 scanner.close();
	}

}
