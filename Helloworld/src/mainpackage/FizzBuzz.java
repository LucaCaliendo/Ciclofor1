/*Ecco un tipico esercizio per neo programmatori: FizzBuzz.


//Ciclare tutti i numeri da 1 a 50, e stampare seguendo questa regola:

se il numero è multiplo di 3, stampare la parola "Fizz";
se il numero è multiplo di 5, stampare la parola "Buzz";
se il numero è multiplo sia di 3 che di 5, stampare la parola "FizzBuzz";
se il numero non è multiplo né di 3 né di 5, stampare il numero.
Esempio di output:
*/
package mainpackage;

public class FizzBuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub



int i;

for(i=1;i<=50;i++) {
	 if(i%3==0 && i%5==0) {
		 System.out.println("Fizz Buzz" );
	 }
	 else if(i%5==0) {
		 System.out.println("Buzz" );
	 }
	 else if (i%3==0 ) {
		 System.out.println("FIzz" );
		 
	 }
	 else  {
		 System.out.println(i);
		 
				 
		 }
		 
	 }

	
}
	}
 

