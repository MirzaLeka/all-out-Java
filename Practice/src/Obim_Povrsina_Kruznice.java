import java.util.*;
import java.lang.*;
public class Obim_Povrsina_Kruznice {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int value = 3;
		
		System.out.println("Unesite obim kru�nice:");
		int Obim;
		double JustDoIt = Povrsina(Obim = in.nextInt()); 
		
		System.out.printf("Obim kruga je " + Obim + ", a povr�ina kru�nice iznosi %.2f m^2", JustDoIt);
		
	
		
	}
	public static double Povrsina(int Obim) {
		
		double poluprecnik = Obim/(2*Math.PI);
		System.out.printf("Polupre�nik kru�nice iznosi %.2f m \n\n", poluprecnik);
		double povrsina = (Math.PI*Math.pow(poluprecnik, 2));
		
		return povrsina;
		
	}

}
