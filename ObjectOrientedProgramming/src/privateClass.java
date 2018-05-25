
public class privateClass {

	private String name;
	int age;
	private int height;
	
	public void introduce() {
		Nest71();
	System.out.println("My name is " + name + " and I am " + age + " years old.");
String sablon = getName();
System.out.println(sablon);
	
	
	}
	
	public void setName (String iname) {
		name = iname;
	}
	
	public String getName () {
		return "Amar";
	}
	
	private void Nest71() {
		System.out.println("There is no one in NEST beside me!!!");
	}
	
	public void insertHeight(int x) {
		height = x; //height dobija vrijednost x-a
		System.out.println("I am "+ height + "cm tall.");
		
	}
	
	
	
}
