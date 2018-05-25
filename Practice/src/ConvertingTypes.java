import java.util.*;
public class ConvertingTypes {

	public static void main(String[] args) {
	
		Scanner java = new Scanner(System.in);
		
		int nesto;
		System.out.println("Enter num:");
		String broj = java.nextLine();
		
		nesto = Integer.valueOf(broj);
		
		System.out.println("Nesto je "+nesto);
		System.out.println();
	//	System.out.printf("Broj je %04d ", nesto);
		
		String mirzoni = String.format("%04d", nesto);
		int habibi = Integer.valueOf(mirzoni);
		
		System.out.println(habibi);
		
/*		if (nesto < 5 | nesto > 9999) {
			System.out.println("Omg");
		} else {
			System.out.println("What do I do now?");
		} */

	}

}
