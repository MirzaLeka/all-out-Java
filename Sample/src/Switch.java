import java.util.*;

import javax.swing.GroupLayout.Alignment;

public class Switch {
	public static void main(String [] args) {
		Scanner mirza = new Scanner (System.in);
		
		int x;
		int y;
		
		System.out.println("Unesite koliko Mirza ima godina. ");
		do {
		x = mirza.nextInt();
		
		switch (x) {
		case 22:
			System.out.println("Good Job");
		break;
		default:
		System.out.println("Wrong number. Try again: ");
		break;
		}
		}while(x!=22);
		
		Switch amilaObject = new Switch();
	amilaObject.amila();
	
	Switch_Away JackObject = new Switch_Away();
	JackObject.jackblack();
	

		System.out.println("Thank you for using this lousy program");

	
	}
	

	
public void amila() {
	
	Scanner mirza = new Scanner (System.in);
	int y;
	
	System.out.println("Can you guess how old my sister is?");


	do {
	y = mirza.nextInt();
	
	switch (y) {
	case 22:
		System.out.println("Good Job");
	break;
	default:
	System.out.println("Wrong number. Try again: ");
	break;
	}
	}while(y!=26);
	
	System.out.println("Outstanding!");

	
}
}
