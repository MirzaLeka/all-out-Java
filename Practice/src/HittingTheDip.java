import java.util.*;
import java.lang.*;
public class HittingTheDip {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		System.out.println("Unesi vrijednosti koeficjenata a, b i c.");
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		
		int determinant = b*b - 4*a*c;
		
		double solution1 = 1;
		double solution2 = 1;
		
		if (determinant > 0) {
			solution1 = (-b+(Math.sqrt(determinant))/(2*a));
			solution2 = (-b-(Math.sqrt(determinant))/(2*a));
			System.out.println("Rješenje je " + solution1 + " i " + solution2);	
		}
		
		else if (determinant == 0) {
		solution1 = solution2 = (-b/(2*a));	
		System.out.println("Rješenje je " + solution1);	
		}
		else {
			System.out.println("Not your day!");
		}
		
		//if i just write if, it will print an else statemenT too	
}

	
}