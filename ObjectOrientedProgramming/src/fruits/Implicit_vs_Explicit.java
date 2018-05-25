package fruits;

public class Implicit_vs_Explicit {
	
	int age;

	public static void main(String[] args) {
		/** If I got this right */
		
		/* Explicit */
		
		System.out.println(explicitMethod(5));
		
		/* Implicit */
		
		Implicit_vs_Explicit myObj = new Implicit_vs_Explicit();
		myObj.age = 5;
		
		//System.out.println(implicitMethod());

	}
	
	private static int explicitMethod(int a) {
		return a*a;

	}
	
	private int implicitMethod() {
		return age*age;

	}

}
