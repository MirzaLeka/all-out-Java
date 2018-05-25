import java.util.HashMap;
import java.util.Scanner;

public class hash {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		HashMap<String, String> colorHash = new HashMap();
		colorHash.put("plava", "#310594"); 
		colorHash.put("zuta", "#FFFF00");
		colorHash.put("crvena", "#D50000");


		System.out.println("Lista osnovnih boja:");
		
		for (String boja : colorHash.keySet()) {
			System.out.println(boja);
		}
		
		System.out.println("Izaberi osnovnu boju:");
		String color = input.nextLine();

		switch (color) {

		case "plava":
			System.out.println("Plava boja je " + colorHash.get("plava"));
			break;

		case "zuta":
			System.out.println("Zuta boja je " + colorHash.get("zuta"));
			break;

		case "crvena":
			System.out.println("Crvena boja je " + colorHash.get("crvena"));
			break;
			
		default:
			System.out.println("Ta boja nije osnovna boja.");
			break;

		}
		

	}

}
