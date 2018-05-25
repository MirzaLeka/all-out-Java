import java.util.Scanner;
//import org.apache.commons.lang3.StringUtils;
public class letMeIn {

	public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

/**  REMOVE CHARACTER IN STRING
 https://stackoverflow.com/questions/4503656/in-java-removing-first-character-of-a-string
  https://stackoverflow.com/questions/8846173/how-to-remove-first-and-last-character-of-a-string
  
  https://stackoverflow.com/questions/7438612/how-to-remove-the-last-character-from-a-string
  https://stackoverflow.com/questions/30708036/delete-the-last-two-characters-of-the-string
  */
	
	System.out.println("Enter nums");
	double proizvod = scan.nextDouble();
	
	
	/** Eh sad trazi grsku O_O*/
	
	//	  double x = Math.pow(10,3); /** TREBA Stepen, 10 , n da skace */
	//	   for (int i  = 1; i <= proizvod; i+=x) { //popravi inkrementaciju
			//   stepen+=1;  
			   /** I ne treba manje od proizvoda nego manje od 3 cifre, manje od 6 cifri - jer mi nece trebati samo za 1000, 2000, 5000 */
			   /** posto ce ici do cifara, znaci i ce biti < = broja cifara, npr i <= 3 */
	//	   }
		//   System.out.println("Stepen je 10^" + stepen); 
		  
		   
		   //printa koliko imam cifara cijelih brojeva i koliko decimala
		   
		   /*Konverzija int u String*/		   /**String s = "" + 234.12413;*/

		   String s = String.valueOf(proizvod);
		   System.out.println("String s je " + s);
		   
	//	   System.out.println(proizvod);
		   
		   
		   String[] result = s.split("\\."); //new array result
		   System.out.println("Split made. Result is here " + s);
		    
		    /*konverzija Stringa u int*/       /**int foo = Integer.parseInt("1234");*/
	//	    System.out.println(result[0]);       
		     
		    int foo =  (result[0].length()); //foo je broj cifara Cijelih brojeva
		    System.out.println("Result [0] is " + result[0]);
		    System.out.println("Result [1] is " + result[1]);
		    
		    /** HOW Split Works
		     String str = "004-034556";
          String[] parts = str.split("-"); //creates new array
          String part1 = parts[0]; // 004
          String part2 = parts[1]; // 034556 
		     *  */
		    
		    ///ako je broj = 0, nesto
		    //stepen
		    
/**		    12345 = brojCifri / 2 + 1 , ostatak => 123,45 //mozda bih mogao ovo da izostavim da bude preko 5 cifri
		    123 456 = brojCifri /2, ostatak => 123,356  * E3
		    123 4567 = 1234, 567 // brojCifri / 2 +1   * E3
		    1234 5678 = 1234, 5678 //brojCifri /2  * E4
		    123 456 789 = 12345, 6789 //brojCifri / 2 +1 * E4
		    123 456 7891 = 12345, 67891 //brojCifri / 2 * E5
		    123 456 789 12 = 123456, 78912 * E5
		    
		    Znaci ako proizvod ima Neparan broj cifri onda ces ga isprintati  BrojCifri / 2 + 1 (result[0]) , ostale cifre (result[0])
		    Ali ako proizvod ima Paran broj cifri onda ces ga isprintati kao BrojCifri / 2 (result[0]), ostatak
		    
		    Ako je broj decimala od result[0]= 3 bit ce puta 10^3 
		    Ako je broj decimala result[0] = 4 bit ce puta 10^4
		    Za pet decimala bit ce puta 10^5 itd. Znaci neki for loop 
		    for (int n = 0; n <= brojDecimala od result[0]; n++ )
		    
		   Ili samo n = brojDecimala od result[0]
		    		
		    		What about 175 000, 1750 000 */
		   		    
		    
		    //hajmo nešto probati
		    
		    // ------------ result[0|.charAt(0) *
		    
		    String pokusaj = result[0].substring(1); //zbog ove tacke mogu mu reci isprintaj mi + result[1| ako ga ima
		    
		    int zadnji = Integer.parseInt(result[1]);
		    
		    //e sad treba reci ako nema decimale onda nemoj isprintati onu nulu
		    System.out.println("--------------------------------------------------------------------");
		    
		    //if result 1 == 0 ili ako je to broj = 0
		    if(proizvod < 10 & proizvod > -10) { //ako je proizvod jednocifren broj i nema decimala
		    	System.out.println("New World " + result[0].charAt(0));
		    }
		    else if (result[1].equals("0") ) {
		    	
		    }
		    
		/*    if(result[1] == null) { //reuslt 1 nije null. stoji tacka tu
		    	
		    } */
		    else if(proizvod % 1 == 0) {
		    	System.out.println("Bad World " + result[0].charAt(0) + " . " +  pokusaj);
		    } else {
		    	System.out.println("Hello World " + result[0].charAt(0) + " . " +  pokusaj + result[1]); // WE HAVE A WINNING COMBINATION!	
		    }
		    
		    //i onda spoji sa stepenom
		    //i onda onaj trigger dole
		    //i onda ga zaokruzi na prvi broj, ostali brojevi (max 12 njih) * e
		    
		    
		    
	//	    System.out.println(result[0].length());
	//	    System.out.println(foo);
		/**   System.out.println(result[0].length() + " " + result[1].length()); */
		  
		    System.out.println();
		    
		    /** In the end,	this will only trigger if proizvod > 1000 */

		    int j = 1;
		    int stepen = 0;
		    
		    while(j <= foo) {
		    	stepen++;
		    	j++;
		    }
		    
		    /** samo ubaci Case d % 1 != 0 i da te vodi u sljedeci loop,  - finish this w/ methods*/
		    
		    System.out.println("--------------------------------------------------------------------");
		    
		    int x = 3;
		    String ostaliBrojevi = s.substring(1); //ostaliBrojevi = String s - 1. karakter 
		    System.out.println("Ostali brojevi su " + ostaliBrojevi);
		    System.out.println("Proizvod je " + s.charAt(0) + "." + ostaliBrojevi.substring(0, s.length() - x) + " " +" * 10^" + (stepen-1));
		    
		    /** 
		     Input: Output:
		     1 ----- 1.
		     10 ---- 1.0
		     100 --- 1.00
		     1000 -- 1.000
		     10000 - 1.0000 
		      
		     * */
		    
		    

		   /** Sada ponovo treba napraviti sistem za decimale :((( , npr 6.00 ili 6.*/ 
		    
		    /** Sta se desava sa decimalnim brojevima? */
		    
		    // napravi sistem po kojem ce se ovo smanjivati/povecavati u odnosu na broj decimala. Nešto kao ono ranije
		    
		    /** while i <= brojaCifri stepen++*/ //ti si htio da stepen skace za 3 6 9. sta fali da bude 5 * 10^5
		
	/*	double x = Math.pow(10, 3);
		System.out.println("X je " + x);
		System.out.println("6 + x =" + (6+x));*/
		
	/*	for(int i = 3; i <= 12; i=i+3) {
			for(int proizvod = 6; proizvod < 12; proizvod=proizvod+3 ) { */
				//ili while pproizvod > 6. NE znam
		

	}

}
