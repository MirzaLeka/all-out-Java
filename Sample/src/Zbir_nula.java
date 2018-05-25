
import java.util.*;

public class Zbir_nula {
// neka korisnik unosi brojeve. kada korisnik unese broj 0 ispisati zbir do sad upisanih brojeva.
    public static void main(String[] args) {
	Scanner unos = new Scanner (System.in);

        int broj;
        int zbir = 0;


        do {
            System.out.print("Unesi broj: ");
            broj = unos.nextInt();
            zbir = zbir + broj;

        }while (broj!=0);
        System.out.print("Zbir je " + zbir);


    }
}
