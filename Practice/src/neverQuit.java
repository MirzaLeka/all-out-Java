
public class neverQuit {
public static void main(String[] args) {
	
	try {
		System.out.println("I didn't succeed because I knew the answer.");
		Thread.sleep(3000);
		System.out.println("I succeed because I didn't want to give up while searching for it.");
	}catch (Exception e) {}
}
}
