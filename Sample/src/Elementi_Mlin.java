import java.util.*;

import javax.swing.plaf.synth.SynthSplitPaneUI;
public class Elementi_Mlin {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	
	System.out.println("Na jednom mlinu za �ito prijenos snage od elektromotora do kamena se\n"
			+ "vr�i sa cilindri�nim frikcionim parom. Potrebno je izvr�iti prora�un\n"
			+ "navedenog frikcionog para. \n");
	
	System.out.println("Unesite vrijednost snage na pogonskom motoru (P1; kW): ");
	double snaga = in.nextDouble();
	System.out.println("Unesite broj obrtaja pogonskom motora (n1; 1/min): ");
	double obrmot = in.nextDouble();
	System.out.println("Unesite broj obrtaja kamena (n2; 1/min)");
	double obrkam = in.nextDouble();
	System.out.println("Unesite debljinu gume kojom je oblo�en pogonski to�ak (delta; mm): ");
	double deb = in.nextDouble();
	System.out.println("Unesite brzinu proklizavanja na frikcionom paru (%): ");
	double brz = in.nextDouble();
	System.out.println("Unesite potrebno radno vrijeme dnevno (t; h)");
	double vrijeme = in.nextDouble();
	
	System.out.println("\n"
			+ "RJE�ENJE\n");
	
	System.out.println("1. Prijenosni odnos: \n"
			+ "i = n1/n2 = " + obrmot/obrkam + "\n");
	
	System.out.println("2. Usvaja se pre�nik pogonskog cilindra d1 = 100 mm. \n"
			+ "Pre�nik gonjenog cilindra:\n"
			+ "d2 = d1*i = " + (100*(obrmot/obrkam)) + " mm \n"
					+ "Usvaja se du�ina frikcionog para b = 100 mm. \n");
	
	System.out.println("3. Obrtni moment na pogonskom cilindru: \n"
			+ "Mot = P1 / omega1 = 30P1 / pi*n1 = " + (30*snaga*1000)/(3.14*obrmot) + " Nm \n");
	
	System.out.println("4. Obodna sila na pogonskom to�ku:\n"
			+ "F01 = M01/r1 = " + ((30*snaga*1000)/(3.14*obrmot))/(0.05) + " N \n");
	
	
}
}
