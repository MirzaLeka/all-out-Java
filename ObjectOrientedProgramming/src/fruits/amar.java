package fruits;

import java.util.Scanner;

public class amar {

	public static void main(String[] args) {
	
		Scanner hasa = new Scanner(System.in);
		
		System.out.println("Unesi prvi broj");
		int prviBroj = hasa.nextInt();
		
		System.out.println("Unesi drugi broj");
		int drugiBroj = hasa.nextInt();
		
		System.out.println("zbir je:\n" + (prviBroj + drugiBroj));

	}


}
