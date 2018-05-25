
public class printF3 {

	public static void main(String[] args) {
		
		double two = 0.333333;
		double one = Math.random()*100;
		double c = Math.abs(one-two);
		
		System.out.printf("%.3f | %.2f",one, two);
		System.out.println();
		System.out.println(c);

	}

}
