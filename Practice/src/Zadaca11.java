import java.util.*;
public class Zadaca11 {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int numbers;
		int nums;
		int temporaryValue = 1;
		int firstValue = 1;
		int firstCounter = 0;
		int secondValue = 1;
		int secondCounter = 0;
		int thirdValue = 1;
		int thirdCounter = 0;
		
		System.out.println("Enter numbers: ");
		numbers = in.nextInt();
		temporaryValue = numbers;
		firstValue = temporaryValue;
		firstCounter++;

			do {
			System.out.println("Enter numbers: ");
			nums = in.nextInt();
			temporaryValue = nums;
			
			if (nums == -1) {
				continue;
			}
			
			if (nums < 0) {
				System.out.println("Number is too small. Try again.");
				continue;
			}
			
			if (nums > 100) {
				System.out.println("Number is too large. Try again.");
			}

			
			if(temporaryValue == firstValue) {
				firstCounter++;
			}
			
			if(temporaryValue != firstValue) {
				temporaryValue = secondValue;
				secondCounter++;
			}
			
			if(temporaryValue != secondValue & temporaryValue != firstValue) {
				temporaryValue = thirdValue;
				thirdCounter++;
			}
			
			

			}while(nums!=-1);
		
	System.out.println("Number " + firstValue + " was repeated " + firstCounter + " times.");
//	System.out.println("Number " + secondValue + " was repeated " + secondCounter + " times.");
	//System.out.println("Number " + thirdValue + " was repeated " + thirdCounter + " times.");
		
		
		
		
	}

}
