import  java.util.*;
public class swap {
public static void main(String[] args) {
	Scanner in = new Scanner (System.in);
	
	int temporaryvalue = 0;
	System.out.println("Unesi prvi broj");
	int prvibroj = in.nextInt();
	
	System.out.println("Unesi drugi broj");
	int drugibroj = in.nextInt();
	
	temporaryvalue = prvibroj;
	prvibroj = drugibroj;
	System.out.println("Prvi broj je " + prvibroj);
	System.out.println();
	System.out.println("Drugi broj je " + temporaryvalue);
}
}
