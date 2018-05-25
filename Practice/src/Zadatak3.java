import java.util.Arrays;
import java.util.Scanner;
public class Zadatak3 {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		System.out.println("JustDoIt");
		int x = in.nextInt();
		System.out.println("JustDoItAgain");
		int y = in.nextInt();
		
		char[] spaces = new char[y-2];
		Arrays.fill(spaces, ' ');
		
		for (int i = 1; i<=x;i++) {
		
			for (int j=1; j<=y; j++) {
			if (j == 1 & (i == 1 || i == x) ||  j == y & (i == 1 || i == x)) {
			System.out.print("+");	
			}
			if ((j > 1 & j < y) & (i == 1 || i == x)) {
			System.out.print("-");				
			}
			if ((i > 1 & i < x) & j == 1) {
				System.out.print("|");	
				}
			if ((i > 1 & i < x) & j == y) {
				System.out.print(new String(spaces) + "|");		
				}
			
			 else { System.out.print(""); }
			}
			System.out.println("");
		}
		
		// if (((i > 1 & i < x) & (j == 1 || j == y))) {
		
	}

}
