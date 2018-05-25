
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.function.ObjDoubleConsumer;

public class Email {
    public static void main(String[] args) {

            System.out.print("Unesite email \n");
            Scanner in = new Scanner(System.in);
            String email = in.nextLine();

            if (!email.contains("@")) {
                System.out.println("Email mora imati karakter: '@'.");
return;
            }
         //   if (!email.endsWith(".com")) {
         //       System.out.println("Email mora zavrsiti sa: '.com'");
         //       return;
         //   }
            int pos1 = email.indexOf('@');
           // if (pos1 < 3) {
        //     System.out.println("email mora imati minimalno 2 karaktera prije @ ");
        //       return;
        //   }
        //   if (pos1 > 10) {
        //       System.out.println("email ne smije imati vise od 10 karaktera prije @.");
        //   return;
        //  }
            int pos2 = email.indexOf('.');


            if ((pos2-pos1)>10){
                System.out.println("Maksimalno deset karaktera izmedju '@' i '.nesto'");
                return;
            }
            // arif@bih.net.ba
        // atif@.guardian.co.uk
        // arif@hotmail.com
        // trazimo poziciju izmedju zadnje tacke i zadnjeg karaktera. treba minimalno biti dva, a max 3 karaktera.
        int poszadnjatacka = email.lastIndexOf('.');
        int poszadnjikarakter = email.length() - 1;
        if( !((poszadnjikarakter - poszadnjatacka) <= 3)) {
            System.out.println("Domena mora biti od dva do tri karaktera.");
        return; }

        if (!(pos1 < 64 && pos2 > 2)) {
            System.out.println("moramo imati od 2 do 64 karaktera prije @");
        return; }


        System.out.print("Hello " + email.substring(0, pos1) + " domain je " + email.substring(poszadnjatacka +1));
    }
}