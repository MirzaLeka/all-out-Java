import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.function.ObjDoubleConsumer;


public class Ime {


    public static void main(String[] args) throws IOException {

        boolean valid;

        do {
        	valid = true;
            System.out.print("Unesite ime: ");
            Scanner in = new Scanner(System.in);
            String ime = in.nextLine();

            if (ime.trim().length() < 3) {
                System.out.println("Ime mora biti duze od 3 slova. \n");
               valid = false;
                continue;
            }

            if (ime.trim().length() > 20) {
                System.out.println("Ime mora biti krace od 20 slova. \n");
                valid = false;
                continue;
            }

            char c = ime.trim().charAt(0);

            if (!Character.isUpperCase(c)) {
                System.out.println("Ime mora poceti velikim slovom.");
                valid = false;
            }
            
            if (!Character.isAlphabetic(c)) {
       			System.out.println("Ime mora sadrzavati samo slova."); 
       			valid = false; }

        }while( !valid );

         System.out.print("Vase ime je validno.");

        return;
    }
}