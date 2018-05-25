
import java.util.*;
import java.io.*;

public class FileWriterObject {

	public static void main(String[] args) throws IOException {
	
		Scanner scanner = new Scanner(System.in); //how unoriginal scanner name
		
	//	System.out.println("What's your name?");
	//	String name = scanner.next();
		
		System.out.println("Unesi prvi broj: ");
		int prviBroj = scanner.nextInt();
		
		System.out.println("Unesi drugi broj: ");
		int drugiBroj = scanner.nextInt();
		
		FileWriterObject FWO = new FileWriterObject(); //how unoriginal class name
		FWO.fileWrite(prviBroj, drugiBroj);
		
	
	}
	
	public void fileWrite(int a, int b) throws IOException{
		
		FileWriter fileWriter = null;
		
	try {
			
			File f = new File("Proracun.doc"); //nameFile.txt
			System.out.println("File Saved!");
			
			fileWriter = new FileWriter(f,true);
			
			fileWriter.write("Zbir je " + (a+b) + "\r\n" + "Razlika je " + (a-b));
			
		}finally {
	
	if (fileWriter != null) {
		fileWriter.close();
	}
	
			
	}

		
	}
	
	public static void timer (int x) {
		try {
			Thread.sleep(x);
		}catch(Exception e) {}
	}

}
