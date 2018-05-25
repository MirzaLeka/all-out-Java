
public class CountingObjects {

	public static void main(String[] args) {

		BringItOn Boyka = new BringItOn();
		BringItOn Turbo = new BringItOn();
		
		BringItOn.Undisputed(); //ako ubacis samo jedan objekat, npr Boyka ili Turbo onda ce ispisati samo 1 object.
		//zato koristis ime klase da obiljezis citavu klasu
		
		
	}

}

class BringItOn {

	static int counter = 0;

	public BringItOn() {
		counter++;
	}
	
	public static void Undisputed() {
		System.out.println("There are " + counter + " objects in this program.");
	}

}
