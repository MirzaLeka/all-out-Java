
import java.util.*;
public class Main44 {
    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);

        String sifra = "Admin";
        String prviPokusaj;
        int max = 3;
        int brojPokusaja;
        int Deadend;

        //don't repeat yourself :)

        System.out.println("Unesite sifru:");
        prviPokusaj = in.nextLine();

        brojPokusaja = 1;
        Deadend = max - brojPokusaja;
        if (!prviPokusaj.equals(sifra)) {
            System.out.println("Vasa sifra nije validna. Imate jos " + Deadend + " pokusaja.");
        } else {
            System.out.println("Sifra je validna");
            return;
        }
        brojPokusaja = 2;
        Deadend = max - brojPokusaja;
        prviPokusaj = in.nextLine();
        if (!prviPokusaj.equals(sifra)) {
            System.out.println("Vasa sifra nije validna. Imate jos " + Deadend + " pokusaj.");
        } else {
            System.out.println("Sifra je validna");
            return;
        }
        brojPokusaja = 3;
        Deadend = max - brojPokusaja;
        prviPokusaj = in.nextLine();
        if (!prviPokusaj.equals(sifra)) {
            System.out.println("Vasa sifra nije validna. Nemate vise pokusaja.");
        } else {
            System.out.println("Sifra je validna");
            return;
        }
        System.out.println("zzzzz");




    }
}
