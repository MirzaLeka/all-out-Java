import java.util.*;
public class mojpokusaj2 {
public static void main(String[] args) {
	Scanner in = new Scanner (System.in);
	
	
	
	System.out.println("Unesi prvi broj");
	int x = in.nextInt();
	char[] spaces = new char[x-1];
	Arrays.fill(spaces, ' ');
	
	
//	System.out.println("Unesi drugi broj");
//	int y = in.nextInt();
	
	for (int row = 1; row <= x; row++) {
		for (int col = 1; col <=x; col++) {
			if ((row > 1 & row < x) & col == x) {
				System.out.print(new String(spaces) + "!");	
				}
		
			else {
				System.out.print("");
			}
		}
		System.out.println("");
	}
	//(row == 1 || row == broj) & col == broj || 

}
} //		if ((row > 1 & row < broj) & col == broj) {
//