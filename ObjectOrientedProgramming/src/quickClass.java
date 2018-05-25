
public class quickClass {

	public static void main(String[] args) {
		
	/*	
	Kid k = new Kid();
	k.najdraziSPORT();
*/
	Parent p = new Kid(); //poziva ili osobine parenta ili zajednicke osobine parenta i kida 
	
		
	}

}


class Parent{
	
	String lastName;
	String eyeColor;
	String hairColor;
	String skinColor;
	String NovaVarijablaP;
	
	void inherited() {
		
		System.out.println("My last name is " + lastName + ". I have " + hairColor + " hair " + ", " + eyeColor + " eyes and my skin is " + skinColor + ".");
		
	}
	
	void najdraziSPORT() {
		System.out.println("Fudbal");
	}
	
	Parent(){
		lastName = "Leka";
		eyeColor = "brown";
		hairColor = "black";
		skinColor = "white";
	}
	
}

class Kid extends Parent {
	
	String novaVarijablaK;
	
	
  Kid() {
	  eyeColor = "blue";
	  hairColor = "brown";
	  
  }
	
  void inherited() {
	  
	  System.out.println("My name is MIRZA");
	  
  }
	
	void najdraziSPORT() {
		System.out.println("Kosarka");
	}
	
	
}