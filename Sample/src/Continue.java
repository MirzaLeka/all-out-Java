import java.util.*;
public class Continue {
public static void main(String[] args) {
 Scanner in = new Scanner(System.in);
 
 System.out.println("Enter num");
 
 int x = in.nextInt();
 
 for (int i = 1; i<x;i++) {
	 if (i%2==0) {
		 continue;
	 }
	 System.out.println(i);
 }
}
}
