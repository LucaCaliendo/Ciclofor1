package Esercitazione;
//Calcolare il prodotto dei numeri dispari da 1 a 15 utilizzando un ciclo "for":
public class Ciclo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int prodotto=1;
for(int i=1;i<=15;i+=2) {
	prodotto*=i;
	
}
System.out.println("il prodotto è " + prodotto);
	}

}
