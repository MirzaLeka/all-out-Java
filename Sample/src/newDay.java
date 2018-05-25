import java.util.*;
public class newDay {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter your age: ");
		int age = in.nextInt();
		in.close();
		
		lastDay(age);		

	}
	
	public static void lastDay(int age) {
		
	if (age < 25) {
		System.out.println("Hey mate!");
	} else {
        System.out.println("Hey man!");
	}
		

	}

}
