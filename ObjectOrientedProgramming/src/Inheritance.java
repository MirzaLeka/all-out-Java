
public class Inheritance {

	public static void main(String [] args) {
		
		Dog d = new Dog();
		d.allAnimalsHave(); //override method from Animals class
		
		
		Animals an = new Dog();
		System.out.println("-------------");
		an.allAnimalsHave(); //mogu pozvati ovu iz dog-a jer se isto zove kao ona u animalsu
		
		an.polymorphism(); //metoda iz animals klase
		
		//an.ker(); mogu pozvati osobine iz klase Animals ali ne i iz klase dog 
		
	//    Dog dog = new Animals(); This can't be done 
		
		System.out.println("/////////////////");
		
		Animals ok = new Dog(); // ako je gore Dog onda poziva ovu metodu iz dog-a, ali ako je gore animals onda poziva onu iz animals :D
		ok.istaMetoda();
		
		Animals ek = new Animals();
 		//ek.ker(); ovo naravno ne moze pozvati metodu dog klase
		ek.istaMetoda(); //ali ce ovo pozvati istuMetodu iz Animals klase
		
		System.out.println("Sada ce se ponovo ispisati 'Constructor', kao i svaki put kada inicijaliziramo sub ili super klasu\n"
				+ "+ ce se aktivirati i konstruktor klase Dog");
		
		Dog doggy = new Dog();
		
		
		System.out.println("Posto je ovo superklasa ispisat ce se njen knostruktor ali nece konstruktor sub klase");
		Animals any = new Animals();
		System.out.println("Znaci ova zezancija sa Animals an = new Dog(); koristi se kada imamo istu metodu i u sub i super klasi\n"
				+ "te tako mozemo override-ati objektom klase Animals manipulisati istoimenom metodom klase Dog");
		
		
		
		
		
		
	}
	
	
}


class Animals {

	public int legs;
	String gender = "None";
	String name;
	
	void allAnimalsHave() {
		
		System.out.println(name);
		System.out.println(legs);
		System.out.println(gender);
		
	}
	
	void polymorphism() {
		System.out.println("poly");
	}
	
	Animals() {
		System.out.println("Constructor");
	}
	
	private void privateMethod() {
		// you can't inherit me
		System.out.println("I'm a private method");
	}
	
	public void istaMetoda() {
		System.out.println("Ista ANIMALS metoda");
	}
	
	

}

//////////////////////////////////

class Dog extends Animals{
	public void allAnimalsHave() {
		System.out.println("Hey!");
	}
	
	
	Dog() {
	legs = 4;	
	gender = "famale";
	System.out.println("Konstruktor Dog");
		
	}
	
	void ker() {
		
		Animals ann = new Animals();
		ann.name = "tejKer";
		
	}
	
	void dajMiNekuMetodu() {
		System.out.println("La la la la");
	}
	
	public void istaMetoda() {
		System.out.println("Ista DOG metoda");
	}
	
	
}

////////////////////////////////

class trecaKlasa {
	
	
	trecaKlasa() {
		System.out.println("treca Klasa"); //konstruktor se automatski pozove cim napravis objekat date klase
		
	}
	
}

