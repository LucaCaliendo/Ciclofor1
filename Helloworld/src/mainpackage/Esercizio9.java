package mainpackage;
import java.util.Scanner;
public class Esercizio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner= new Scanner(System.in);

System.out.println("inserisci il primo numero");
int numero1= scanner.nextInt();

System.out.println("inserisci il secondo numero");

int numero2=scanner.nextInt();

System.out.println("inserisci il terzo numero");

int numero3=scanner.nextInt();

int maggiore;


if(numero1>=numero2 && numero1>=numero3) {
	maggiore=numero1;
	
}else if(numero2>=numero1 && numero2  >=numero3) {
	maggiore=numero2;
	
}
else {
	maggiore=numero3;
}

System.out.println("il numero maggiore è :"+ maggiore);

	}
		

}
