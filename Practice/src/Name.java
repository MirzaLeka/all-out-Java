import java.util.*;
public class Name {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter your name");
	  while (!sc.hasNext("[A-Za-z]+")) {
	        System.out.println("Nope, that's not it!");
	        sc.next();
	    }
	    String word = sc.next();
	    System.out.println("Thank you! Welcome " + word);}
}
