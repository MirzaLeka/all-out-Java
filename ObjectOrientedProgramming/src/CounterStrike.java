
public class CounterStrike {

	String DEAGLE;
	
	//you can't create object in private constructor
	
	public void price() {
		
		System.out.println("Price of Desert Eagle is : " + DEAGLE);
		//iako je metoda prva po redu prvo æe se ispisati ono što je u konstruktoru.
	}
	
	public CounterStrike() {
		DEAGLE = "600$";
		
		//kada se kreira objekat, objekat æe odmah pozvati konstruktora
		//ako nismo samo napravili konstruktora ili ako smo ga napravili i prazan je, program nece nista pokrenuti
		//ako nesto ima u njemu prvo ce se to pokrenuti/ispisati pa tek onda ostatak programa
		
		//imamo dva tipa konstruktora:
		//default i parametizirani. Parametizirani trazi neki parametar u objektu kako bi se pokrenuo (parametar istog tipa parametra u argumentu konstruktora)
		//default je default
		
		System.out.println("Go go go!");

		/* ovo je default konstruktor koji se sam napravi sa svakim novim objektom. 
		 * Da smo napravili String deagle ili int ili bilo koji drugi tip varijable unutar jedne od metode (main ili neke druge)
		 *  i nismo datoj varijabli zadali nikakvu vrijednost (npr int deagle = 5;) i nakon toga rekli programu da ispiše deagle (println(deagle)) 
		 *  program bi vratio error i rekao da varijabla deagle nije inicjalizirana tj da nema nikakvu vrijednost.  
		 * 
		 * Ali ako našu varijablu deagle kreiramo van neke od metoda, tj. unutar klase, kreiramo novu metodu i objekat unutar main-a za istu, te 
		 * u datoj metodi ispišemo varijablu DEAGLE (println(DEAGLE)) dobit æemo vrijednost null ako je DEAGLE bio String, odnosno 0 ako je bio int i slièno.
		 * To je zato što varijabli DEAGLE nismo dali nikakvu vrijednost. 
		 *
		 *
		 * Zato kreiramo default konstruktor (iako ga vec imamo po defaultu). Unutar konstruktora mi možemo dati DEAGLE varijabli neku vrijednost i 
		 * onda kada pokrenemo program neæe više pisati null nego vrijednost koju smo dali u konstruktoru. Èak i da je DEAGLE varijabla kada smo je kreirali u
		 * klasi imala svoju vrijednost i da smo u konstruktoru promjenili vrijednost program æe ispisati vrijednost koja je u konstruktoru, jer prati redoslijed.
		 *
		 * Treba napomenuti da ako u nastavku koda promjenimo vrijednost DEAGLE varijable, tipa da u nekoj od metoda napišemo DEAGLE = "400$"; da æe se promjeniti
		 * vrijednost varijable DEAGLE u odnosu da onu koju smo unijeli u default konstruktoru.
		 * 
		 * NAPOMENA:
		 * Konstruktor se ne poziva!
		 */
		
		
	}
	
	public CounterStrike(String s) { //overloading constructor (just as overloading a method)
		/*
		 * Ako pravimo jos jedan konstruktor, nas novi konstruktor ne smije imati iste parametre kao onaj predhodni, tj. svaki novi mora imati svoje parametre.
		 * Da bismo aktivirali vrijednost koja se nalazi u novom konstruktoru moramo unutar argumenta objekta (...) napisati neku vrijednost parametra naseg konstruktora.
		 * Npr drugi konstruktor za parametar uzima String s. Nakon toga unutar argumenta objekta napišemo neki tekst tipa String "..." i tako damo programu do znanja da 
		 * æemo raditi sa drugim konstruktorom jer æe on prepoznati parametar = OVERLOADING. 
		 * 
		 * Isto bi vazilo da je int x u argumentu i mi ubacimo broj 5 u argument objekta. Mozemo i vise parametara imati unutar argumenta objekta, kao i konstruktora.
		 * 
		 * KONSTRUKTOR služi da lociramo memoriju i da inicjaliziramo varijable.
		 * Konstruktor ne vraæa ništa, ne pišemo èak ni void.
		 * Ime Konstruktora je isto kao i ime klase.
		 */
		
		
		
		DEAGLE = "2500$";
		
	}
	
	public static void main(String[] args) {
		
	CounterStrike store = new CounterStrike(/*"LAUNCHING 2ND CONSTRUCTOR"*/); //CounterStrike, tj. metoda èije je ime isto kao i ime klase zove se konstruktor. ImeKlase ImeObjekta = new Konstruktor()
	store.price(); //Zato kažemo da svaki objekat ima default konstruktor jer ga mi kreiramo kada pravimo objekat.

	}
	


}


