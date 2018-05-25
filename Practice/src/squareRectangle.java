import java.util.*;
public class squareRectangle {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int height; int widith;
	
	System.out.println("Enter height: ");
	height = in.nextInt();
	
	System.out.println("Enter widith: ");
	widith = in.nextInt();
	
	for (int i = 1; i < height; i++) {
		for (int j = 1; j < widith; j++) {
			if (i == 1 || i == height || j == 1 || j == widith) {
				System.out.print("+");	
			}
			else {
				System.out.print("");
			}
		}
		System.out.println("");
	}
}

}
