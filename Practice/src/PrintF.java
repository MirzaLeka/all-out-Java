import java.util.*;
public class PrintF {

	public static void main(String[] args) {
		
		//Razlika izmeðu nextLine i next
		
		
		
		Scanner joe = new Scanner(System.in);
		
		System.out.println("Press ENTER to continue");
		joe.nextLine(); //doesn't work for any other key until you press an ENTER
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter your full name: ");
		String fullName = in.nextLine();
		
		System.out.println("Hello " + fullName + "\n");
		
		//U drugom dijelu programa, dešavalo se da u Outputu program preskoèi neki input, uglavnom zadnji (word4) ili da napiše neku lijevu
		//rijeè koja je napisana u nekom od gornjih inputa. 
		//Taj sam problem riješio tako što sam kreirao novi Scanner za svaki novi unos.
		
		Scanner red = new Scanner (System.in);
		
		System.out.println("Let's try that again. Enter your full name.");
		String myName = red.next();
		
		//Next Line isprinta èitav unos, tj. èitavu reèenicu. Next isprinta samo prvu rijeè.
		
		Scanner green = new Scanner(System.in);
		
		System.out.println("Hello " + myName + "\n");
		

		System.out.println("Enter four words:");
		String word1 = green.next();
		String word2 = green.next();
		String word3 = green.next();
		String word4 = green.next();
		
		//Možemo unijeti 4 rijeèi od jednom. Možemo ih pojedinaèno unositi (input, enter, input...), možemo dvije ili tri od jednom pa onu
		//zadnju u sljedeæem redu, ali program se neæe pokrenuti dok ne unesemo bar èetiri rijeèi. Ako smo kreirali èetiri varijable za unos
		//i unijeli više od èetiri rijeèi, program æe ispisati samo prve èetiri rijeèi.
		
		System.out.print("Four words you entered are: " + word1 + " " + word2 + " " + word3 + " " + word4);
	
		//I u ovom dijelu se dešavalo da program magièno preskoèi input, pa umjesto da program zatraži od korisnika da unese ime,
		//program sam napiše koje je prvo slovo, ali ne imena, veæ zadnje rijeèi koju smu unijeli (word4).
		//Još jedan Scanner
		
		Scanner blue = new Scanner(System.in);
		
		System.out.println("\nRe-enter your name please:");
		String nameAgain = blue.next();
		char letter = nameAgain.charAt(0);
		
		
		
		System.out.println("First letter of your name is " + letter);

		//Na kraju zatvorimo sve Scannere jer nam više ne trebaju. - Nije Obavezno.
		
		joe.close(); 
		in.close();
         red.close();
         green.close();
         blue.close();
		
      // %s = String
 		// %d = int
 		// %f = double  %.2f = zaokruzi na dvije decimale
		
	}

}
