import java.util.*;
public class Zadaca1 {

	public static void main(String[] args) {
	
		Scanner in = new Scanner (System.in);
		
		System.out.println("Unesite koordinate prve ta�ke: ");
		int x1 = in.nextInt();
		int y1 = in.nextInt();
		int z1 = in.nextInt();
		System.out.println();
		
		System.out.println("Unesite koordinate druge ta�ke: ");
		int x2 = in.nextInt();
		int y2 = in.nextInt();
		int z2 = in.nextInt();
		System.out.println();
		
		System.out.println("Udaljenost izme�u prve i druge ta�ke je:\n"
				+ Math.abs(x2-x1) + "m po X osi\n"
				+ Math.abs(y2-y1) + "m po Y osi\n"
				+ Math.abs(z2-z1) + "m po Z osi");

	}

}
