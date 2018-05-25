import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.function.ObjDoubleConsumer;

public class Arrays {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
	int	x[]={5, 10, 15, 20, 25};
	System.out.println(x[0]);  
	System.out.println();
	
	String Movement[] = {"forward", "backward", "left", "right", "jump", "crouch"};
	
	System.out.println("Press W to move " + Movement[0]);
	Movement[0] = in.nextLine();
	
	if (!Movement[0].equals("w") && !Movement[0].equals("W")) {
		System.out.println("You have failed this city.");
		System.exit(0);
	}

	System.out.println("GJ");	
	}

}
