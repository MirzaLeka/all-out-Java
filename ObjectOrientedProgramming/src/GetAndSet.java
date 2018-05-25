
public class GetAndSet {

	public static void main(String[] args) {

		Two num2 = new Two();
		num2.setName("Mirza");
		System.out.println("My name is " + num2.getName());
	}

}

class Two{
	
	private String name;
	
	String getName() { //gets value of name
		return name;
	}
	
	void setName(String name) { //sets value of name
		this.name = name;
	}
	
}