package fruits;

public class This2 {

	public static void main(String[] args) {
		
		Eclipse java = new Eclipse("Ali");
	System.out.println(java.Intelij(""));
	}
}

class Eclipse{
	
	String name = "Arif";
	
	Eclipse(String name){
		
		this.name = name;
		name = "Kenan";		
	}
	
	String Intelij(String name) {
		System.out.println("Name is " + this.name);
		return name;
	}
	
	void cSharp(String name){
		name = "Senad";
	}
	
}

