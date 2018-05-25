import java.util.*;
public class GuessWhat {
	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	
	int broj = '€';
	int unos;
	
	System.out.println("Pokusaj pogoditi broj: ");
	unos = in.nextInt();
	while(unos<broj) {
		System.out.println("Unesite veci broj.");
		unos = in.nextInt();
		while (unos>broj) {
			System.out.println("Unesite manji broj.");
			unos = in.nextInt();
	}	}
	if (unos==broj) {
		System.out.println("Pogodili ste broj.");
		System.exit(0);
	}
	
	}
}
