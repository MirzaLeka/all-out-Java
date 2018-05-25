
public class ContinueUNL {
	public static void main(String[] args) {
		String oLoop = "Current Outer Loop Iteration: ";
		String iLoop = "Current Inner Loop Iteration: ";
		
		coolLabel:
			for(int i = 0; i < 10; i++) {
				System.out.println(oLoop + i);
			
		for (int j = 0; j < 5; j++) {
			if (j == 3) {
				continue coolLabel;
			}
			System.out.println(iLoop + j);
		}
		
			}
	}

}
