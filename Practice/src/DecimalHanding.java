
import java.text.DecimalFormat;
import java.lang.*;

public class DecimalHanding {

	public static void main(String[] args) {
		
		String mojString = ".";
		int counter = 10;
		
	for (int i = 1; i <= counter; i++) {
		mojString = mojString + "0";
	}
		
		/**I LOVE THIS!*/
		//substring za string koji ti treba i onda za svako slovo radis charAt
		double number = 3.14159261111;
		DecimalFormat numberFormat = new DecimalFormat(mojString);
		System.out.println(numberFormat.format(number));
		
		String str = "Mirza";
	//	String xyz = "1";
		String niz[] = {};
		
		try {
			for(int i = 1; i < str.length(); i++) {
				niz[i].equals( str.charAt(i));
				
			}
			for(int i = 0; i < niz.length; i++) {
				System.out.println(niz[i]);
			}
			
		}catch (IndexOutOfBoundsException e) {}
		
		
		/**(DONE) Mogao bih varijablu tipa string i svaki put kada se numOfDecimals poveca da se konkaterira parametar za jednu nulu */
		
/*	NEMA POTREBE ZA OVIME
 *   	double number = 0.9999999999999;
		 DecimalFormat speedPattern = new DecimalFormat("00.00");
	        int gearRadius = 100;
	        double pi = Math.PI;
	        int cadence = 90; */
		

	}

}
