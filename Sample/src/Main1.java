
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main1 {

    public static void main(String[] args) {

        System.out.println(
                "    I M E N I K\n" +
                        "    unesite redni broj opcije:\n" +
                        "    1. Unositi nove ljude\n" +
                        "    2. Izlistaj mi sve ljude u imeniku\n" +
                        "    3. Obrisati nekoga\n" +
                        "    4. Pretraga\n" +
                        "    5. IZLAZ");
        Scanner ulaz = new Scanner(System.in);

        List<Profil> imenik = new ArrayList<>();

        imenik.add(new Profil("Ali", "123 456"));
        imenik.add(new Profil("Naida", "5 4 2 1"));
        imenik.add(new Profil("Alma", "72"));

        while (true) {
            System.out.println("Unesite opciju: ");
            int opcija = Integer.parseInt(ulaz.nextLine());
            if (opcija == 1) {
                System.out.println("Unesite ime: ");
                String novoIme = ulaz.nextLine();

                System.out.println("Unesite broj: ");
                String noviBroj = ulaz.nextLine();

                Profil noviPrijatelj = new Profil(novoIme, noviBroj);
                imenik.add(noviPrijatelj);
            } else if (opcija == 2) {
                System.out.println("Vas imenik je: ");
                for (Profil p : imenik) {
                    System.out.println(p.ime + ", " + p.broj);
                }
            } else if (opcija == 3) {
                System.out.println("Unesite ime koje cemo obrisati: ");
                //tacno isto ime
                String trazimo = ulaz.nextLine();
                List<Profil> zaObrisati = new ArrayList<>();
                for (Profil p : imenik) {
                    if (p.ime.equals(trazimo)) {
                        zaObrisati.add(p);
                    }
                }
                for (Profil p : zaObrisati) {
                    imenik.remove(p);
                }
            } else if (opcija == 4) {
                System.out.println("Unesite kljuc za pretragu: ");
                String trazimo = ulaz.nextLine().toLowerCase();
                for (Profil p : imenik) {
                    if (p.ime.toLowerCase().contains(trazimo)) {
                        System.out.println("Nadjen je: " + p.ime +
                                ", a broj je " + p.broj);
                    }
                }
            } else if (opcija == 5) {
                System.out.println("Hvala sto ste koristili nas imenik :)");
                break;
            } else {
                System.out.println("Unesite ispravnu opciju");
            }
        }

    }
}
