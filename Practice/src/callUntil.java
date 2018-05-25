
public class callUntil {
	

	public static void main(String[] args) {

		peroZdero(3);
		System.out.println("izasao sam");
		
	}

	static void peroZdero(int i) {

		if (i > 0) {
		System.out.println("Ja sam Pero Zdero!");	
		i--;
		peroZdero(i);
		}
		
		
	}
	
	
}
