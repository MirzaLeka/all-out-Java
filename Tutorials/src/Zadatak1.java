import java.util.*;

public class Zadatak1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int vrijednost = 0;
		int ukupno = 0;
		System.out.println("Koliko imate raèuna?");
		int racuni = scan.nextInt();

		for (int i = 1; i <= racuni; i++) {
			System.out.println("Koliko imate novca " + i + ". raèunu?");
			vrijednost = scan.nextInt();
			ukupno += vrijednost;
		}

		System.out.println("Kolika Vam je plata?");
		int plata = scan.nextInt();

		if (ukupno > plata) {
			System.out.println("Nemate toliko novca.");
		} else {
			System.out.println("Ostalo Vam je " + (plata-ukupno) + " KM.");
		}

	
	
	}

}
