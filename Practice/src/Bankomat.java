import java.util.*;
public class Bankomat {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	
	int pin;
	int brpok = 2;
	
	
			try {
				
				System.out.print("D");
				Thread.sleep(100);
				System.out.print("o");
				Thread.sleep(100);
				System.out.print("b");
				Thread.sleep(100);
				System.out.print("r");
				Thread.sleep(100);
				System.out.print("o");
				Thread.sleep(100);
				System.out.print(" ");
				Thread.sleep(100);
				System.out.print("d");
				Thread.sleep(100);
				System.out.print("o");
				Thread.sleep(100);
				System.out.print("�");
				Thread.sleep(100);
				System.out.print("l");
				Thread.sleep(100);
				System.out.print("i");
				Thread.sleep(100);
				System.out.print(" ");
				Thread.sleep(100);
				System.out.print("u");
				Thread.sleep(100);
				System.out.print(" ");
				Thread.sleep(100);
				System.out.print("J");
				Thread.sleep(100);
				System.out.print("A");
				Thread.sleep(100);
				System.out.print("V");
				Thread.sleep(100);
				System.out.print("A");
				Thread.sleep(100);
				System.out.print(" ");
				Thread.sleep(100);
				System.out.print("b");
				Thread.sleep(100);
				System.out.print("a");
				Thread.sleep(100);
				System.out.print("n");
				Thread.sleep(100);
				System.out.print("k");
				Thread.sleep(100);
				System.out.print("u");
				Thread.sleep(150);
				
				
	System.out.println("\n \n");
	System.out.print("   XX\n");
	Thread.sleep(200);
	System.out.print("  XXXX\n");
	Thread.sleep(200);
	System.out.print(" XXXXXX\n");
	Thread.sleep(200);
	System.out.print("XXXXXXXX\n");
	Thread.sleep(200);
	System.out.print(" XX  XX\n");
	Thread.sleep(200);
	System.out.print(" XXXXXX\n");
	Thread.sleep(200);
	System.out.print(" XX  XX\n \n");
		
	Thread.sleep(500);
	System.out.println("Ubacite Va�u karticu.");
	Thread.sleep(1000);
	System.out.print("Provjera...");
	Thread.sleep(500);
	System.out.print("...");
	Thread.sleep(500);
	System.out.print("...");
	Thread.sleep(500);
	System.out.print("...");
	Thread.sleep(500);
	System.out.println("\nKartica je validna. \n");
	Thread.sleep(1000);
	
	System.out.println("Unesite Va� PIN kod: ");
	pin = in.nextInt();
	
	while (pin!=1234) {
		
		if (brpok==0) {
			System.out.println("Nemate vi�e poku�aja. Va�a kartica je blokirana.");
			System.exit(0);
	}
		//JER si mu rekao prvo ispi�i 0 poku�aj, tra�i da unese eh sad iF = 0 onda blokiraj.
		// I onda ti ka�e ovo je nulti poku�aj i ti �ta god da unese�, gotovo je Zato prvo treba IF. REDOSLIJED!!!
		
		System.out.println("PIN kod nije ta�an. Imate jo� " + brpok + " poku�aja.");
		pin = in.nextInt();

			brpok--;		
	}	       	

	Thread.sleep(500);  
System.out.println("\nVa� PIN kod je validan.");
			}catch (Exception e) {} 
opcije();

	
	
}

static void opcije() {
	Scanner in = new Scanner(System.in);
	int x=0;
	int novostanje = 4000;
	int opcija;
	
	try {
		

		Thread.sleep(1000);
	do {
		System.out.println("\nIzaberite opciju: \n"
				+ "1. Stanje Ra�una \n"
				+ "2. Isplata Novca \n"
				+ "3. Izlaz \n");
		opcija = in.nextInt();
		
		
	        while (opcija==1) {
			System.out.println("Stanje Va�eg ra�una je " + novostanje + " KM.");
			Thread.sleep(1000);
			System.out.println("\nIzaberite opciju: \n"
					+ "1. Stanje Ra�una \n"
					+ "2. Isplata Novca \n"
					+ "3. Izlaz \n");
			opcija = in.nextInt();	}
			
		   while(opcija==2) {
			System.out.println("Koliko novca �elite podi�i?");
			x = in.nextInt();
			
			while (x > novostanje) {
				System.out.println("Nemate toliko novca na ra�unu. Poku�ajte neki drugi iznos.");
				x = in.nextInt();  }
			
			while (x < 0) { 
			System.out.println("Unos nije validan. Poku�ajte ponovo.");
			   x = in.nextInt();  }

			novostanje = novostanje - x;
			System.out.println("\nUzmite Va� novac.\n");
			Thread.sleep(500);
			System.out.print("...");
			Thread.sleep(250);
			System.out.print("...");
			Thread.sleep(250);
			System.out.print("...");
			Thread.sleep(250);
			System.out.print("...\n\n");
			Thread.sleep(500);
			System.out.println("Ostalo vam je " + novostanje + " KM na ra�unu.");
			Thread.sleep(1200);
			System.out.println("\nIzaberite opciju: \n"
					+ "1. Stanje Ra�una \n"
					+ "2. Isplata Novca \n"
					+ "3. Izlaz \n");
			opcija = in.nextInt(); 
			
			//Ne pitaj me za�to opet while opcija == 1. Iz nekog razloga ne radi bez toga O.O
			while (opcija==1) {
				System.out.println("Stanje Va�eg ra�una je " + novostanje + " KM.");
				Thread.sleep(1000);
				System.out.println("\nIzaberite opciju: \n"
						+ "1. Stanje Ra�una \n"
						+ "2. Isplata Novca \n"
						+ "3. Izlaz \n");
				opcija = in.nextInt();
	}	} 
		
		
	}while(opcija!=3);


		Thread.sleep(500);
		System.out.println("Hvala Vam �to ste koristili bankomat. Izvadite Va�u karticu.");
	}catch (Exception e) {}
	System.exit(0);

}
}
