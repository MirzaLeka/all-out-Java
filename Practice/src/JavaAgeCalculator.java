import java.util.*;
public class JavaAgeCalculator {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int godina, mjesec, dan, prestupnagod;
		int i=2016; int j = 11; int k = 17;
		
		
		System.out.println("Enter the year of birth: ");
		godina = in.nextInt();
		System.out.println("Enter the month of birth: ");
		mjesec = in.nextInt();
		System.out.println("Enter the day of birth: ");
		dan = in.nextInt();
		System.out.println();
		
		
		if (godina>i || mjesec>12 ||mjesec<1 ||dan<1 || dan>31) {
			System.out.println("Invalid input.");
			System.exit(0); }
		
		
		if ((godina==i && mjesec>j) || (godina==i && mjesec==j && dan>k)) { 
			System.out.println("You're not born yet."); 
			System.exit(0); }
		
		if (godina==i && mjesec==j && dan==k) {
			System.out.println("Welcome to this world kid!");
		System.exit(0); }
		
		
	if ((mjesec==4 || mjesec==6 || mjesec==9 || mjesec==11) && dan==31) {
		System.out.println("Month you entered doesn't have more than 30 days.");
	System.exit(0); }
	
	
	if (mjesec==2 && dan>29) {
		System.out.println("Month you entered doesn't have more than 28 or 29 days.");
	System.exit(0); }
	
	if ((godina % 4 !=0) && mjesec==2 && dan==29) {
		System.out.println("Year you entered was not a leap year, therefore February could not have 29 days.");	
System.exit(0);	}

		
	if (i>=godina && j>=mjesec && k>=dan) {
		System.out.println("You are\n" + (i-godina) + " years,\n" + (j-mjesec) + " months and\n" + (k-dan) + " days old." );
	}
	
	if (i>=godina && j<mjesec && k>=dan) {
		System.out.println("You are\n" + (i-godina-1) + " years,\n" + j + " months and\n" + (k-dan) + " days old.");
	}
	
	if (i>=godina && mjesec<=10 && k<dan && dan<=31) {
		System.out.println("You are\n" + (i-godina) + " years,\n" + (j-mjesec-1) + " months and\n" + (31 - (dan - k)) + " days old.");
	} 
	
	if (i>=godina && j==mjesec && k<dan && dan<=31) {
		System.out.println("You are\n" + (i-godina-1) + " years,\n" + 11 + " months and\n" + (30-(dan-k)+1) + " days old.");
	}
	
	if (i>=godina && j<mjesec && k<dan && dan<=31) {
		System.out.println("You are\n" + (i-godina-1) + " years,\n" + 10 + " months and\n" + (31 - (dan - k)) + " days old.");
	}
	
	
    int b = 0;
	for (int a = i; a >= godina; a=a-4) {
	b++;
	}
	
	System.out.println("\n"
			+ "You lived " + b + " leap years.");
	
	if (godina<1901) {
		System.out.println("Shouldn't you be dead by now?");
	}
	}	
}