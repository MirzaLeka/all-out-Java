import java.util.*;
public class Zadaca13 {
		
		 public static void main(String[] args) {
			 
		
			 
			 Scanner in = new Scanner(System.in);

			 int[] account_numbers = {3,9, 6, 5, 5, 5, 9, 10, 6, 9,9}; //array from 1 to 100
			 
			 System.out.println("what are you waiting for");
			 int userInput = in.nextInt();
			 int counter = 0;
			 int mounter = 0;
			 
			 // After you store each input (for each index |0|, |1|...that matches condition <=100 >0) into array
			 //TODO "number " +  account_number[broj| + " has being repeated " + counter + " times."
			 
			 //if userInput is not in array, do again
			 // if userInput = -1 whole thing stops
			 
			 if (account_numbers[0] == userInput) {
		         counter++;
		         //STORE num you enter in new array
		     }
			 if (account_numbers[1] == userInput) {
		         mounter++;
		     }
		     else {
				System.out.println("Not OK");
			}
			 
			//STORE VALUES IN AN ARRAY
			 // https://www.youtube.com/watch?v=RTvTcpvhcl4&t=367s
			 
			System.out.println("Number you entered has repeated " + counter + " times.");
			System.out.println("Number you entered has repeated " + mounter + " times.");
			 
			/* for (int i = 0; i < account_numbers.length; i++) {
			     if (account_numbers[i] == userInput) {
			         validInput = true;
			         System.out.println("OK");
			         break;
			     }
			     else {
					System.out.println("Not OK");
				}
			 } */
			 
			 /*	 Scanner in = new Scanner(System.in);

			 int[] array = {3,9, 6, 5, 5, 5, 9, 10, 6, 9,9};

			    SortedSet<Integer> s = new TreeSet();
			    System.out.println("Enter #");
			    int numberToCheck = in.nextInt();
			    for (int i = 0; i < array.length; i++) {
			        s.add(array[i]);
			    }

			    System.out.println("Number contains:"+!(s.add(numberToCheck)));

			    System.out.println("Sorted list:");
			    System.out.print(s); */

			    
			    
		 }
		 
}
			    