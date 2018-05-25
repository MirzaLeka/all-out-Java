import java.lang.Math;
import java.util.*;
public class konj {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		System.out.println(":jorb isenU");
		int x = in.nextInt();
		double S = 1;
		
		
		for (int i = 1; i <= x; i++) {
			S = Math.pow(-1, (i-1))/i;
		}
		
		
		// 1/5 = 0.2 pa je rjesenje 0.2 kad napises x = 5;
		System.out.println("S je " + S);

	}

}
