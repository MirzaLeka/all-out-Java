package fruits;

import java.util.Scanner;

public class Class_A {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("What's your name?");
		Class_B myObj = new Class_B();
		myObj.name = scan.nextLine();
		myObj.loop(1, 5);
		myObj.isFasting();
		if (myObj.isFasting()) {
			System.out.println("Keep it up");
		}
		else {
			System.out.println("You should");
		}
		
	}
	

}
