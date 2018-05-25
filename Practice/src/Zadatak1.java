import java.util.*;
public class Zadatak1 {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		try {
			
		
		
		System.out.println("Do the work");
		int x = in.nextInt();
		System.out.println("Do it again");
		int y = in.nextInt();
		
		for (int i = 1; i<=x;i++) {
		
			for (int j=1; j<=y; j++) {
				Thread.sleep(300);
				System.out.print("*");	
		}
			Thread.sleep(500);
			System.out.println();
		}
		}catch(Exception e) {}
		
		
	}

}





