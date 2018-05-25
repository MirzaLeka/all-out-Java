package fruits;

public class ThisKeyword {
	
	String str;

	public static void main(String[] args) {

		ThisKeyword This = new ThisKeyword("Mirza");
		This.metoda();

	}
	
	public ThisKeyword(String str){
		this.str = str;
	}
	
	public void metoda() {
		
		System.out.println("Str je "  + str);
		
		
	}

}
