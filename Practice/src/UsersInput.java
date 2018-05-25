import java.util.*;

public class UsersInput {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter value of font:");
		int number = input.nextInt();
		int zoom = number / 2;
		System.out.println("Enter your name:");
		char var1 = input.next().charAt(0);
		char var2 = input.next().charAt(1);
		
	/*TODO
	 * 1. Store Values in Array (video)
	 * 2. Split String into letters
	 * a) http://stackoverflow.com/questions/1521921/splitting-words-into-letters-in-java 
	 * b) http://stackoverflow.com/questions/5235401/split-string-into-array-of-character-strings
	 * 3. Key Inputs
	 * a) if input = SPACE, split words
	 * b) if input = ENTER, split rows
	 */
		
		for(int i = 1; i<=number; i++) {
	
		switch ((var1) & (var2)) {
		
		case 'a':
		A(number, zoom, i);

	
		}
	/*	switch (var2) {
		
		case 'a':
		A(number, zoom, i);
		break;
		} */
		System.out.println();
		}
		
	}
	

public static void A(int number, int zoom, int i) {
		
		//A//
		
		System.out.print(" ");
		
		for(int j = number; j>=2; j--) {
			
			if (i == j) {
				System.out.print("*");
			}
			else if (i == zoom+1 & (j<=zoom & j<=number)) {
				System.out.print("*");
			}
			else {
				System.out.print(" ");
			}
		}
			
			for (int k = 1; k<=number; k++) {
				
				if (i == k) {
					System.out.print("*");
				}
				else if (i == zoom+1 & (k<=zoom & k<=number)) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}	
			}
	
	}


}
