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
				System.out.print("š");
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
	System.out.println("Ubacite Vašu karticu.");
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
	
	System.out.println("Unesite Vaš PIN kod: ");
	pin = in.nextInt();
	
	while (pin!=1234) {
		
		if (brpok==0) {
			System.out.println("Nemate više pokušaja. Vaša kartica je blokirana.");
			System.exit(0);
	}
		//JER si mu rekao prvo ispiši 0 pokušaj, traži da unese eh sad iF = 0 onda blokiraj.
		// I onda ti kaže ovo je nulti pokušaj i ti šta god da uneseš, gotovo je Zato prvo treba IF. REDOSLIJED!!!
		
		System.out.println("PIN kod nije taèan. Imate još " + brpok + " pokušaja.");
		pin = in.nextInt();

			brpok--;		
	}	       	

	Thread.sleep(500);  
System.out.println("\nVaš PIN kod je validan.");
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
				+ "1. Stanje Raèuna \n"
				+ "2. Isplata Novca \n"
				+ "3. Izlaz \n");
		opcija = in.nextInt();
		
		
	        while (opcija==1) {
			System.out.println("Stanje Vašeg raèuna je " + novostanje + " KM.");
			Thread.sleep(1000);
			System.out.println("\nIzaberite opciju: \n"
					+ "1. Stanje Raèuna \n"
					+ "2. Isplata Novca \n"
					+ "3. Izlaz \n");
			opcija = in.nextInt();	}
			
		   while(opcija==2) {
			System.out.println("Koliko novca želite podiæi?");
			x = in.nextInt();
			
			while (x > novostanje) {
				System.out.println("Nemate toliko novca na raèunu. Pokušajte neki drugi iznos.");
				x = in.nextInt();  }
			
			while (x < 0) { 
			System.out.println("Unos nije validan. Pokušajte ponovo.");
			   x = in.nextInt();  }

			novostanje = novostanje - x;
			System.out.println("\nUzmite Vaš novac.\n");
			Thread.sleep(500);
			System.out.print("...");
			Thread.sleep(250);
			System.out.print("...");
			Thread.sleep(250);
			System.out.print("...");
			Thread.sleep(250);
			System.out.print("...\n\n");
			Thread.sleep(500);
			System.out.println("Ostalo vam je " + novostanje + " KM na raèunu.");
			Thread.sleep(1200);
			System.out.println("\nIzaberite opciju: \n"
					+ "1. Stanje Raèuna \n"
					+ "2. Isplata Novca \n"
					+ "3. Izlaz \n");
			opcija = in.nextInt(); 
			
			//Ne pitaj me zašto opet while opcija == 1. Iz nekog razloga ne radi bez toga O.O
			while (opcija==1) {
				System.out.println("Stanje Vašeg raèuna je " + novostanje + " KM.");
				Thread.sleep(1000);
				System.out.println("\nIzaberite opciju: \n"
						+ "1. Stanje Raèuna \n"
						+ "2. Isplata Novca \n"
						+ "3. Izlaz \n");
				opcija = in.nextInt();
	}	} 
		
		
	}while(opcija!=3);


		Thread.sleep(500);
		System.out.println("Hvala Vam što ste koristili bankomat. Izvadite Vašu karticu.");
	}catch (Exception e) {}
	System.exit(0);

}
}
