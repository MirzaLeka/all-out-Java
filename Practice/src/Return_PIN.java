import java.util.*;
public class Return_PIN {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("How old are you?");
		int age = in.nextInt();  //Gets input from the user.
		
		ReturnTest(age); //Runs method with parameter from our user input
		String newVariable; //Creates new variable, String, because I'll return String.
		newVariable = ReturnTest(age); //Assign value of a newly created variable to a method with a parameter inside brackets (a.k.a. argument). 
		System.out.println(newVariable); //Process inside method is done. Time to print it, but we do not print method.
		//Instead we print a variable we assigned to our method.
		
		//Everything that had to do with method is complete. We can finish the program or we can continue. It's completely optional.
		System.out.println("It appears you are " + age + " years old. Good for you!");	

	}
	
	public static String ReturnTest(int age) { //First of all, It's not a void. We'll return a value type String.
		//Inside an argument there is a parameter int age, same int game from user's input.
		
		//I can't place Return inside of a body (in this example - multiple methods), because Statements (If and Switch) in
		//some way already have that Return process inside.
		//That means that I can't write something like If age is or isn't (variable + condition) return "Text", but what I can do is
		//create new variable, like String myText, assign it value and once program enters body (Statement), program checks condition
		//and based on that changes the value of my newly created variable and then I use Return to return that variable to another method.
		
		String myText = "hahha"; //Now let's create new variable String type, because I intend to return String.
		//Sometimes it requires initialization, sometimes not. I'll give it dumbest value ever "hahha".
		//Time to check conditions.

		if (age<18 & age>0) { //Checks age from user input.
			System.out.println("You're too young to register.");
			System.exit(0); //Leaves program. If instead of println I used myText (variable) and gave it value "You're too young to register"
			// and then told program to System.exit(0), text would never appear on the screen, because program would be shut down and we
			// would never get to return.
		}
		

		else if (age > 17 & age < 60) {
			myText = "Welcome bro."; 
		}
		else if (age > 60 & age < 120) {
			myText = "Welcome old man!";
		}
		else {
			myText = "You are a bad liar.";
			System.exit(0);
			 //I wish I know how to repeat the process, without using loops or recurse. You know, something created on my own.
			//But with or without it, this still works like the charm and that's the point. First learn, then Master.
		}
		
		return myText;
	
	}

}
