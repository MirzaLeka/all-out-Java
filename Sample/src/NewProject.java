
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.function.ObjDoubleConsumer;

public class NewProject {

	public static void main(String[] args)
    {	
		boolean valid;
		String editor = "Spy4er";
		
		System.out.println("Please register to continue");
		
		String username = "0";
		String name;
		String last;
		System.out.println();
		
		while (username.equals("Spy4er") ) {
			System.out.println("This username is already taken.");
			System.out.print("Enter your username: ");
	        Scanner in = new Scanner(System.in);
	        username = in.nextLine();
		}
		
		do {
			valid = true;
		System.out.print("Enter your username: ");
        Scanner in = new Scanner(System.in);
        username = in.nextLine();
                        
            if (username.trim().length() < 5) {
        	System.out.println("Your username has less than five characters.");
        	valid = false;
           continue;
        }
        
        if (username.trim().length() > 20) {
        	System.out.println("Your username has more than twenty characters.");
        	valid = false;
            continue;
        }
        
        char c = username.trim().charAt(0);

        if (!Character.isUpperCase(c)) {
            System.out.println("Username must begin with an upper case letter.");
            valid = false;
            continue;
        }
        
        if (!Character.isAlphabetic(c)) {
   			System.out.println("Username must begin with a letter."); 
   			valid = false; 
   			continue;
   			}
        if (username.equals("Spy4er")) {
        	System.out.println("This username already exists Please try another.");
        	valid = false;
        	continue;
        }  
		}while(!valid);
		
		System.out.println();
		Scanner in = new Scanner(System.in);
		
		name = in.next();
				
		while (!in.hasNext("[A-Za-z]+")) {
	        System.out.println("Name must contain only letters.");
	       in.next(); }
		
		
		do {
	    valid = true;
		
		System.out.print("Enter your first name: ");
		Scanner sc = new Scanner(System.in);
		name = sc.nextLine();
			 
		  char d = name.trim().charAt(0);
		  
		 if (!Character.isUpperCase(d)) {
	            System.out.println("Name must begin with an upper case letter.");
	            valid = false;
	            continue;
	        }
			
		 if (name.trim().length() < 3) {
	        	System.out.println("Your name has less than three characters.");
	        	valid = false;
	            continue;
	        }
	        
	        if (name.trim().length() > 15) {
	        	System.out.println("Your name has more than fifteen characters.");
	        	valid = false;
	            continue;
	        }
	       
	      /*  if (!Character.isAlphabetic(d)) {
	   			System.out.println("Name must begin with a letter."); 
	   			valid = false; 
	   			continue;
	   			} */
	        
			}while(!valid);
		
		System.out.println();
				do {
		    valid = true;
			
			System.out.print("Enter your last name: ");
			Scanner mr = new Scanner(System.in);
			last = mr.nextLine();
            
			 if (last.equals(name)) {
					System.out.println("Your name matches your last name.");
				valid = false;
				}   
			 
			 if (last.trim().length() < 3) {
		     	System.out.println("Your last name has less than three characters.");
		       	valid = false;
		        continue;
		        }
		        
		        if (last.trim().length() > 15) {
		        	System.out.println("Your name has more than fifteen characters.");
		        	valid = false;
		            continue;
		        }
		        
		       char e = last.trim().charAt(0);

		        if (!Character.isUpperCase(e)) {
		            System.out.println("Last name begin with an upper case letter.");
		            valid = false;
		            continue;
		        }
		        
		        if (!Character.isAlphabetic(e)) {
		   			System.out.println("Last name must begin with a letter."); 
		   			valid = false; 
		   			continue;
		   			}
				
				}while(!valid);
		
				Integer tvojagod;
				Integer danasgod=2016;
				Integer kolikogod;
				
				System.out.println();
				do {
				valid = true;
				System.out.print("Enter your year of birth: ");
				Scanner df = new Scanner(System.in);
				tvojagod = df.nextInt();
								
				if ((tvojagod < 1900) || (tvojagod > 2016)) {
					System.out.println("Invalid year.");	
				valid = false;
				continue;	
				}
				}while(!valid);
				
				if (tvojagod > 2003) {
					System.out.println("You're too young to register.");
				System.exit(0);
				}
				
				kolikogod = (danasgod - tvojagod);
				
				/*
				System.out.println("Unesite JMBG");
				Scanner in = new Scanner(System.in);
				int jmbg = in.nextInt();
				
				if ((jmbg<1111900111111) || (jmbg>3112016999999)) {}
				*/
				
				
				System.out.println();
				try {
				System.out.print("Creating your account...");
				Thread.sleep(1500);
				System.out.print("...");
				Thread.sleep(1500);
				System.out.println("...");
				Thread.sleep(1500);
				System.out.println();
		System.out.println("Welcome user " + name + last);
				} catch (Exception e) {}
		
				System.out.println();
		System.out.println("Age " + kolikogod);
		System.out.println();
		
		if ((name.endsWith("ca")) || ((name.endsWith("da")) || (name.endsWith("ha")) || (name.endsWith("sa")) || (name.endsWith("ka"))
				|| (name.endsWith("la")) || (name.endsWith("ma")) || (name.endsWith("na")) || (name.endsWith("ra")) || (name.endsWith("ah"))
				|| (name.endsWith("ša")) || (name.endsWith("ba")) || (name.endsWith("er")) || (name.endsWith("ja")) || (name.endsWith("nja"))
				|| (name.endsWith("ea")) || (name.endsWith("ki")) || (name.endsWith("is")) )) 
		        {
		        	System.out.println("Sex: Female");
		        } 
						 else { 
		        	System.out.println("Sex: Male");
		        }
}
}