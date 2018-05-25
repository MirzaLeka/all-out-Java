
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.function.ObjDoubleConsumer;

public class EmailOriginal {
    public static void main(String[] args) {
    	    
    	boolean valid;
            do {
    	    valid=true; 
    	    System.out.print("Unesite email \n");
            Scanner in = new Scanner(System.in);
            String email = in.nextLine();

            if (!email.contains("@")) {
                System.out.println("Email mora imati karakter: '@'.");
                valid = false;
                continue;
            }
            if (!email.endsWith(".com")) {
                System.out.println("Email mora zavrsiti sa: '.com'");
                valid = false;
                continue;
            }
            int pos1 = email.indexOf('@');
            if (pos1 < 3) {
                System.out.println(" email mora imati minimalno 2 karaktera prije @ ");
                valid = false;
                continue;
            }
            int pos2 = email.indexOf(".com");
            if ((pos2-pos1)<3){
                System.out.println("Minimano dva karaktera izmedju '@' i '.com");
                valid = false;
                continue;
            }
            }while( !valid );

        System.out.print("Vas email je kreiran.");
    }
}