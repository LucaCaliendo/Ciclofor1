package mainpackage;
/*  Esercizio 1: Merge di due array ordinati
Descrizione: Scrivi un programma che unisca due array ordinati in un unico array, mantenendo l'ordine crescente.

Requisiti:

Dichiarare due array di numeri interi ordinati (esempio: {1, 3, 5} e {2, 4, 6}).
Creare un algoritmo che unisca i due array in un terzo array ordinato.
Stampare il terzo array. */
public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int array1 [] = {1,3,5};
int array2 [] = {2,4,6};

int[] Arrays = new int[array1.length + array2.length];
//int creare l arrey di tipo int , il nome = crea un nuov arrei unito con i primi due 

System.arraycopy(array1, 0, Arrays, 0, array1.length);
System.arraycopy(array2, 0, Arrays, array1.length, array2.length);


// Stampare l'array unito e ordinato
//System.out.println("Array unito e ordinato: " + Arrays.toString(Arrays));
	}

}


