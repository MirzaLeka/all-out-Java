import java.util.*;
public class PrintF {

	public static void main(String[] args) {
		
		//Razlika izme�u nextLine i next
		
		
		
		Scanner joe = new Scanner(System.in);
		
		System.out.println("Press ENTER to continue");
		joe.nextLine(); //doesn't work for any other key until you press an ENTER
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter your full name: ");
		String fullName = in.nextLine();
		
		System.out.println("Hello " + fullName + "\n");
		
		//U drugom dijelu programa, de�avalo se da u Outputu program presko�i neki input, uglavnom zadnji (word4) ili da napi�e neku lijevu
		//rije� koja je napisana u nekom od gornjih inputa. 
		//Taj sam problem rije�io tako �to sam kreirao novi Scanner za svaki novi unos.
		
		Scanner red = new Scanner (System.in);
		
		System.out.println("Let's try that again. Enter your full name.");
		String myName = red.next();
		
		//Next Line isprinta �itav unos, tj. �itavu re�enicu. Next isprinta samo prvu rije�.
		
		Scanner green = new Scanner(System.in);
		
		System.out.println("Hello " + myName + "\n");
		

		System.out.println("Enter four words:");
		String word1 = green.next();
		String word2 = green.next();
		String word3 = green.next();
		String word4 = green.next();
		
		//Mo�emo unijeti 4 rije�i od jednom. Mo�emo ih pojedina�no unositi (input, enter, input...), mo�emo dvije ili tri od jednom pa onu
		//zadnju u sljede�em redu, ali program se ne�e pokrenuti dok ne unesemo bar �etiri rije�i. Ako smo kreirali �etiri varijable za unos
		//i unijeli vi�e od �etiri rije�i, program �e ispisati samo prve �etiri rije�i.
		
		System.out.print("Four words you entered are: " + word1 + " " + word2 + " " + word3 + " " + word4);
	
		//I u ovom dijelu se de�avalo da program magi�no presko�i input, pa umjesto da program zatra�i od korisnika da unese ime,
		//program sam napi�e koje je prvo slovo, ali ne imena, ve� zadnje rije�i koju smu unijeli (word4).
		//Jo� jedan Scanner
		
		Scanner blue = new Scanner(System.in);
		
		System.out.println("\nRe-enter your name please:");
		String nameAgain = blue.next();
		char letter = nameAgain.charAt(0);
		
		
		
		System.out.println("First letter of your name is " + letter);

		//Na kraju zatvorimo sve Scannere jer nam vi�e ne trebaju. - Nije Obavezno.
		
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
