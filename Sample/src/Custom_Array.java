import java.util.*;
import java.util.stream.*;
public class Custom_Array {

	public static void main(String args[]){
	   
		Scanner inpt = new Scanner(System.in);
		/*
	    int[] arrayCrit = new int[5]; //jedan array mi treba
	    int[] crits = new int[5]; 

	    for (int i = 0; i < crits.length; i++) {
	        System.out.print("Enter Criteria: ");
	        crits[i] = inpt.nextInt();
	        System.out.print("Enter Percentage: ");
	        arrayCrit[i] = inpt.nextInt();
	    }
	    // Printing the values
	    for (int i = 0; i < crits.length; i++) {
	        System.out.println("Criteria :" + crits[i] + " Percentage: "
	                + arrayCrit[i]);
	    }
	    
	    int sum = IntStream.of(crits).sum();
	    System.out.println("The sum is " + sum);
	    
	}
		
		*/
		/*
		System.out.println("How many values will you use?");
		int values = in.nextInt();
		int i = 0;
		int counter;
		
		int[] stuff = new int [values];
		
		for(counter = 0; counter < values; counter++) {
			System.out.println("Enter the " + (counter+1) + ". value: ");
			stuff[counter] = in.nextInt();
		
			if(stuff[counter] % 2 == 1) {
				i++;
			}
			
		}
		System.out.println("You entered " + i + " odd numbers.");
		*/
	/*	
		System.out.println("Enter number of values you'll use:");
		int numOfValues = in.nextInt();
		int value = 0;
		
		for (int i = 1; i <= numOfValues; i++) {
			System.out.println("Enter a value of the " + i + ". value:");
			value = in.nextInt();
			System.out.println("Value you entered is " + value);
		} */
//		
		
		
		
		
	
		System.out.println("Values you entered are");
		
		//for counter = counter < i; counter++
		//number that can be %2 is repeated i times
		
		for(int counter = 0; counter < values; counter++) {
			System.out.print(stuff[counter] + " ");
		}
		
		for (int counter = 0; counter < i; counter++) {
			System.out.println("Number that can be modded with 2 is repeated " + i + " times.");
		} 

	}


}