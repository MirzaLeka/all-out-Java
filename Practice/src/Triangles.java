import java.util.*;
public class Triangles {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter num");
		int n = in.nextInt();
		int j;
		int m = 2*n;
		
		for (int i = 1; i <=n; i++) {
			
			for (j = 1; j <= m; j++) {
							
				if (j == i) {
					System.out.print("*");	
					if (j == i*2) {
						System.out.print("*");	
					}

				}
				
				else System.out.print(" ");	
			}
			System.out.println();
		}
		
		
			
								

	/*	
		for (int i = 1; i <=n; i++) {
			for (int j = 1; j <= n; j++) {
				if (j >= i) {
					System.out.print("*");	
				}
				else System.out.print(" ");	
			}
			System.out.println();
		}
		*/
		
		/*
		 * 
		 *  i = 1
jel 1 >= 1 jeste, jel 2>=1, jeste, jel 3>=1 jeste, jel 4>=1 jeste - Prvi Red
i = 2
jel 1>= 2 nije, ostavi prazno, jel 2>=2 jeste, jel 3>=2 jeste, jel 4 >=2 jeste - Drugi Red
i = 3
jel 1>=3 nije - prazno, jel 2 >=3, prazno, jel 3>=3 jeste, jel 4>=3 jeste ispisi
i = 4
jel  1>=4 nije - prazno, jel 2 >=4, prazno, jel 3>=4 NE, JEL 4>=4 JESTE ISPISI
		 
		 */
		
	/*    for (int i = 1; i <= n; i++) {
			
				for (int j = n; j >= 1; j--) {
					
					if (j > i) {
						System.out.print(" ");
					}
					else {
						System.out.print("*");
					}
				}
				System.out.println();
			}
		*/
		
        /*    for (int i = 1; i <= n; i++) {
			
			for (int j = n; j >= 1; j--) {
				
				if (j < i) {
					System.out.print("");
				}
				else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
	SAME THING DIFFERENT WAY o.O
		*
		*/
		
	/*	for (int i = 1; i <= n; i++) {
			
			for (int j = n; j >= 1; j--) {
				
				if (j >= i) {
					System.out.print("*");
				}
				
			}
			System.out.println();
		} */
		
	/*	for(int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				
				
			if (j <= i) {
				System.out.print("*");
			}
				
				
			}
			System.out.println();
		} */

	}

}
