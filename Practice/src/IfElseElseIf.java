
public class IfElseElseIf {

	public static void main(String[] args) {
		
		int brojFlasa = 12;
		
		if (brojFlasa > 10) {
			System.out.println("Gottcha this time.");
		}
		if (brojFlasa > 0) {
			System.out.println("I've been a ghost my whole life. Time to see if ghost can really disappear.");
		}
		else if (brojFlasa > 0) {
			System.out.println("Names are for friends, so I don't need one.");
		}
		else {
			System.out.println("Who said which quote?");
		}
		
		System.out.println("__________________________________");
		
	/**OBIÈNO KREÆEŠ SA IF-om OD NAJMANJEG BROJA, Npr ||if num < 5, else if num < 10, else|| */
		
		/*
		 * 
   if(num < 5) {
    return "Tiny";
  }
  else if (num < 10){
    return "Small";
  }
  else if (num < 15){
    return "Medium";
  }
  else if (num < 20) {
    return "Large";
  }
  else {
    return "Huge";
  }
  
		 * 
		 */
		
		/**AKO IMA ELSE IF, ONDA MORA BITI I ELSE */
		
	/** Ternary Operator */
		
	System.out.println("\n");
	String name = "Mirza";
	
	String test = name.equals("Suljo") ? "True" : "False";
	
	System.out.println(test);
	
	
		
		
	}

}
