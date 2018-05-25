import java.util.*;
public class Dzemal {

	public static void main(String[] args) {
		Scanner zeljo = new Scanner(System.in);
		
		System.out.println("Enter odd number: ");
		int number = zeljo.nextInt();
		int zoom = number / 2;
		
		for (int i = 1; i<=number; i++) {
			
			// D //
			
				for(int j = 1; j<=number; j++) {
					
					if (j == 1 & i<=number) {
						System.out.print("D");
					}
					else if (j == number & i >= zoom+1 & i < number) {
						System.out.print("D");
					}
					else if (j == number & i <=zoom & i > 1) {
						System.out.print("D");					
					}
					else if (i == 1 & j <= number-2) {
						System.out.print("D");	
					}
					else if (i == number & j <= number-2) {
						System.out.print("D");	
					}
					else {
						System.out.print(" ");
					}
				}
				
				// Z //
				
				for(int j = number; j>=1; j--) {
					
					if (i == 1 | i ==number & j>=1) {
						System.out.print("Z");
					}
					else if (i == j) {
						System.out.print("Z");
					}
					else {
						System.out.print(" ");
					}

				}
				
				// E //
				
				for (int j = 1; j<=number; j++) {
					
					if ((i==1 || i<=number) & j == 1) { 
						System.out.print("E");
					}
					else if (i==1 & (j==2 || j<=number)) {
						System.out.print("E");
					}
			    	else if (number%2==1 &((j<=number & j>1) & i==(number/2)+1)) {
						System.out.print("E"); }
					
					else if (i==number & (j==2 || j<=number)) {
						System.out.print("E");
					}
					else {
						System.out.print(" ");
					}
					
				}
				
				// M // 
				
				for (int j = 1; j<=number; j++) {
					
					if ((i==1 || i<=number) & j == 1) {
						System.out.print("M");
					}
					if ((j>1 & j<=number) & i==j) {
						System.out.print("M");
					}				
					else {
						System.out.print(" ");
					}
		
				}
				for(int k = number; k >= 1; k--) {
					if ((k>1 & k<=number-1) & i==k) {
						System.out.print("M");
					}					
					else {
						System.out.print(" ");
					}
					
				}
				for(int z=1; z<=number; z++) {
					
				if ((i==1 | i<=number) & z == 1) {
					System.out.print("M");
					
			 		} 
				else  {
					System.out.print(" ");
				}
			}
				
				// A //
				
				for(int j = number; j>=2; j--) {
					
					if (i == j) {
						System.out.print("A");
					}
					else if (i == zoom+1 & (j<=zoom & j<=number)) {
						System.out.print("A");
					}
					else {
						System.out.print(" ");
					}
				}
					
					for (int k = 1; k<=number; k++) {
						
						if (i == k) {
							System.out.print("A");
						}
						else if (i == zoom+1 & (k<=zoom & k<=number)) {
							System.out.print("A");
						}
						else {
							System.out.print(" ");
						}	
					}
					
					// L //
					
					for(int j = 1; j<=number; j++) {
						
						if ((i==1 || i<=number) & j==1) {
							System.out.print("L");
						}
						else if (i==number & (j==2 || j<=number)) {
							System.out.print("L");
						}
						
						else {
							System.out.print(" ");
						}
						
					}
			
			
			System.out.println();
		}
		
		

	}

}
