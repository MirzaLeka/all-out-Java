import java.util.*;

public class ArrayStuff {

	public static void main(String[] args) {

		// check is number in array or not

		Scanner feb = new Scanner(System.in);

		int index = 0;
		int counter = 0;
		int number = 0;

		System.out.println("How much elements will you store in array?");
		int lenght = feb.nextInt();

		int[] Cama = new int[lenght];

		System.out.println("Let's fill this array with numbers. Go!");
		for (counter = 0; counter < lenght; counter++) {
			Cama[counter] = feb.nextInt();
		}

		System.out.println(
				"It's gonna be a long winter for you lad, but first let's find the largest number you stored into an array.");

		int temp = Cama[0];
		int tent = Cama[0];

		for (int x = 1; x < Cama.length; x++) {

			if (temp < Cama[x]) {
				temp = Cama[x];
			}
		}

		for (int x = 0; x < Cama.length; x++) {

			if (tent > Cama[x]) {
				tent = Cama[x];
			}

		}

		System.out.println("Alright laddy, the largest number you stored is number " + temp + " and the smallest is "
				+ tent + ".");

		System.out.println("\nNow let's see this stuff in action!"
				+ "\nType in random numbers and I'll tell you if any of those numbers are in a previous array.");

		do {

			System.out.println("Insert a number:");
			number = feb.nextInt();
			boolean test = false; 
			
			for (int i = 0; i < Cama.length; i++) {

				if (number == Cama[i]) {
					System.out.println("Number " + number + " is in an array. His index is " + i);
					test = true;
				}
			}
			if (!test) {
				System.out.println("Number " + number + " is NOT in an array.");
			}
		} while (number != -1);

		System.out.println("Now let's find a sum of all the numbers you stored.");

		int sum = 0;
		for (int x = 0; x < Cama.length; x++) {
			sum += Cama[x];
		}
		System.out.println("Sum of stored numbers is " + sum);

		System.out.print("Game over");

	}

}
