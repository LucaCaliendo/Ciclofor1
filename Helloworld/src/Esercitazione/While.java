package Esercitazione;

// stampare i numeri da 1 a 10 solo quelli pari
public class While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
		while (i <= 10) {

			if (i % 2 == 0) {
				System.out.println("i numeri pari sono: " + i);

			}
			i++;
		}
	}
}
