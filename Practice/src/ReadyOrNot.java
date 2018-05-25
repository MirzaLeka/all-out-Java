import java.util.Random;

public class ReadyOrNot {

	public static void main(String[] args) {
		/**Mozes napraviti da je broj redova neki math.random(x) kojeg ces convert u int, ubaciti  for loop i on ce svaki put isprintati drugaciji broj kolona   */ 
		
		
		double d = Math.random()*10;
	//	int numOfRows = Integer.valueOf(d);
		

		Random rand = new Random();
		//TODO conv it into double
		 int numOfRows = rand.nextInt(40)+1;
		double a = (rand.nextInt(50)+1);
		double b = (rand.nextInt(50)+1);
		double c = Math.abs(a-b);
		
		//String leftAlignFormat = "| %-15s | %-13d | %-10i %n";

		System.out.format("+-----------------+---------------+------------------------------+%n");
		System.out.format("|  Server Report  |  Last Update  |  Difference between the two  |%n");
		System.out.format("+-----------------+---------------+------------------------------+%n");
		for (int i = 0; i < numOfRows; i++) {
		System.out.format("|     %.3f      |    %.3f     |           %.3f             |",a,b,c);
		System.out.println();
		}
		System.out.format("+-----------------+---------------+------------------------------+%n");

		//StringBuilder sb=new StringBuilder();
		
		
	
	
// System.out.println(Json());		
	}
	
	/*	
	static String Json() {
		return "hello";
	}
	*/
	
}
