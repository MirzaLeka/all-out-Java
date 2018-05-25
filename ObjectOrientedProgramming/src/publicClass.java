
import fruits.privateFruit;

public class publicClass {
	
	public static void main(String[] args) {
		
		privateClass obj = new privateClass();
		
		
		//	obj.name = "Mirza"; NE mogu pristupiti ovome jer je private varijabla
	//	obj.age = 22; AGE nije private i tu varijablu mogu mjenjati

		
		//ali ono što mogu jeste pozvati metodu u kojem se spominju ove dvije varijable
		
//		obj.introduce();
		////////////////////////////////////////////////////////////////////////////////////////////////////
		
	//**Output: My name is null and I am 22 years old.** Zato sto nemamo pristup name varijabli i samim tim ne mozemo vidjeti njenu vrijednost
		//Ali ako u deklaraciji varijable napisem njenu vrijednost, Mirza i 22, onda ce ispisati i Mirza i 22 iako je private
		//Ustvari to je mozda zato sto ja ne mogu mjenjati vrijednost private varijable u drugoj klasi ali ako je vec ima vrijednost mogu je pozvati
		
		//NE BA. Introduce je public i zato mozemo to uraditi. Promjeni na private pa vidi sta ce se desiti. Ne možeš je pozvati!
		//a da je bila metoda introduce Static onda bi i varijable trebale biti static da bih mogao napisati u introduce metodi ili da napisem obj.name i obj.age
		//name-u sam dao vrijednost ali opet se ne moze pozvati koristeci objekat, *obj.name*
		
		
//////////////////////////////////////////////////////////////////////////////////////////////////

	/* Napravimo Public metodu (setName) koja ima parametar tipa String. Izjednacimo taj parametar (iname) sa varijablom name i kasnije,
	 * kao sto je gore isto, introduce metoda public, i kasnije pozovemo metodu setName, damo joj vrijednost i to ce isprintati jer je MEtoda Public */	
		obj.setName("Mirza"); 
		obj.age = 22;
		obj.introduce();
		
		obj.insertHeight(200);
	
		// 1. iz drugog paketa sam importao klasu privateFruit
		// 2. private weight varijablu sam ubacio u public metodu sa parametrom istog tipa kao i varijabla
		// 3. weight = x -> dao weight varijabli vrijednost x-a.
		// 4. pozvao metodu i u parametar upisao vrijednost x-a
		privateFruit lampa = new privateFruit();
		lampa.insertWeight(75);
	
		///////////////////////////////////////////////////////////
		
		/*Ne mogu pozvati metodu Nest71 jer metoda private*/
		// obj.Nest71();
		/*Ali ako metodu Nest71 stavim u jednu od public metoda, npr introduce, onda mogu pozvati metodu Nest71 tako što æu pozvati metodu introduce*/
	//		obj.introduce();
		
		//NOW Using Get and Set
		obj.introduce();
		
		
		
		
		
		
	
		
	

	}

}
