import java.util.*;
public class johnWick {

	int quantity = 1; //zna�i ako je varijabla pripada klasi i �elimo je pozvati unutar neke Metode ne moramo je spominjati u argumentu
	//takva metoda ne�e biti static, �to zna�i da �e nam trebati objekat da pozovemo Metedu u kojoj se nalazi ta varijabla
	
	public static void main(String[] macka) {
		Scanner sun = new Scanner(System.in);
		
		

		johnWick kutija = new johnWick();
		
		for(int i = 1; i <= 10; i++) {
			
			System.out.println("Insert nums: ");
			int nums = sun.nextInt();
			
			if (nums % 2 == 0) {
				kutija.cable();	
			}
			
		}
System.out.println("You're done!");

sun.close();
	}
	
	public void cable() {
		
		quantity++;
		System.out.println("Quantity is " + quantity);
		
	}

}
