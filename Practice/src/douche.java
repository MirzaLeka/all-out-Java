
import java.util.Scanner;

public class douche {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Insert number");	
		
		System.out.println(funky(input.nextInt()));
	
	}
	
	static String funky(int i) {
		
		if (i < 10) {
			return "Hello";
		}
		else {
			return "World";	
		}
		
		
	}
	
	
}
