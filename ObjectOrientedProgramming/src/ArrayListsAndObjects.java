
import java.util.*;

public class ArrayListsAndObjects {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		Scanner telefon = new Scanner(System.in);
		
		System.out.println("Insert name, age and school name:");
		
	    ArrayList<mixPart2> mojaLista = new ArrayList<>(); //nisam napisao array list tipa string nego array list klase u kojoj se obj nalazi
		
		mixPart2 Cama = new mixPart2();
		Cama.name = input.nextLine();
		Cama.age = telefon.nextInt();
		Cama.school = input.nextLine();
		
		mojaLista.add(Cama);
		System.out.println("Info saved!");
	//	Cama.LetsSeeIfItWorks();
		
	/*	for (int i = 0; i < mojaLista.size(); i++) {
			System.out.println(i + ". member is " + mojaLista.get(i));
			// OTPUT member is mixPart2@2322404a1 ocito treba convert to String uraditi
		} */
		
		for (int i = 0; i < mojaLista.size(); i++) {
			  mixPart2 k = mojaLista.get(i);
	            System.out.println(k.toString());
		}
		
		input.close();
		telefon.close();

	}

}

class mixPart2 {
	
	String name;
	String school;
	int age;
	
/*	public void LetsSeeIfItWorks() {
		
		System.out.println(name + "\n"
				+ age + "\n"
				+ school); 
		
	} */

}

