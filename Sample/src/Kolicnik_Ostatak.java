import java.util.Scanner;
public class Kolicnik_Ostatak {
public static void main(String args []) {
	Scanner in = new Scanner (System.in);
	
int a,b, kolicnik,ostatak;
System.out.println("Unesi a: ");
a = in.nextInt();
System.out.println("Unesi b: ");
b = in.nextInt();
kolicnik=a/b;
ostatak=a%b;
System.out.println("Kolicnik je " + kolicnik + " a ostatak je " + ostatak);
}
}
