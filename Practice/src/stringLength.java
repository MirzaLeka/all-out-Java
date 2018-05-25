import java.util.*;
public class stringLength {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String name;
		
	/*	System.out.println("Enter your name: ");
		name = in.nextLine();
		
		while (name.trim().length()<3) {
			System.out.println("Your name is too short.");
		
			System.out.println("Re-enter your name.");
			name = in.nextLine();
		}
		
		while (name.trim().length()>5) {
			System.out.println("Your name is too long.");
			
			name = in.nextLine();
		}
	System.out.println("Welcome " + name); */
	
	String broj;
	
	System.out.println("Enter number");
	Scanner jS = new Scanner(System.in);
	broj = jS.nextLine();
	
	if (broj.length()!=4) {
		System.out.println("broj ima manje/vise od tri cifre");
	} else {
		System.out.println("broj ima cetiri cifre");
	}
	
	
	}


}
