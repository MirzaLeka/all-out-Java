import java.util.*;
public class Ar1 {
	public static void main(String[] args) {

		
		 Scanner input = new Scanner(System.in);
		 
		 System.out.println("Enter your name & age:");
		 Konjina(input.next(), input.nextInt()); 
		 
	}
	//ON PREPOZNA ŠTA JE STRING A ŠTA INT BEZ DA MU JA KAŽEM GORE String NAME I int AGE ^_^. How cool is this :D
	public static void Konjina(String name, int age) {
		 System.out.println("My name is " + name + " and I am " + age + " old.");
	 }
		 
		 
	
	//TODO Coolest Programming tricks Ever - this one and Daniel's PRINT... IF/ELSE
//why use methods? well loops and statements are pretty limited with what you can do, while in methods, you create method
	// that does what ever you want it to do
		 
		 /*

	        do {
		        System.out.println("Enter nums for array: ");
		        num = input.nextInt();
	        	
	        	int[] numbers = new int[num];
	        	
	        }while(num!=-1);
	        
	        System.out.println("Nums are stored in an array.");
	        
	     */
/*
	        for (int i = 0; i < numbers.length; i++)
	        {

	            System.out.println("Please enter number");

	            numbers[i] = input.nextDouble();

	        }

	        for (int i = 0; i < numbers.length; i++)
	        {

	            if ( (i%3) !=0){

	                System.out.print("");

	                System.out.print(numbers[i]+"\t");

	            } else {
	                System.out.println("");

	                System.out.print(numbers[i]+"\t");
	            }
	            
	        }

		*/

		
		
	//	int mirza[] = {7,2,3,5,4};
	
		
	//	System.out.println(mirza[3]); //this reads index, not character
		
/*		for(int i = 0; i < mirza.length; i++) {
			System.out.println(mirza[i]);
		} */
		
	/*	for ( i=0; i<array.length; i++){
		    array[i]=scanner.nextInt();
		} */
		
		
	

		
	


}
