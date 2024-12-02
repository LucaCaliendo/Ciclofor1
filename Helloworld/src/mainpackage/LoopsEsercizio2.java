package mainpackage;
import java.util.Scanner;
public class LoopsEsercizio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner= new Scanner(System.in);
		
		System.out.println("inserisci un numero interno");
		
		int contatore=0;
		
		 int numero= scanner.nextInt();
		 
		 
		 System.out.println(numero);
		 
		 
		 while(numero!=0) {
			numero/=10;
			System.out.println("il nuovo numero è " +numero);
			contatore++;
			//System.out.println(contatore);
			
			
		 }
		 
		 
		 System.out.println("il numero inserito è composto da: " + contatore + " cifre");
		 
		 
		 
		
		
		
		

	}

}
