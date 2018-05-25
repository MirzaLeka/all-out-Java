
public class mathRandom_FloorCeil_MinMax {

	public static void main(String[] args) {
		
		int minimumValue = 5; //Custom Name
		int maximum = 10;
		
		System.out.println(Math.floor(Math.random()*(maximum-minimumValue+1)+minimumValue));
		
		System.out.println();
		
		System.out.println(Math.floor(3)); //3.0
		System.out.println(Math.ceil(3)); // 3.0
		
		System.out.println();
		
		System.out.println(Math.floor(4.5)); //4.0
		System.out.println(Math.ceil(4.5)); // 5.0
		
		System.out.printf("%.2f",Math.random()); //generates Number between 0 and 1, but hardly ever generates 1

	}

}