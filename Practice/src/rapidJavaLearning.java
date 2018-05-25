
public class rapidJavaLearning {
	
	String name;
	
	private int age;
	
	public static void main(String[] args) {
		
		rapidJavaLearning rjl = new rapidJavaLearning("Mirza");
		
		System.out.println("My name is " + rjl.name);
		rjl.function("47");
		
		System.out.println(rjl.age);

	}
	
	rapidJavaLearning(String name) {
		this.name = name;
		
		System.out.println("My real name is  " + this.name);
		
	}
	
	void function(String name) {
		this.name = name;
		System.out.println("My codename is " + this.name);
	}
	

	void getAge() {
		age = 4;
	}

		

}

