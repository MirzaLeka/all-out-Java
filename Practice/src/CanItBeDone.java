import java.util.*;
import java.lang.*;

public class CanItBeDone {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		String izvod = "0";
		int faktor = 1;
		int exp = 0;
		String FinalIzvod;
		boolean provjera;
		String fja;
		
		
		//TODO niz funkcija, unesi funkciju sin, unesi drugu, cos, unesi trecu tg etc. dok ne napises cosx ili sinx ili samo x i sl.
		//TODO if funkcija = broj, izvod = 0;
		//TODO unesi više funkcija
		//TODO kombinacije funkcija sincostgx - mozda objekti, metode?

	/*	System.out.println("Koliko funkcija unosite?");
		int broj = in.nextInt();
		
		for (int i = 1; i < broj; i++) {
			
		} */
		
		do {
			
		provjera = true;
		
		System.out.println("Unesite funkciju: ");
		fja = in.nextLine();
	/*	int number = Integer.valueOf(fja);
		
		if (number > 0 || number < 0 || number !=0) {
			System.out.println("Izvod od konstante je nula.");
			System.exit(0);
		} */
		
		switch (fja) {
		
// ne treba ovo fja.equals("TEXT"); jer ima problem sa konverzijom booleana u string
		
		
		case "logx": 
			System.out.println("Unesite vrijednost baze: ");
			int baza = in.nextInt();
		if (baza == 1) {
			System.out.println("Izvod funkcije je +beskonaèan.");
			System.exit(0);
		}
		if (baza == 0) {
			System.out.println("Izvod funkcije je nula.");
			System.exit(0);
		}
			izvod = "1/(x*ln" + baza + ")";
			provjera = true;
		break;
		
		case "lnx": 
			izvod = "1/x";
		provjera = true;
		break;
		
		case "e^x":
			izvod = "e^x";
		provjera = true;
		break;
		
		case "sinx": 
			izvod = "cosx";
		provjera = true;
		break;
		
		case "cosx": 
			izvod = "-sinx";
		provjera = true;
		break;
		
		case "tgx":
			izvod = "1/(1+cos^2 x)";
		provjera = true;	
		break;
		
		case "ctgx":
			izvod = "-1/(1+sin^2 x)";
		provjera = true;
		break;
		
		case "arcsinx":
			izvod = "1/(sqr(1-x^2))";
		provjera = true;
		break;
		
		case "arccosx": 
			izvod = "-1/(sqr(1-x^2))";
		provjera = true;
		break;
		
		case "arctgx":
			izvod = "1/(1+x^2)";
		provjera = true;
		break;
		
		case "arcctgx": 
			izvod = "-1/(1+x^2)";
		provjera = true;
		break;
		
		case "x":
			izvod = "1"; 
		provjera = true;
		break;
		
		case "^x":
			izvod = "^x * ln"; 
		provjera = true;
		break;
		
		default: 
			System.out.println("Funkcija koju ste unijeli nije ispravna.");
		provjera = false;
		break;
		}
		
		}while(!provjera);
		
		System.out.println("Unesite faktor: ");
		faktor = in.nextInt();
		
		if ( fja.equals("^x") & faktor == 1) {
			System.out.println("Izvod funkcije je nula.");
			System.exit(0);
		}
		
		
		if (!fja.equals("e^x")) {
			System.out.println("Unesite eksponent funkcije: ");
			exp = in.nextInt();	
		}
		
	/*	System.out.println("Unesite faktor promjenljive: ");
		int pow = in.nextInt();
		
	    System.out.println("Unesite eksponent promjenljive: ");
		int deg = in.nextInt(); */
		
		
		if (fja.equals("^x") & exp == 1) {
			FinalIzvod =  faktor + izvod + faktor;
			System.out.println("Izvod funkcije je " + FinalIzvod);
			System.exit(0);
		}
	
		
		
		if (fja.equals("e^x")) {
			FinalIzvod = faktor + " * " + izvod;
			System.out.println("Izvod funkcije je " + FinalIzvod);
			System.exit(0);
		}
		
		if (faktor == 1 & exp == 1) {
			FinalIzvod = izvod;
			System.out.println("Izvod funkcije je " + FinalIzvod);
			System.exit(0);
		}
		
		if (faktor == 1 & exp == 1 & fja.equals("x")) {
			FinalIzvod = "1";
			System.out.println("Izvod funkcije je " + FinalIzvod);
			System.exit(0);
		}
		
		if (fja.equals("x") & exp == 2) {
			FinalIzvod = exp * faktor + " * " + fja;
			System.out.println("Izvod funkcije je " + FinalIzvod);
			System.exit(0);
		}
		
		if (fja.equals("x") & exp > 2) {
			FinalIzvod = exp * faktor + " * " + fja + "^" + (exp-1);
			System.out.println("Izvod funkcije je " + FinalIzvod);
			System.exit(0);
		}
		
	/*	if ((exp + fja + izvod).equals("2 * sinx * cosx")) {
			System.out.println("Izvod funkcije je " + (faktor +  "*" + (exp + fja + izvod)) + "odnosno " + faktor + "sin2x.");  
			System.exit(0);
		} */
		
		if (exp == 2) {
			FinalIzvod = exp * faktor + " * " + fja + " * " + izvod;
			System.out.println("Izvod funkcije je " + FinalIzvod);
			System.exit(0);
		}
		
	/*	if (exp == 2 & pow > 1) {
		//	FinalIzvod = exp * faktor + 
			FinalIzvod = exp * faktor + " * " + fja + " * " + izvod;
			System.out.println("Izvod funkcije je " + FinalIzvod);
			System.exit(0);
		}  */
		
		if (exp > 2) {
			FinalIzvod = exp * faktor + " * " + "(" + fja + ")" + "^"+ (exp-1) + " * " + izvod;
			System.out.println("Izvod funkcije je " + FinalIzvod);
			System.exit(0);
		}
		
		
		
		FinalIzvod = faktor + exp + izvod; 
		
		if (exp == 1) {
			FinalIzvod = faktor + " * " + izvod;
			System.out.println("Izvod funkcije je " + FinalIzvod);
			System.exit(0);
		}
		
		if (fja.equals("^x") & (exp == 1 )) {
			FinalIzvod = izvod;
			System.out.println("Izvod funkcije je " + FinalIzvod);
			System.exit(0);
		}
			
	//	System.out.println("Izvod funkcije je " + FinalIzvod);
		
		//nemoj ovako da pravis za svaku funkciju posebno svaku mogucu vrstu
	//	System.out.println("Prvi izvod funkcije je " + (faktor*exp) + "* (" + izvod + ")^" +  (exp-1));
		
	
		} 
	}