package fruits;

public class Class_B {


	String name;
	
	public void introduce() {
		
		System.out.println("My name is " + name);

		
	}
	
	void loop (int pocetak, int kraj) {
		
		for (int i = pocetak; i <= kraj; i++) {
			
			if (!name.equals("Mirza") | !name.equals("mirza")) {
				System.out.println("You're a liar!");
			}	else {
					System.out.println("Hello " + name);		
				}
		}
	
		
	}
	
	
	boolean isFasting() {
	return true;
	}
	
}
