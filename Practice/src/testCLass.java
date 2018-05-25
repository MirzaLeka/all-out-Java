import java.util.InputMismatchException;
import java.util.Scanner;
import java.text.DecimalFormat;
public class testCLass {

	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		/** 
      RETRIEVE FIRST DIGIT FROM A NUMBER
(1) https://stackoverflow.com/questions/2967898/retrieving-the-first-digit-of-a-number
(2) https://stackoverflow.com/questions/34367362/java-get-first-2-decimal-digits-of-a-double
(3) https://stackoverflow.com/questions/2051817/return-first-digit-of-an-integer
		 */
		
	/*
	 * NESTED FOR LOOP
	 * 	ONE FOR STEPEN, ANOTHER FOR PROIZVOD
	 *  kad zavrsi loop tek onda se izvan oba loopa isprinta rjesenje
	 */
		boolean check;
		double prviBroj = 1;
		double drugiBroj = 1;
		String operacija = "";
	
		double x = 5.33;
		String.valueOf(Math.abs((long)x)).charAt(0);
		System.out.println(x);
		
		//WORKS JusT For INT
	     /*	int number = 534;
		    int firstDigit = Integer.parseInt(Integer.toString(number).substring(0, 1));
		    System.out.println(firstDigit); */
		
		do {
		check = true;
		try {
			
			System.out.println("Unesi prvi broj:");
			prviBroj = input.nextDouble();
			
		}catch (InputMismatchException e) {
			System.out.println("Unos nije validan.");
			input.nextLine(); //kad nebi bilo ovog dijela stvorio bi se infinite loop
			check = false;
		}
		}while(!check);
		
		/** OVO NEÆE BITI OVDJE, bit æe u jednoj od MEtoda*/
		
		do {
		check = true;
		try {

		System.out.println("Unesi drugi broj:");
		drugiBroj = input.nextDouble();
			
		}catch(InputMismatchException e) {
			System.out.println("Unos nije validan.");
			input.nextLine(); //koristim nextLine umjesto next ako korisnik unese vise od jedne rijeci
			check = false;
		}
			
		}while(!check);
		
		
		double proizvod = prviBroj*drugiBroj;
		
	//	System.out.println("Proizvod je " + proizvod);
		
		String text = Double.toString(Math.abs(proizvod));
		int integerPlaces = text.indexOf('.');
		int decimalPlaces = text.length() - integerPlaces - 1;
	//	System.out.println("Broj decimala u broju je " + decimalPlaces);
		
		String mojString = ".";
		
	
			for (int i = 1; i <= decimalPlaces; i++) {
				mojString = mojString + "0";
			}
		
			if (proizvod % 1 == 0){
				System.out.printf("Proizvod je %.0f\n", proizvod);
			}
			
			else if (decimalPlaces > 6 ) {
				System.out.printf("Proizvod je %.6f...\n", proizvod);
			}
			
			 if(proizvod > 1000) {
				System.out.println("1,... e3");
			}
			 
			 /* double x = math.pow(10,3); i da skace za x
			  * for int i  = 0; i <= proizvod; i+=x;  
			  *  stepen+=3;
			  */
			
			else { 
				DecimalFormat numberFormat = new DecimalFormat(mojString);
				System.out.println("Proizvod je " + numberFormat.format(proizvod));				
			}
		
		/*
			boolean exit;
			Scanner doMore = new Scanner(System.in);
			
		do {
			exit = false;
			System.out.println();
			System.out.println("Odaberite operaciju: ");
			System.out.println("|  +  |  -  |  *  |  /  |  END  |");
			operacija = doMore.nextLine();
			
			System.out.println("Unesite broj:");
			double nastavi = input.nextDouble();
			
		switch (operacija) {
		case "+":
		proizvod = proizvod + nastavi;
		System.out.println(proizvod);
		break;
		case "-":
		proizvod = proizvod - nastavi;
		System.out.println(proizvod);
		break;
		case "*":
		proizvod = proizvod * nastavi;
		System.out.println(proizvod);
		break;
		case "/":
		proizvod = proizvod / nastavi;
		System.out.println(proizvod);
		break;
		case "END":
		System.out.println("The End");
		exit = true;
		break;
		case "end":
		System.out.println("The End");
		exit = true;
		break;
		default:
		System.out.println("Unos nije validan.");
		break;
		}	
		    }while(!exit);
		doMore.close(); */
		System.exit(0);
		 
		/**URADI KO U DIGITRONU, DA SVAKI PUT KAD PRITISNES NEKU OPERACIJU PONOVO VODI U VEC POSTOJECU METODU I 
		 * PONOVO KUCAS VRIJEDNOST BROJ2 VAR I ONDA SE OPERACIJA VRSI, IZUZEV ZA UNOS "END" */
		/*da sam rekao zaokruzi(printF) na 6 decimala i da je rezultat bio 32,22 on bi napisao 32,22 00 00 jer mu je receno 6.  
		 zato sam koristio DecimalFormat i rekao mu zaokruzi na onoliko kolima ima decimala
		  */			
	
		/**ZAPRAVO AKO JE PROIZVOD VECI OD DOMETA DOUBLE, NAPISI PRVI BROJI ONDA ZAREZE, PA * 10^n i na kraju dodaj zareze */
			//zapravo reci mu da prikaze charAt(0), nakon toga "." pa charAt(for i = 3 to lenght() + 3 tacke ako ima jos decimala * 10 na stepen)
			/** Ali onda ne mogu ponovo mnoziti :(*/
					
	
	}
	
	public static int firstDigit(int n) {
		  while (n < -9 || 9 < n) n /= 10;
		  return Math.abs(n);
		}
	
/* OVO NE RADI!
	public static double inputCheck(double check) {
		
		try {
		 return input.nextDouble();
		}catch (InputMismatchException e) {
			System.out.println("Unos nije validan.");
			check = 0;
			input.nextLine();
			System.out.println(check);
			return check;
		}
		
	} */
	
	

}

/*double d= 234.12413;
String text = Double.toString(Math.abs(d));
int integerPlaces = text.indexOf('.');
int decimalPlaces = text.length() - integerPlaces - 1;
System.out.println(decimalPlaces); */

//if num of decimal places > 1 %.f toliko