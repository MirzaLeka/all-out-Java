import java.util.Scanner;
public class Povrsina_Kruznice_Shorter {

	public static void main(String[] args) {
		
		Scanner lampa = new Scanner(System.in);
		
		System.out.printf("Unesi polupreènik kružnice: \n");
		System.out.printf("Površina je %.2f m^2", povrs(lampa.nextDouble()));

		lampa.close();
	}
	
	static double povrs(double a) {
		
		return Math.pow(a, 2)*Math.PI;
	}

}
