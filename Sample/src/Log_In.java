import java.util.*;
public class Log_In {
	 public static void main(String [] args) {
	        Scanner in = new Scanner(System.in);
	        
	        String username, email, password;
	        
	        String editorUser = "Spy4er";
	        String editorEmail = "mirza_376@hotmail.com";
	        String editorPw = "CodeName47";
	        
	        
	        System.out.println("Enter your email: ");
	        email = in.nextLine();
	        
	        System.out.println("Enter your password: ");
	        password = in.nextLine();
	        
	        if (!email.equals(editorEmail)) {
	        	System.out.println("This email isn't valid. ");
	        }
}	 
}