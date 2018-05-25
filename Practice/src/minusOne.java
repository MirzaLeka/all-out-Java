import java.util.*;
public class minusOne {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int numberOfDenominators = 1; 
		int valueOfNumerator;
		int valueOfDenominator = 1; 
		int counter = 0;
		
		System.out.println("Hi there! I'm bored. \n");
		System.out.print("How many denominators will you use? ");
		numberOfDenominators = in.nextInt();
		System.out.println();
		
		for (int i = 1; i <= numberOfDenominators; i++) {
			System.out.print("Enter value of " + i + ". denominator: ");
			valueOfDenominator = in.nextInt();
			System.out.println();
			
			do {

				System.out.print("Enter value of numerator: ");
				valueOfNumerator = in.nextInt();
				
				if (valueOfNumerator % valueOfDenominator == 0) {
					counter++;
					}
				
			}while(valueOfNumerator!=-1);
			
			System.out.println("__________________________");
			
			System.out.println(" >" + counter + "< numerators you entered can be devided by denominator |" + valueOfDenominator + "|.");
			counter = 0;
	
		}
		
		System.out.println("\nThis is the end of the line.");
		System.exit(0);

	

	}
	
	

}
