
public class Coffee {

	boolean Empty = false;
	
	public static void main(String[] args) {
		
		Coffee coffee = new Coffee();
		
		if(coffee.Empty) {
			coffee.Refill();
		}
		else {
			coffee.Drink();
		}

	}
	
	void Refill() {
		System.out.println("Refill cup!");
	}
	
	void Drink() {
		System.out.println("Drink!");
	}

}

//I am a software developer