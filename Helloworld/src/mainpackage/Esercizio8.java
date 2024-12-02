package mainpackage;
import java.util.Scanner;

public class Esercizio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner = new Scanner(System.in);

System.out.println("inserisci un numero");

int numero=scanner.nextInt();
int precedente= numero-1;
int successivo= numero+1;

System.out.println("il numero precedente è:"+precedente);
System.out.println("il numero precedente è:"+successivo);

scanner.close();
	}

}
