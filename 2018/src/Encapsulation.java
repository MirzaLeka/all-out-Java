
public class Encapsulation {

	private int age = 24;
	String name = "Mirza";
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}

}

class Example {
	


public static void main(String[] args) {

	Encapsulation e = new Encapsulation();
	System.out.println(e.getAge());

}

}
