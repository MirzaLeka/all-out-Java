import java.util.*;
public class mojpokusaj {
public static void main(String[] args) {
	Scanner in = new Scanner (System.in);
	
	System.out.println("Unesi broj");
	int broj = in.nextInt();
	
	for (int row = 1; row <= broj; row++) {
	
		for (int col = 1; col <= broj; col++) {
			
			for (int trd = 1; trd <= broj; trd++)
			System.out.print("1");
		} 
	System.out.println("1");
}
	System.out.println("1");
}
}

//THEORY 1
/*pocne loop 1 i unutar prvog loopa se vrsi drugi loop (istovremeno)
 * gledajuci redoslijed operacija prvo se vrsi drugi loop pa onda sysout iz prvog
 * u sklopu druge petlje mi njemu kazemo od 1 do x (vrijednost) ispisi zvijezdice horizontalno (print)
 * i on ispise *****
 * u sklopu prve petlje, znaci kad po redoslijedu zavrsi drugu pa predje na prvu pise "napravi novi red"
 * 
 * I on to i uradi. Šta? Krene od prvog reda i ispiše sa lijeva na desno ***** (druga petlja), predje u novi red (prva petlja)
 * ,ponovo ispiše *****, novi red ***** i sve tako dok ne zadovolji LOOP
 * Zato se prva Petlja zove Rows, jer ona napravi red (program svakako pocne od prvog reda)
 * Druga se zove Columns jer ona ispisuje s lijeva na desno *****
 * Prva pravi nove redove, druga ispisuje horizontalne *****
 * Ako prva i druga petlja idu do istog broja (<=broj) program ce napraviti isti broj redova i isto toliko puta ce ispisati zvijezdice
 * I napravi se KVADRAT!
 */



