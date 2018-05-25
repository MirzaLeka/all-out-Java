import java.util.*;
public class Random_Names {

	public static void main(String [] args) {
		
String nicknames[] = {"Jasper" , "Reaper" , "Dragon" , "Commander" , "Tazz", "Ghost", "Archer", "Xaero" , "Spider" , "Raptor" };


try {
System.out.println("We give random nicknames for every user that joins our network.");
Thread.sleep(1800);
System.out.println();
System.out.print("Your nickname is " +  nicknames[new Random().nextInt(nicknames.length)]);
} catch (Exception e) {}

		
	}
}
