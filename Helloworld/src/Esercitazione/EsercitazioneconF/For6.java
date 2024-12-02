package Esercitazione.EsercitazioneconF;

//Conta i numeri divisibili per 3 tra 1 e 100
public class For6 {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		int c = 0; // contatore
		for (int i = 1; i <= 100; i++) {

			if (i % 3 == 0) {
				// se è vero conta

				c++;
				System.out.println(" i numeri divisibili sono : " + i);//
			}

		}

		System.out.println("il totale dei numeri divisibili  " + c);
	}

}
