import java.util.*;
public class StringOfStrings {

	public static void main(String[] args) {
		
		Scanner samsung = new Scanner(System.in);

		//String Concatenation
		
		String a = "It's a";
		String b = " cold";
		String c = " night";
		String d = "Agent" + (4.7*2);
		String e = "Sam " + "Fisher" + c;
		
	//	System.out.println(d);
		
	
		
	//	System.out.println("Unesi tekst");
	//TODO	String input = samsung.nextLine(); 
		
		
		// ali kad mu kažem next, pošto on tad prima samo prvu rijeè nju æe skratiti od 1 do kraja te rijeèi
           // ali ako unesem od veæi index nego što ima prva rijeè program æe pasti. Samo je bitno da index nije premal niti prevelik.
		
		
	// TODO     StringBuffer android = new StringBuffer(input); 
		
		
		//OK mora biti StringBuffer da bi ovo radilo
		
		//TODO REMOVE INDEX (START, END) || REMOVE CHAR AT()
		
	//	System.out.println("Odakle dokle tekst želite izbaciti?");
		
	//	android.delete(samsung.nextInt(),samsung.nextInt()); //izbriši tekst od tog do tog indexa
		// objektu android sam dodijelio vrijednost Stringa input i rekao mu da izvriše sve od tog do tog indexa.
		// i onda mu kažem ispiši to što si dodijelio androidu (tj to što je ostalo), sysout(android)
		
	//	System.out.println("Šta taèno želite izbaciti?"); //ovaj dio može biti unutar granica gornjeg inputa
	//	android.deleteCharAt(samsung.nextInt()); //i program neæe pasti
		
		
//		reinex.delete(1, text.length()); // saves the first letter
		
		
		//TODO REVERSE STRING
		
	//	android.reverse();
		
		
		//TODO REPLACE STRING
		
		Scanner nokia = new Scanner(System.in); //drugacija varijabla, novi Scanner
		
	//	android.replace(samsung.nextInt(), samsung.nextInt(), nokia.nextLine());
		
	//	System.out.println(android);
		
		
		//TODO fully REPLACE ONE STRING with ANOTHER

		System.out.println("Insert text");
		String text = nokia.nextLine();
		
		StringBuffer reinex = new StringBuffer(text);
		
	
		
		reinex.replace(samsung.nextInt(), text.length(), nokia.nextLine()); 
			// od ovog broja što unesem do kraja rijeèi zamjeni indexe do kraja rijeèi.
		
		System.out.println("You replaced " + text + " with " + reinex);
	        
		
		// FIND INDEX using an ARRAY
		
		char[] tech = new char[20];
		
		
		samsung.close();
		nokia.close();
		
	

	}

}
