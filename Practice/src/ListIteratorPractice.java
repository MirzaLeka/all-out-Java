
import java.util.*;

public class ListIteratorPractice {

	public static void main(String[] args) {

		
		ArrayList<String> names = new ArrayList<String>();
		names.add("Mirza");
		names.add("Ermin");
		names.add("Ibrahim");
		names.add("Mensur");
		names.add("Marty");
		
		ListIterator<String> itr = names.listIterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("--------------------------");
		
		for(int i = names.size()-1; i >= 0; i--) {
			System.out.println(names.get(i));
		}

	}

}
