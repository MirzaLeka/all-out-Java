import java.util.*;
import fruits.*;

public class tutorial {
	public static void main(String[] args) {

		Scanner nest = new Scanner(System.in);
		
		student konj = new student();
		konj.Nos();
		
	
		
		
		
		// public metodu mozemo koristiti svugdje
		// protected metodu samo u package-u
		// private metodu samo u klasi
		
	//	System.out.println("Insert nums:");
		
		// System.out.println("Zbir je " + add(nest.nextDouble(), nest.nextDouble())); //for some reason this only works for int + int
		// let's try the same with an object.
		
	//	tutorial sat = new tutorial();
	//	System.out.printf("Zbir je %.5f", sat.add(4.11, 3.59)); // YES IT WORKS. JUST USE , instead of . for double input 
		
		
		//	tutorial kesa = new tutorial();
	//	double slon = kesa.add(nest.nextDouble(), nest.nextDouble());
	//	System.out.println(slon); THIS OR
		
		//	tutorial kesa = new tutorial(); THIS
		//System.out.println("Zbir je " + kesa.add(nest.nextDouble(), nest.nextDouble())); // ohoho
		
		
		
		//Možemo i ovako pozvati Overload-anu metodu ali radije koristi objekat jer ovaj int konj gives it away.
	//	int konj = add(nest.nextInt(), nest.nextInt()); // a vjerujem i da je drugi naèin kraæi za pisati. sad æemo provjeriti
	//	System.out.println(konj);

		
		/*	Apple aircraft = new Apple();
		aircraft.drvo = "4m";
		aircraft.Juice(); */
		
	/*	student zavjesa = new student(); //pošto je u istom paketu ne moram pisati public u student klasi
		zavjesa.age = 4;
		zavjesa.introduce(); */
		
/*		student key = new student();
		key.age = 5; // nije public ali je u istom paketu i možemo je pozvati
		key.introduce(); */
		
	//	Nest carrier = new Nest(); znaci preko objekta mozemo pozvati klasu koja je u istom fajlu
	//	carrier.lenovo();

		/*
		 * student boy = new student(); boy.name = "Mirza"; boy.age = 22;
		 * boy.city = "Sarajevo"; boy.grade = 7; boy.school = "OPS School";
		 * 
		 * boy.introduce();
		 * 
		 * student girl = new student();
		 * 
		 * System.out.println("Introduce yourself: "); girl.name =
		 * nest.nextLine(); girl.city = nest.nextLine(); girl.school =
		 * nest.nextLine(); girl.age = nest.nextInt(); girl.grade =
		 * nest.nextInt();
		 * 
		 * girl.introduce();
		 * 
		 * girl.Loop(7);
		 * 
		 * System.out.println();
		 * 
		 * 
		 * //boolean laptop = girl.monitor(); // + if (laptop) // == if (
		 * girl.monitor() )
		 * 
		 * //boolean laptop = girl.monitor(); -> because it's not static I need
		 * object to call the method :D // boolean stol = student.stolica();
		 * 
		 * //because it's in another class and it is static, i need name of a
		 * class to call it
		 * 
		 * if (girl.monitor()) {
		 * System.out.println("aaaaaa"); } 
		 * else {
		 * System.out.println("bbbbbb"); }
		 */

		// try not to call your class/object/method in between classes.

nest.close();
	}
	
	int add(int a, int b) {
		return a+b;
	}
	
	int add(int a, int b, int c) {
		return a+b+c;
	}
	
	double add(double a, double b) {
		return a+b;
	}

}

class Nest {
	
	public void lenovo() {
		System.out.println("Lenovo Z51 is my laptop");
	}

}
