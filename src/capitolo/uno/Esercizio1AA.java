package capitolo.uno;
import java.util.Scanner;
/*
Creare la classe SommaTreInteri come descritto nel paragrafo 1.5.3.
 */
public class Esercizio1AA {
	public static void main(String args[]) {
			Scanner sc = new Scanner(System.in);
			System.out.println("inserisci il primo numero intero e premi invio:");
			int primoNumeroIntero = sc.nextInt();
			System.out.println("inserisci il secondo numero intero e premi invio:");
			int secondoNumeroIntero = sc.nextInt();
			System.out.println("inserisci il terzo numero intero e premi invio:");
			int terzoNumeroIntero = sc.nextInt();
			
			int somma = primoNumeroIntero + secondoNumeroIntero + terzoNumeroIntero;
			System.out.println("La somma dei tre numeri interi è: ");
			System.out.println(somma);
			sc.close();
	}
}
