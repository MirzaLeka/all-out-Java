package fruits;

public class Apple {
	public String drvo; // moramo napisati public da bi klasa i u ovom sluèaju String bio dostupan van fruits paketa
	public void Juice() {
		
		// ako imamo public class onda mozemo pozvati tu klasu u drugim paketima
		// ali ako elementi te klase (varijable i metode) nisu public onda im ne moze pristupiti. znaci sve mora biti public
		// public access level i default access level, public svugdje, no public (default) - samo u paketu
		
		System.out.println("2$");
		System.out.println("Drvo je visoko " + drvo);

	}

}
