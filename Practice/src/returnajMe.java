
public class returnajMe {

	public static void main(String[] args) {
		
	
		int price = calculatePrice(); //ovdje se poziva, asigna se return vrijednosti varijable i ispod pozivamo tu varijablu
		System.out.println("price is " + price);
		
		String kinderChocolate = createOrderSummary(price); //isto kao gore samo sto prenosimo parametar price
		System.out.println("PrintLn " + kinderChocolate);


		
		//charge phone
		//charge shave machine
		//drink water
		//shave
		
	}
	
	static int calculatePrice() {
		return 5;
	}
	
	static String createOrderSummary(int price) {
		return "The name is Simpson,\n"
				+ "Homer Simpson! Pay up " + price + "$ or go home.";
	}

}
