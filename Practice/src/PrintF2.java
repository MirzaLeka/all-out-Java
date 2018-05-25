import java.util.*;
public class PrintF2 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int value = 5;
		System.out.println("What's your number?");
		
		PrintF2 Sugar = new PrintF2();
		String jawBreaker = Sugar.Candy(value = in.nextInt());

		System.out.printf("So you are the famous agent " + jawBreaker + ". It's so nice to meet you in person.", value);	
		
		in.close();
		
	} 
	
	public String Candy(int value) {
		
		String chocolate = "";
		if (value > 1 & value < 10) {
		chocolate = "%03d";	
		}
		else if (value > 9 & value < 100) {
			chocolate = "%02d";	
		}
		else if (value > 99 & value < 1000) {
			chocolate = "%01d";	
			}
		else {
			System.out.println("This must be some mistake. Your number is wrong. We have a spy!");
			System.exit(0);
		}
		
		return chocolate;
	}

	
}

class Gun {
	
	public static void rifle() {
		
		System.out.println("Fire at will.");
		
		
	}
	
}
