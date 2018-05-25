import java.util.*;
public class Counter {
public static void main(String[] args) {
	Scanner in = new Scanner (System.in);

int ocjene = 0;
int suma = 0;
double avr;
int djaci;

System.out.println("Koliko ima djaka u vasem razredu?");
djaci = in.nextInt();

for(int i = 1; i<=djaci; i++) {
	System.out.println("Unesite zakljucnu ocjenu " + i + ". djaka." );
	ocjene = in.nextInt();
	
	while (ocjene<1 || ocjene>5) {
		System.out.println("Koga ti BA zezas?");
		System.out.println("Unesite zakljucnu ocjenu " + i + ". djaka." );
		ocjene = in.nextInt();
	}
	suma = suma + ocjene;
}
System.out.println("Suma svih zakljucnih ocjena je " + suma);
avr = suma*1.0/djaci;
System.out.println("Prosjecna ocjena je " + avr);


	

	
/*	int year = in.nextInt();
	int j = 0;
	int i = 2016;
	while (i>=year) {
		i=i-4;
		j++;
	}
	System.out.println("Prezivjeli ste " + j + " prestupnih godina");
	*/

	/*char slovo = 'A';
	while (slovo < 'M') {
	int broj = 1;
	while (broj < 10) {
			System.out.print(slovo + Integer.toString(broj) + " ");
			broj++;
		}
	slovo++;
	System.out.println(" ");
	}
*/
	
}
}
