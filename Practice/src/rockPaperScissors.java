import java.util.*;

public class rockPaperScissors {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Choose wisely, rock, paper or scissors.");
		String user = input.nextLine();
		String reply = "";
		
	
		
		double computersChoice = Math.random();
		
		if (computersChoice >= 0 & computersChoice <= 0.33) {
		reply = "rock";
		}
		if (computersChoice > 0.33 & computersChoice <= 0.66) {
		reply = "paper";
		}
		if (computersChoice > 0.66 & computersChoice <= 1) {
		reply = "scissors";
			}
		
		System.out.println(reply);
		
		//Outcomes
		
		if  (user.equals(reply))  {
			System.out.println("Tied game");
		}
		if ( user.equals("rock") & reply.equals("paper")) {
			System.out.println("Computer wins!");
		}
		 if ( reply.equals("rock") & user.equals("paper")) {
			System.out.println("Computer wins!");
		}
		 if ( user.equals("rock") & reply.equals("scissors")) {
			System.out.println("User wins!");
			}
		 if ( user.equals("scissors") & reply.equals("rock")) {
				System.out.println("Computer wins!");
				} 
		 if ( user.equals("paper") & reply.equals("scissors")) {
				System.out.println("Computer wins!");
				} 
		 if ( user.equals("scissors") & reply.equals("paper")) {
				System.out.println("User wins!");
				} 
		
		//use else if with { IF ... & ELSE ... } inside
		

	}

}
