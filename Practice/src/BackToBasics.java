import java.util.Scanner;
public class BackToBasics {

	public static void main(String[] args) {
		
		Scanner bih = new Scanner(System.in);
		
		// Passing/Returning Arrays in Methods
		


		/** Reverse Array */
		
		int[] laptop = {1,3,5,7,9}; // pa ja zato što je array.lenght = 5 elemenata i kad kazes i = 5, i >=0, to je 6 elemenata
		// od nule do 5 i onda padne program
		
		for (int i = laptop.length-1; i >= 0 ; i--) {
			System.out.println(laptop[i]);
		}
		
		
		
		/**Copy elements of one array to another*/
	/*	
		int[] slusalice = {1,3,4,5,9,11};
		int[] mikrofon = new int[6];
		
		for (int i = 0; i < slusalice.length; i++) {
			mikrofon[i] = slusalice[i];
		}
		slusalice[3]=10;
		//System.arraycopy(slusalice, 2, mikrofon, 0, slusalice.length-2);
		
		for (int i = 0; i < slusalice.length; i++) {
			System.out.println(slusalice[i]);
		}
		System.out.println("_________________________");
		for (int i = 0; i < mikrofon.length; i++) {
			System.out.println(mikrofon[i]);
		}
		
		*/
		
		//Algoritmi -> najveæi element niza i njegov index
		
		/*
		int a,b;
		int solja[] = {1,3,5,7,9};
		
		a = solja[0];
		b = 0;
		int i = 0;
		
		while(i<solja.length) {
			if (a<solja[i]) {
				a=solja[i];
				b=i;
			}
			i++;
		}
		System.out.println("Najveæi element niza je " + a);
		System.out.println("Njegov index je broj " + b);
		/*
		/*
		
		__________________________________
		__________________________________
		
		// dat je niz xyz
				// koliko brojeva niza je djeljivo sa brojem n
				// nadji sumu svih brojeva
				
		
		System.out.println("Unesi neki broj");
		int broj = bih.nextInt();
		int sum = 0;
		
		int mouse[] = {4,7,3,2,6,0,5,1,8,9,12}; // 4, 2, 6, 0, 8 + 12 = 32
		
		int counter = 0;
		
		
		for (int i = 0; i<mouse.length; i++) { // int i = 0; i<mouse.length; i++ == int i : mouse ?
			
			if (mouse[i] % broj == 0) {
				counter++;
				sum = sum + mouse[i];
				
			}		
		}
		
		System.out.println("Dati niz je djeljiv sa unesenim brojem " + broj + " *" + counter + "* puta.");
		System.out.println("Suma svih djeljivih brojeva datog niza je " + sum);
		
		
		/*
		____________________________________
		_____________________________________
		
		
		
		 Suma svih clanova niza
		
		int[] februar = {3,2,5,7,9};
		int sum = 0;
		for (int i = 0; i<februar.length; i++) {
			sum+=februar[i];
		} 
		System.out.println("SUM is " + sum); 
		____________________________________
		_____________________________________
		/*
		
	/* Tabela Index vs vrijednosti niza	
		
		System.out.println("Index\tVrijednost");
		for (int i = 0; i<februar.length; i++) {
			System.out.println(i + "\t" + februar[i]);		
		} */
		
		/* Kreiranje niza i ispis clanova niza
		
		 


        /*
		
		______________________________________
		______________________________________
		
		Ispisivanje clanova niza
		
		int laptop [] = {1,3,5,8,9};
		
		System.out.println("Clan niza sa indexom broj 3 je "+ laptop[3]);
		System.out.println("Isprintaj sve clanove niza");
		
		for (int i = 0; i<laptop.length; i++) {
			System.out.println(laptop[i]);
		} 
		
		OR
		
		
		 for (int i = 0; i < 5; i++) { //ovako mogu reci tacno koliko clanova zelim
		 System.out.println(laptop[i]); } //a mogu i napisati laptop.lenght-(neki broj);
		 
		 */
		
		
		bih.close();
	
	}

}
