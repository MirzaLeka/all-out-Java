import java.util.*;
public class Custom_Pattern {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	
		//Kad imas vise petlji, one se nadovezuju jedna na drugu. 
		//Zato svaka ide do istog broja npr \/ ali on zna da ako je jedna isla do 5 druga ide do 10 razmaka (od pocetka do kraja)
		//jer to 5 od prve plus drugih 5 koji pripadaju drugoj, tj. drugi number (unos)
		//a posto mi je Z trebalo na pocetku, uslov je z=1 jer i krece od pocetka
		
		System.out.println("Unesi broj: ");
		int number = in.nextInt();
		int zoom = number/2;
		
		char[] spaces = new char[number-1];
		Arrays.fill(spaces, ' ');
		
		if (number == 1) {
			System.out.println("***");
			System.exit(0); 
		} 
		
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
		
		System.out.println();
		
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
		
		// H //
		
		
		for(int i = 1; i<=number; i++) {
			for (int j = 1; j<=number; j++) {
				
				if ((i==1 || i<=number) & j == 1) {
					System.out.print("*");
				}
				else if (number%2==1 &((j<=number & j>1) & i==(number/2)+1)) {
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
		
		// S //
		
		for(int i = 1; i<=number; i++) {
			for(int j=1; j<=number; j++) {
				
				if ((i==1 || i==number) & j<=number) {
				System.out.print("*");
				}
				if (number%2==1 &((j<=number & j>=1) & i==(number/2)+1)) { //pošto i E i H imaju prvo uspravno liniju "I" pa onda horizontalne
					System.out.print("*");  //crte, koristio sam j>1, a sad je horizontalna linija u sredini slova "S" i krece od pocetka pa ce j biti <=broj
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
		
		// T //
		
		for(int i = 1; i<=number; i++) {
			for(int j=1; j<=number; j++) {
				
				if (i==1 & j<=number) {
					System.out.print("*"); 
				}
		    	else if (number%2==1 & i>1 & j==(number/2)+1) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");	
				}
			}
			System.out.println();
		}
		
		System.out.println();
		
		// F //
		
		for(int i = 1; i<=number; i++) {
			for(int j=1; j<=number; j++) {
				
				if (i<=number & j == 1) {
					System.out.print("*");
				}
			    else if (i==1 & j<=number) { 
					System.out.print("*"); 
				}
		    	else if (number%2==1 & i==(number/2)+1 & j<=number) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");	
				}
			}
			System.out.println();
		}
		
		System.out.println();
		
		//I prefer to do things from start with every letter. I fail, I retry and I succeed. 
		
		// P //
		
		for(int i = 1; i<=number; i++) {
			for(int j = 1; j<=number; j++) {
				if (i<=number & j==1) {
					System.out.print("*");
				}
				if (i==1 & j<=number-1 ) {
					System.out.print("*"); 
				}
				else if(number%2==1 & i==(number/2)+1 & j<=number-1) {
					System.out.print("*"); 
				}
				else if (i>1 & i<(number/2)+1 & j==number-1) { //tried, but won't work for some reason
					System.out.print("*"); 
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		System.out.println();
		
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
		
		// Z //
		
		for(int i = 1; i<=number; i++) {
			for(int j = number; j>=1; j--) {
				
				if (i == 1 | i ==number & j>=1) {
					System.out.print("*");
				}
				else if (i == j) {
					System.out.print("*");
				}
				else if (i == zoom+1 & j<=number) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}

			}
			System.out.println();
		}
		
		System.out.println();
		
		// C //
		
		for(int i = 1; i<=number; i++) {
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
			System.out.println();
		}
		
		System.out.println();
		
		// U //
		
		for(int i =  1; i<=number; i++) {
			for(int j = 1; j<=number; j++) {
				
				if (j == 1 | j == number & i <= number) {
					System.out.print("*");
				}
				else if (i == number & j<=number) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
		
		System.out.println();

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
		
		// X //
		
		for(int i = 1; i<=number; i++) {
			for(int j = 1; j<=number; j++) {
				if (i == j) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
				for(int k = zoom+2; k>=1; k--) {
					if (i == k) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}	
				}
				System.out.println();
		}
		
		System.out.println();
	
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
	
		// A //
		
		for(int i = 1; i<= number; i++) {
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
				System.out.println();
		}
		System.out.println();
		
		// R // - Failed (I wasn't sure when I was writing this anyway)
		
				for(int i = 1; i<=number; i++) {
					for(int j = 1; j<=number; j++) {
						if (i<=number & j==1) {
							System.out.print("*");
						}
						if (i==1 & j<=number-1 ) {
							System.out.print("*"); 
						}
						else if(number%2==1 & i==(number/2)+1 & j<=number-1) {
							System.out.print("*"); 
						}
						else if (i>1 & i<(number/2)+1 & j==number-1) { //tried, but won't work for some reason
							System.out.print("*"); 
						}
						else {
							System.out.print(" ");
						}
					}
					
					for(int blue = zoom; blue<=number; blue++) {
						
						for (int red = 2; red<=number; red++) {
							
							if (blue == red) {
								System.out.print("*");
							} else {

							}
							
						}
						
						System.out.println();
					}
					
					System.out.println();
				}
				
				System.out.println();
			
				// R // - FAILED again
			
			for(int i = 1; i<=number; i++) {
				for(int j = 1; j<=number; j++) {
					if (j == 1 & i<=number) {
						System.out.print("*");
					}
					else {
						System.out.print(" ");
					}
				}
				for(int k = zoom; k<=number; k++) {
					for(int l = 2; l<=number; l++) {
						if (l == k) {
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

		
		
		//Next A, K, R, J, X, Q, G
		
	}

}
