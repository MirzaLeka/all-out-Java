import java.util.Scanner;
public class RecurseMethod {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter first and second number: ");
		recurse(in.nextInt(), in.nextInt());
		

	} 
	public static void recurse(int i, int number) {
		Scanner in = new Scanner(System.in);
		
	
		if (i == number) {
			System.out.println(i + ". It's time to recurse.");
			System.exit(0);
		}
		else {
			System.out.println(i + ". It's time to recurse.");
			recurse(i+1, number);
		} 
		
	
	//TRY THE OTHER WAY AROUND
	
		/*
		 * 
		 * public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter any number: ");
		int number = in.nextInt();
		recurse(number);
		

	} 
	public static void recurse(int number) {
		Scanner in = new Scanner(System.in);
		
		if (number <= 0) {
			System.out.println("Done.");
		}
		else {
			System.out.println(number + ". It's time to recurse.");
			recurse(number - 1);
		}
		 * 
		 */
		
		
		
	//___________________________________________	
		
	/*
	else if (number < 0) {
		System.out.println("Number is too small. Try again: ");
		number = in.nextInt();
		recurse(number); 	}
		
	else if (number > 100) {
		System.out.println("Number is too large. Try again: ");
		number = in.nextInt();
		recurse(number);        }
	
	else {
		System.out.println("Number Saved!");
	}*/

	/*	for(int i = 1; i <= loop; i++) {
	System.out.println(i + " YES/NO");
}
*/
	}
}