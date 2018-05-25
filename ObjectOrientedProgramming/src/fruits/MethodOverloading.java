package fruits;
import java.util.Scanner;
public class MethodOverloading {

	String name = " ";
static	Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		
//	System.out.println("Suma je " + ijk(4,5));
		
		System.out.println("Zbir je " + ijk(scan.nextInt(), scan.nextInt()));
		
	}
	
	static int ijk(int a, int b) {
		return a+b;
	}
	static int ijk(int a, int b, int c) {
		return a+b+c;
	}
	static double ijk(double a, double b) {
		return a+b;
	}
}