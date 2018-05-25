import java.util.*;

public class ExceptionHandling {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		int array[] = {1,3,5,7,9};
		try {
		for(int i = 0; i <= array[i]; i++) {
			System.out.println(i);
		}
		}
				
		catch(IndexOutOfBoundsException e) {
			
			System.out.println("Wrong!");
		}
		
		
		finally{
			System.out.println("Nothing");	
			}

		
		in.close();
		
		

	}

}
