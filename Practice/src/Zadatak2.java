import java.util.Scanner;
public class Zadatak2 {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		System.out.println("Enter num");
		int x = in.nextInt();
		
		for (int i = 1; i<=x;i++) {
		
			for (int j=1; j<=x; j++) {
				if (i %2 != 0 || i == x || j %2 != 0 || j == x) {
					System.out.print(" ERMIN ");
				} else { System.out.print(" HUBIÆ "); } 
			} 
			System.out.println("");
		}
		
		
		
	}

}
