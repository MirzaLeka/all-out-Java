import java.util.Scanner;
public class Zadatak2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);
		
		
		System.out.println("Unesite brojeve: "); //ovo println je isto sto i cout << ....
		int unos;
		int rezultat = 0;
		do {
		unos = scan.nextInt(); // scan.nextInt je komanda za unos podataka (User input)
		rezultat = (unos * 6) + rezultat;		
		}while(unos != 20);
		
		System.out.println("Konaèni rezultat je " + rezultat);

	}

}
