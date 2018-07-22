
public class BackToConst {
	
	String name;
	int age;

	public static void main(String[] args) {

	
		BackToConst btc1 = new BackToConst("Mirza", 24);
		BackToConst btc2 = new BackToConst("Ermin", 23);
		
		System.out.println(btc2.name);
		
		/** DRY code, same result
		BackToConst zzz1 = new BackToConst();
		zzz1.name = "Amar";
		zzz1.age = 24;
		
		BackToConst zzz2 = new BackToConst();
		zzz1.name = "Emir";
		zzz1.age = 21;
		
		System.out.println(zzz1.name);
*/
	}
	
	public BackToConst()  {
		
	}
	
	public BackToConst(String name, int age)  {

		this.name = name;
		this.age = age;
	
	}

}
