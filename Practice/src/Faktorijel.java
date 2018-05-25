import java.util.*;
public class Faktorijel {
public static void main(String[] args) {
	Scanner in = new Scanner (System.in);
	
	int i;
	int fakt = 1;
	System.out.println("Unesi broj X: ");
	int x = in.nextInt();

for (i=1; i<=x; i++) {
	fakt*=i;
}
	System.out.println("Faktorijel je " + fakt);

}
}
