
public class smallestNumInArray {

	public static void main(String[] args) {
		
	int[] mouse = {1,2,3,4,5,0,9,8,7,6};
	
	
	int notebook = mouse[0];
	
	for (int i = 0; i < mouse.length; i++) {
		
		if (notebook<mouse[i]) {
			notebook = mouse[i];
		}
		
	}
		System.out.println("Najveæi element niza je " + notebook);
		
	}

}
