import java.util.*;
public class binaryCode {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	
	
	System.out.println("Unesite neki broj.");
	int broj = in.nextInt();
	
	while (broj!=0) {
		if (broj%2==0) {
			System.out.print(" 0");
		} else {
			System.out.print(" 1");
		}
		broj/=2;
	
	}
		
		
		

}
	
}
