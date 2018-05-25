
import java.util.*;

public class Array_vs_ArrayList {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
	
		System.out.println("Insert nums:");
		
		ArrayList<Integer> nest = new ArrayList<Integer>();
		for(int i = 1; i<=10; i++) {
			nest.add(in.nextInt());
			System.out.println("-");
		}
		
		for (int i = 0; i < nest.size(); i++) {
			System.out.println(i + " " + nest);
		}
	
		System.out.println("---------------------");
		
		for (int i = 0; i < nest.size(); i++) { //ali ovo moze za sve tipove. Bravo Mirza!
			System.out.println(nest.get(i));
		}
		
		System.out.println("---------------------");
		
		for (int i : nest) { //ovo moze samo za int type
			System.out.println(i);
		}
		
		int semir = nest.size();
		
		System.out.println("Current size of an ArrayList is " + semir);
		
		System.out.println("---------------------");
		
		System.out.println("The size of an array is " + nest.size());
		
		System.out.println("Now I know the difference :D.\n"
				+ "Let's see what else is going on here.");
		
		System.out.println("---------------------");
		
		System.out.println("Wanna remove something?");
		nest.remove(in.nextInt());
		
		System.out.println("Elements left are: ");
		
		for (int i = 0; i < nest.size(); i++) {
			System.out.println(nest.get(i));
		}
		
		System.out.println("---------------------");
		
		System.out.println("What do you want to add next?");
		nest.add(in.nextInt(), in.nextInt()); // index, broj
		nest.add(23); //just number
		nest.add(2, 33); // index, number
		
		System.out.println("Here we go again!");
		
		System.out.println("The size of an array is " + nest.size());
		
        System.out.println("---------------------");
		
		for (int i = 0; i < nest.size(); i++) {
			System.out.println(nest.get(i));
		}
		
		System.out.println("---------------------");
		
		nest.clear();
		
		
		
		System.out.println("The size of an array is " + nest.size());
		
		
	}

}
