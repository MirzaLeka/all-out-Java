import java.util.*;
public class homework {
	public static void main(String[] args) {
		Scanner out = new Scanner(System.in);
		
		System.out.println("Unesite broj po želji: ");
		long broj = out.nextLong();
		long zbir=0;

		do{
			
        zbir+=broj%10;
        broj=broj/=10;
        zbir+=broj%10;
        broj=broj/=10;
        zbir+=broj%10;
        broj=broj/=10;
        zbir+=broj%10;
        broj=broj/=10;
        zbir+=broj%10;
        broj=broj/=10;
        zbir+=broj%10;
        broj=broj/=10;
        zbir+=broj%10;
        broj=broj/=10;
        zbir+=broj%10;
        broj=broj/=10;
        zbir+=broj%10;
        broj=broj/=10;
        zbir+=broj%10;
        broj=broj/=10;
        zbir+=broj%10;
        broj=broj/=10;
        zbir+=broj%10;
        broj=broj/=10;
        zbir+=broj%10;
        broj=broj/=10;
        zbir+=broj%10;
        broj=broj/=10;
        zbir+=broj%10;
        broj=broj/=10;
        zbir+=broj%10;
        broj=broj/=10;
        zbir+=broj%10;
        broj=broj/=10;
        zbir+=broj%10;
        broj=broj/=10;
        zbir+=broj%10;
        broj=broj/=10;
        zbir+=broj%10;
        broj=broj/=10;
        zbir+=broj%10;

		}while(broj!=0); 
		System.out.println("Broj je " + zbir);
		
		
		/*
		if (broj<10) {
			System.out.println("Zbir unesenih brojeva je " + broj);
		}
		else if (broj<100) {
			System.out.println("Zbir unesenih brojeva je " + (broj/10 + broj%10));
		}
		else if (broj<1000) {
			System.out.println("Zbir unesenih brojeva je " + ((broj%10) + (broj/100) + (broj/10)%10));
		}
		else if (broj<10000) {
			System.out.println("Zbir unesenih brojeva je " + ((broj%10) + (broj/10)%10 + (broj/1000) + (broj/100)%10));
		}
		else if (broj<100000) {
			System.out.println("Zbit unesenih brojeva je " + ((broj%10) + (broj/10)%10 + (broj/100)%10 + (broj/10000) + (broj/1000)%10));
		}
	*/
	}

}
