import java.util.*;
public class testingProgram {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	
		
		System.out.println("Enter an odd number and make sure your number isn't smaller than 3 or this program won't work: ");
		int number = in.nextInt();
		int zoom = number/2;


        /*
        * First Click Start (On top right corner)
        * Then Read The Code
        * No Cheating
        *
        */

		B(number);
		E(number);
		Y(number, zoom);
		O(number);
		N(number);
		D(number, zoom);
		
		System.out.println("_________________________\n");
		
		E(number);
		N(number);		
		E(number);
		M(number);
		Y(number, zoom);
		
		System.out.println("_________________________\n");
		
		L(number);
		I(number);
		N(number);
		E(number);
		S(number);
		
		System.out.println("_________________________\n");
		
		B(number);
		Y(number, zoom);

		System.out.println("_________________________\n");
		
		D(number, zoom);
		W(number);

	}
		
	
	public static void B(int number) {
		// B //
		
				for(int i = 1; i<=number; i++) {
					for(int j = 1; j<=number; j++) {
						
						if (i<=number & j==1) {
							System.out.print("*");
						}
						if (i==1 & j<=number-1) {
							System.out.print("*");
						}
						else if (number%2==1 & i>1 & i<((number/2)+1) & j==number-1) {
							System.out.print("*");
						}
						else if (i==(number/2)+1 & j<=number) {
							System.out.print("*");
						}
						else if (i==number & j<=number) {
							System.out.print("*");
						}
						else if (i<number & i>(number/2)+1 & j == number) { 
							System.out.print("*");
						}
						else {
							System.out.print(" ");
						}
					}
					System.out.println();
				}
				
				System.out.println();
		
	}
	
	public static void E(int number) {
		
		// E //
		
		for(int i = 1; i<=number; i++) {
			for (int j = 1; j<=number; j++) {
				
				if ((i==1 || i<=number) & j == 1) { 
					System.out.print("*");
				}
				else if (i==1 & (j==2 || j<=number)) {
					System.out.print("*");
				}
		    	else if (number%2==1 &((j<=number & j>1) & i==(number/2)+1)) {
					System.out.print("*"); }
				
				else if (i==number & (j==2 || j<=number)) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println();
	}
	
	public static void Y(int number, int zoom) {
		// Y //
		
		
		for(int i = 1; i<=zoom; i++) {
			for(int j=1;j<=zoom; j++) {
				
				if (i == j) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}	
			
				for(int k=zoom-1; k>=1; k--) {
				
					if (i == k) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
					
				}
			System.out.println();
		}
		
		for(int i = 1; i<=zoom+1; i++) {
			for(int j = 1; j<=zoom+1; j++) {
				
				if (j == zoom & i<=zoom+1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}	
		
		System.out.println();
	}
	
	public static void O(int number) {
		// O //
		
		for(int i = 1; i<=number; i++) {
			for(int j = 1; j<=number; j++) {
				
				if (i == 1 | i == number | j == 1 | j == number) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		System.out.println();
	}
	
	public static void N(int number) {
		// N //
		
		for(int i = 1; i<=number; i++) {
			for (int j = 1; j<=number; j++) {
				
				if ((i==1 || i<=number) & j == 1) {
					System.out.print("*");
				}
				if ((j>1 & j<=number-1) & i==j) {
					System.out.print("*");
				}
				else if ((i==1 || i<=number) & j == number) {
		 			System.out.print("*");
		 		}
				else {
					System.out.print(" ");
				}
	
			}
			System.out.println();
		}
		
		System.out.println();
	}
	
	public static void D(int number, int zoom) {
		// D //
		
		for(int i = 1; i<=number; i++) {
			for(int j = 1; j<=number; j++) {
				
				if (j == 1 & i<=number) {
					System.out.print("*");
				}
				else if (j == number & i >= zoom+1 & i < number) {
					System.out.print("*");
				}
				else if (j == number & i <=zoom & i > 1) {
					System.out.print("*");					
				}
				else if (i == 1 & j <= number-2) {
					System.out.print("*");	
				}
				else if (i == number & j <= number-2) {
					System.out.print("*");	
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		System.out.println();
	}
	
	public static void M(int number) {
		// M //
		
		for(int i = 1; i<=number; i++) {
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
			System.out.println();
		}
		System.out.println();
	}
	
	public static void L(int number) {
		// L //

		for(int i = 1; i<=number; i++) {
			for(int j =1; j<=number; j++) {
				
				if ((i==1 || i<=number) & j==1) {
					System.out.print("*");
				}
				else if (i==number & (j==2 || j<=number)) {
					System.out.print("*");
				}
				
				else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
		
		System.out.println();
	}
	
	public static void I(int number) {
		
		// I //
		
		for(int i = 1; i<=number; i++) {
			for (int j = 1; j<=number; j++) {
				
				if (i==1 & j<=number) {
					System.out.print("*");
				}
				else if (i==number & j<=number) {
					System.out.print("*");
				}
		    	else if (number%2==1 &((i<number & i>1) & j==(number/2)+1)) {
					System.out.print("*");
				} 
		    	else if (number%2!=1 &( (i<number & i>1) & (j==(number/2)+1) || (j==(number/2)))) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		System.out.println();

		
	}
	
	public static void S(int number) {
		// S //
		
		char[] spaces = new char[number-1];
		Arrays.fill(spaces, ' ');
		
		for(int i = 1; i<=number; i++) {
			for(int j=1; j<=number; j++) {
				
				if ((i==1 || i==number) & j<=number) {
				System.out.print("*");
				}
				if (number%2==1 &((j<=number & j>=1) & i==(number/2)+1)) { 
					System.out.print("*");  
					} 
				if ((i>1 & i<(number/2)+1) & j == 1) {
					System.out.print("*"); 
				}
				else if ((i<number & i>(number/2)+1) & j == number) { //use Array or something
					System.out.print(new String(spaces) + "*"); 
				}
				else {
					System.out.print(" ");	
				}
			}
			System.out.println();
		}
	System.out.println();
	}
	
	public static void W(int number) {
		// W //
		for (int i = 1; i<=number; i++) {
			for (int j = 1; j<=number-1; j++) {
				
				if (i==j) {
					System.out.print("*");
				}
				  else {
						System.out.print(" ");
					}
					}
			for(int k = number; k>=1; k--) {
				if (i==k) {
					System.out.print("*");
				}	
				  else {
						System.out.print(" ");
					}
			}
             for (int a = 2; a<=number-1; a++) {
				
				if (i==a) {
					System.out.print("*");
				}
				  else {
						System.out.print(" ");
					}
					}
             for(int b = number; b>=1; b--) {
 				if (i==b) {
 					System.out.print("*");
 				}	
 				  else {
 						System.out.print(" ");
 					}
 			}

			System.out.println();
			}
			
}
	
					
}
		
		
		