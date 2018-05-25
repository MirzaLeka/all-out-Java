
public class StaticPart2 {

	String name; //kad bi pisalo static String i static int onda bi pozutili reodvi 10 i 11, jer nam java govori da nema potrebe da 
	int age; //varijablama dajemo vrijednost koristeci prefiks ime objekta
	
	public static void main(String[] args) {
		
		StaticPart2 objekat = new StaticPart2();
		StaticPart2 noviObj = new StaticPart2();
		
		noviObj.name = "Mensur";
		noviObj.age = 22;
		
		objekat.name = "Mirza";
		objekat.age = 22;
		
		//još samo da si pozvao metodu :D
		
		objekat.introduce(); //ispiše se tekst za prvu metodu
		noviObj.introduce(); //ispiše za drugu
		
	}
	
	public void introduce() { // a da je metoda public static void onda bi trazio program prefiks ime objekta
		
		System.out.println("My name is " + name + " and I am " + age + " years old.");
	//	hammer(); -- ovdje možeš pozvati hammer koji je static 
	}
	
	public static void hammer() {
		// introduce(); -- ali ovdje ne možeš pozvati introduce() koji je non-static baš kao što možeš u mainu raditi sa objektima
		System.out.println("Hammer costs 20$");
	}

}
