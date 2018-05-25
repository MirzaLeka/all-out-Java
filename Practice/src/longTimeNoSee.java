
public class longTimeNoSee {

	public static void main(String[] args) {
		
	 
		/** Kreiramo prvi niz, onaj kojeg cemo kopirati */
		int arr[] = {3,7,2,0,1};
		/** Kreiramo drugi, prazan niz, koji ce imati 5 clanova */
		int brr[] = new int[5];
		
		/** Kopiramo clanove prvog niza u drugi*/		
		for (int i = 0; i < arr.length; i++) {
			 brr[i] = arr[i]; // brr[0] = arr[0], brr[1] = arr[1], brr[2] = arr[2]...
		}
		/** Ispisujemo clanove drugog niza */	
		System.out.println("Clanovi drugog niza su: ");
	
		for (int i = 0; i < brr.length; i++) {
			System.out.println(brr[i]);
		}	
	}

}
