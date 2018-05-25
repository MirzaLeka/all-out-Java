import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.function.ObjDoubleConsumer;

public class LeapYear {
	public static void main(String[] args)
    {
		Scanner in = new Scanner(System.in);
        System.out.print("Enter your year: ");
        Integer year = in.nextInt();

        if ((year % 4 == 0) && year % 100 != 0)
        {
        	System.out.println(year + " is a leap year.");
        }
        else if ((year % 4 == 0) && (year % 100 == 0) && (year % 400 == 0))
        {
        	System.out.println(year + " is a leap year.");
        }
        else
        {
        	System.out.println(year + " is not a leap year.");
        }
        
        
        int j=0;						
            
        for(int i=2016;i>=year;i=i-4){			
        j=j+1;
        }
      System.out.println("You lived " + j + " leap years.");
    }
}

