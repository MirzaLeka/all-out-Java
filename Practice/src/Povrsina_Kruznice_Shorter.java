import java.util.Scanner;
public class Povrsina_Kruznice_Shorter {

	public static void main(String[] args) {
		
		Scanner lampa = new Scanner(System.in);
		
		System.out.printf("Unesi polupre�nik kru�nice: \n");
		System.out.printf("Povr�ina je %.2f m^2", povrs(lampa.nextDouble()));

		lampa.close();
	}
	
	static double povrs(double a) {
		
		return Math.pow(a, 2)*Math.PI;
	}

}
