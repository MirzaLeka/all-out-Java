import java.util.Scanner;
public class Digitron {

	public static void main(String[] args) {
		
		//thought of the day - RON drzave, cod4 console, iform osnovn, srednj
		
	/**(1) |CANCELED| Dodaj exception za najvece/najmanje rjesenje */	
		/**(2) Dodaj Mogucnost da mozes nakon mnozenja, sabrati, podijeliti ili oduzeti proizvod sa nekim brojem. Isto vazi i za druge operacije. */
		/**(3) |CANCELED| Dodaj exception za najveci/najmani broj koji mozes unijeti i najveci/najmanji broj decimala */
		/**(4) |DONE| Stavi Exception da ako korisnik unese tacku umjesto zareza kod decimalnog broja da mu program kaze da treba zarez */
		/**(5) Ako je rjesenje vece od milion i ako broj ima vise od 3 decimale, onda to zapisi kao JednaCifra.ostale cifre * 10 na stepen.
		 - posto ce stepen biti za milion, milijardu, trilion itd, napravi varijablu koja skace za tri - sa 6 na 9, pa 12. 
		 - znaci for loop, i+3; 
		(6) Ubaci Exception Handling i DecimalFormat za svaki novi input, var nastavi*
		(7) Pokušaj napraviti tako da ne moraš praviti dodatne 4 metode za dodatne operacije
		 */
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Unesi prvi broj: ");
		double broj1 = in.nextDouble();
		String operacija;
		
		Scanner unos = new Scanner(System.in);
		String check;
		double rjesenje = 1;
		double solution = 0;
	//	double decimal = 0;
		
		do {
		System.out.println("Odaberite operaciju:\n"
				+ " +    -    *    /");
		check = "all good";
		operacija = unos.nextLine();
	
		switch(operacija) {
		case "+":
			solution = sabiranje(broj1, rjesenje);	
		if (solution % 1 == 0) { 
			System.out.printf("Zbir je %.0f", solution);
		} 
		else {
			System.out.printf("Zbir je %.2f", solution);	
		}
		break;
		case "-":
			solution = oduzimanje(broj1, rjesenje);	
			if (solution % 1 == 0) { 
				System.out.printf("Razlika je %.0f", solution);
			} 
			else {
				System.out.printf("Razlika je %.2f", solution);	
			}
		break;
		case "*":
			solution = mnozenje(broj1, rjesenje);	
			if (solution % 1 == 0) { 
				System.out.printf("Proizvod je %.0f", solution);
			} 
			else {
				System.out.printf("Proizvod je %.2f", solution);	
			}
		break;
		case "/":
			solution = dijeljenje(broj1, rjesenje);	
			if (solution % 1 == 0) { 
				System.out.printf("Kolicnik je %.0f", solution);
			} 
			else {
				System.out.printf("Kolicnik je %.2f", solution);	
			}
		break;
		default:
		System.out.println("Operacija nije poznata.");
		check = "not good";
		break;
		}

		    }while(check.equals("not good"));
		
	
	unos.close();
	in.close();
	
	/** Try something amazing every time you learn something new */
	}
	
	static double sabiranje(double broj1, double rjesenje){
		
		System.out.println("Unesite drugi broj:");
		Scanner blue = new Scanner(System.in);
		double broj2 = blue.nextDouble();
		
		rjesenje = broj1+broj2;
		blue.close();		
		return rjesenje;
	}
	
	static double oduzimanje(double broj1, double rjesenje) {
		System.out.println("Unesite drugi broj:");
		Scanner blue = new Scanner(System.in);
		double broj2 = blue.nextDouble();
		
		rjesenje = broj1-broj2;
		blue.close();			
		return rjesenje;
	}
	
	static double mnozenje(double broj1, double rjesenje) {
		System.out.println("Unesite drugi broj:");
		Scanner blue = new Scanner(System.in);
		double broj2 = blue.nextDouble();
		
		rjesenje = broj1*broj2;
		blue.close();		
		return rjesenje;
	}
	
	static double dijeljenje (double broj1, double rjesenje) {
		System.out.println("Unesite drugi broj:");
		Scanner blue = new Scanner(System.in);
		double broj2 = blue.nextDouble();
		
		if (broj1<0 & broj2 == 0) {
			System.out.println("-∞");
			System.exit(0);
			
		// return String to decimal ili sta vec
		/**  TRY THIS
		 *  https://stackoverflow.com/questions/12952024/how-to-implement-infinity-in-java
		 *  OR THIS
		 *  https://stackoverflow.com/questions/13317566/what-are-the-infinity-constants-in-java-really
		 *  OR FIGURE OUT HOW TO CONVERT STRING TO DOUBLE
		 * */	
			
		}
		else if (broj1>0 & broj2 == 0) {
			System.out.println("∞");
			System.exit(0);
		}
		else if (broj1 == 0 & broj2 == 0) {
		System.out.println("0 / 0 je neodredjen oblik.");
		System.exit(0);
		}
		
		/** Ako je i jedan od ova tri uslova ispunjen, program tu prestaje raditi, ali se ne gasi*/
		
		rjesenje = broj1/broj2;
		blue.close();		
		return rjesenje;		

		/*
		 * try{
      result = 4/0;
        }  catch(ArithmeticException e) { System.out.println("You divided by zero"); }
		 * 
		 */

	}
	
}

/** 
 SUMMARY
 - If/ Else If/ Else
 - Switch
 - Do While Loop
 - While Loop
 - For Loop
 - Array
 - Metode sa vise parametara
 - Return, charAt, substring, konverzije iz jednog tipa varijable u drugi
  - Objekti
  - Exception Handling
 _____________________________
 
  DIGITRON XD
 * */

