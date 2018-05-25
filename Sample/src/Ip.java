import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.function.ObjDoubleConsumer;


public class Ip {
	public static void main(String[] args) {
		
		int pos1;
		int pos2;
		int pos3;
		int pos4;
		
		String ip;
		int port;
		
		System.out.println("Primjer validne IP adrese: 195.222.33.146:28962");
		System.out.print("Unesite vasu IP adresu: ");
        Scanner in = new Scanner(System.in);
       ip = in.nextLine();
       
       if ((!ip.contains(".")) || (!ip.contains(":")))
    		   {
    	   System.out.println("Vasa IP adresa nije validna.");
    		  return; } 
       
       //See yourself as someone whose going to be the best
       //I want to learn
       //Make your tutor proud
       
       pos1 = ip.indexOf(".");
       if (pos1!=3) {
    	   System.out.println("Vasa IP ne zadovoljava broj karaktera u prvom slotu.");
    return;   }
       pos2 = ip.indexOf(".");
       if (pos2-pos1>3)  {
    	   System.out.println("Vasa IP ne zadovoljava broj karaktera u drugom slotu.");
    	   return;    	         } 
       pos3 = ip.indexOf(".");
       if (pos3-pos2>2)  {
    	   System.out.println("Vasa IP ne zadovoljava broj karaktera u trecem slotu.");
    	   return;    	         } 
       pos4 = ip.indexOf(":");
       if (pos4-pos3<3)  {
    	   System.out.println("Vasa IP ne zadovoljava broj karaktera u cetvrtom slotu.");
    	   return;    	         } 
       
       System.out.print("Unesite port: ");
       port = in.nextInt();
       
       if ((port<10000) || (port > 99999)) {
    	  System.out.println("Vasa IP adresa ne zadovoljava broj karaktera u portu."); 
       }
       
       System.out.println("Vasa IP adresa je validna.");
       
 
	}
}
