
public class StaticAndNot {
	
	String name = "Mirza";
	static String last = "Leka";
	String cizme;
	static int broj = 2;
	int num = 1;
	static int brojac = 0;
	
	public static void main(String[] args) {
		
		//static pripada klasi, non-static pripada objektu.
		
		StaticAndNot obj = new StaticAndNot();
		obj.name = "Ermin"; //name nije static varijabla pa smo morali kreirati objekat i korisiti objekat da pozovemo varijablu name
		
		System.out.println(obj.name);
		
		/*obj.*/last = "Camoviæ"; //last je static varijabla i da bi je pozvali ne treba nam objekat. Medjutim necemo pogrijesiti ako je pozovemo koristeci objekat
		System.out.println(last); //ako je u nekoj drugoj klasi metodu pozivamo preko klase
		
		// A vidiš zato što objekat obj pripada klasi StaticAndNot mi moramo za drugu klasu kreirati poseban objekat. Jer u instanci prvo pišemo ime klase pa onda ime objekta
		
		jawBreaker jba = new jawBreaker();
		jba.cipela = "Addidas"; //Stringu smo dali vrijednost Addidas
		jba.tena = "Nike"; ///kada pozivamo nesto preko objekta moramo mu dati vrijednost ili cemo dobiti error
		
		//statiènu varijablu tena možemo pozvati i na sljedeæi naèin
		
		System.out.println(jba.tena);
		System.out.println(jawBreaker.tena);
		/* System.out.println(jawBreaker.cipela); NE možemo napisati cipela jer cipela pripada objektu */ 

		System.out.println(obj.cizme); //nema veze što nisam dao vrijednost varijabli cizme, mogu samo napisati obj.cizme i odmah je pozivam
	
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		jawBreaker mirza = new jawBreaker();
		jawBreaker ermin = new jawBreaker();
		
		StaticAndNot.mojaMetoda(); //kada pozivamo statiènu metodu koja je pripada onoj klasi iz koje je pozivamo Možemo ali i ne moramo pisati ime te klase
		//da je mojaMetoda bila u klasi jawBreaker npr morali bi pisati imeKlase.mojaMetoda();
			
		StaticAndNot obj2 = new StaticAndNot();
		
		System.out.println("2+2 = " + (broj+broj)); //TODO Observe: statiène varijable su italic 
		System.out.println("1+1 = " + (obj.num+obj2.num)); //za nesatiène varijable moraš napisati koristiti objekat koji pripada toj klasi kako bi koristio te varijable
		System.out.println("1+2 = " + (obj.num+broj));
	
	
		quantity();
		System.out.println("--------------------------------");
		
		obj2.objektnoOrijentisanaMetoda(); //U ovoj situaciji svejedno je koji obj koristimo, 
		// ali ako pravimo neki realni objekat sa realnim atributima logicno je da nece imati iste metode, jer ne mogu i cuko i maca lajati (nema smisla) 
		
		
	}
	
	public StaticAndNot() {
		brojac++; //this is a must
	}
	
	public void objektnoOrijentisanaMetoda () {
		
		System.out.println("1+1 = " + (num+num)); //pušto ova metoda nije static ne moramo pisati ime objekta prije imena varijable
		System.out.println("2+2 = " + (broj+broj)); //ali možemo sabirati i statiène varijable bez ikakvog naglašavanja
		
	}
	
	
	public static void quantity() { //calculates how many objects there are in class
		
		System.out.println("There are " + brojac + " objets in StaticAndNot class.");
	}
	
	public static void mojaMetoda() {
		System.out.println("ovo je moja metoda");

	
	}
	
}

class jawBreaker {
	static String tena;
	String cipela;
	static int counter = 0;
	
	public jawBreaker() {
	//	jackal.counter++;
		counter++; //da bi counter brojao mora biti static int inace ce za svaku instancu napisati 1 object inside, tj krenut ce od nule povecati za 1 i svaki put ponovo krenuti od nule
		System.out.println("This is the " + counter + " object inside jawBreaker class.");
		
		// jawBreaker jackal = new jawBreaker(); //možemo kreirati objekat unutar konstruktora
		//ali nemoj to raditi jer crasha program. samo nastavi kreirati nove objekte dok ne padne
		
	}

	
	
}
