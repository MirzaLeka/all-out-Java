import java.util.Scanner;
public class Zadatak3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		
		System.out.println("Unesite poèetnu vrijednost: ");
		int pocetna = scan.nextInt();
		
		System.out.println("Unesite krajnju vrijednost: ");
		int krajnja = scan.nextInt();
		
		System.out.println("Unesite vrijednost smanjivanja: ");
		int smanjivanje = scan.nextInt();
		
		for (int i = pocetna; i >= krajnja; i-=smanjivanje) {
			System.out.println(i);
		}
	}

}
