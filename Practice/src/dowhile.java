import java.util.*;
public class dowhile {
public static void main(String[] args) {
	Scanner in = new Scanner (System.in);

	try {
		
	
for (int i = 1; i<=10; i++) {
	if (i==5) {
		continue;
	}
	Thread.sleep(500);
	System.out.println(i);

}
	}catch(Exception e) {}
	
}
}
