import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.function.ObjDoubleConsumer;

public class LifeLenght {
	public static void main(String[] args) {
		
	    
		
		System.out.print("Unesite godinu roðenja: ");
        Scanner in = new Scanner(System.in);
       Integer god = in.nextInt();
       System.out.print("Unesite mjesec roðenja: ");
       Integer mjesec = in.nextInt();
       System.out.print("Unesite dan roðenja: ");
       Integer dan = in.nextInt();
       
   	Integer danasgod = 2016;
   	Integer danasmje = 10;
   	Integer danasdan  = 21;
	
   	Integer kolikogod;
   	Integer kolikomje;
   	Integer kolikodan;
   	
   	kolikogod = (danasgod - god);
   	kolikomje = (danasmje - mjesec);
   	kolikodan = (danasdan - dan);
   	
   	if (danasdan < dan) {
   		
      //	 (kolikomje==(danasmje-mjesec-1));
        //	 ( kolikodan = danasdan + dan);
           }
   	
   	// 1996 2000 2004 2008 2012 2016
          
   	Integer leap = (kolikogod/4);
   	
       System.out.println("Živite " + kolikogod + " godine, " + kolikomje + " mjeseci i " + kolikodan + " dana.");
	   
       
	}
}
 