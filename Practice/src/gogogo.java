import java.util.*;
public class gogogo {

	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);		
		int number;
		int counter = 0;								//use some name with a sense. what is j? (i is a common use as a counter in a loop, thats ok)
		
		System.out.print("Enter number: ");
		number = in.nextInt();
		in.close(); 									// make shore to close a scanner as soon as you don't need it anymore
		
		System.out.println("\n\nCalculation results:");
		for (int i = 1; i <= number; i++) {
			
	//		System.out.println(i + " % 2 = " + i % 2);	//print screen result for each member of the loop
			
			if (i % 2 == 0) {							//if a member of the loop can be devided by 2 then increase the counter
				counter++;
			}
			
			
		}
		
		System.out.print("\n\n");
		
		System.out.println("Between 1 and " + number + " are " + counter + " numbers that can be devided by 2.");
		System.out.print("The number >" + number + "< it self is ");
		if(number % 2 == 0) System.out.println("also divisible by 2.");
		else 				System.out.println("anot divisible by 2.");
	}
}