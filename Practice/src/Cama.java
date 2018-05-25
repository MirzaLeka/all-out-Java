import java.util.*;
public class Cama {

	public static void main(String[] args) {
		
		Scanner ermin = new Scanner(System.in);
		
		System.out.println("Unesi broj veæi od dva:");
		int number = ermin.nextInt();
		int zoom = number / 2;
		
		for(int i = 1; i<=number; i++) {
		    
          C(number, i);
          A(number, zoom, i);
          M(number, i);
          A(number, zoom, i);
			
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

	public static void C(int number, int i) {
		
		 // C //
		
		for(int j = 1; j<=number; j++) {
			
			if (i == 1 | i == number & j<=number) {
				System.out.print("*");
			}
			else if (i>1 & i<number & j==1) {
				System.out.print("*");
			} else {
				System.out.print(" ");
			}
			
		}
	}
	
	public static void M(int number, int i) {
		
		// M //
		
		System.out.print(" ");
		
		for (int j = 1; j<=number; j++) {
			
			if ((i==1 || i<=number) & j == 1) {
				System.out.print("*");
			}
			if ((j>1 & j<=number) & i==j) {
				System.out.print("*");
			}				
			else {
				System.out.print(" ");
			}

		}
		for(int k = number; k >= 1; k--) {
			if ((k>1 & k<=number-1) & i==k) {
				System.out.print("*");
			}					
			else {
				System.out.print(" ");
			}
			
		}
		for(int z=1; z<=number; z++) {
			
		if ((i==1 | i<=number) & z == 1) {
			System.out.print("*");
			
	 		} 
		else  {
			System.out.print(" ");
		}
	}
		
		
	}
	

	

}
