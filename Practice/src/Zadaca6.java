import java.util.*;
public class Zadaca6 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		int broj;
		int a, b, c, d, e, f, g, h, i = 0;
		
		do {
			
		System.out.println("Unesite neki broj:");
		broj = in.nextInt();

		
		}while (broj<0);
		
	do {
		a=broj%10;
        broj=broj/=10;
        
        b=broj%10;
        broj=broj/=10;
        
        c=broj%10;
        broj=broj/=10;
        
        d=broj%10;
        broj=broj/=10;
        
        e=broj%10;
        broj=broj/=10;
        
        f=broj%10;
        broj=broj/=10;
        
        g=broj%10;
        broj=broj/=10;
        
        h=broj%10;
        broj=broj/=10;
        
        i=broj%10;
        broj=broj/=10;
        
        
	}while (broj!=0);

       System.out.println("Najveæi unijeti broj je " + Math.max(a, Math.max(b, Math.max(c, Math.max(d, Math.max(e, Math.max(f, Math.max(g, Math.max(h, i)))))))));
       System.out.println("Najmanji unijeti broj je " + Math.min(a, Math.min(b, Math.min(c, Math.min(d, Math.min(e, Math.min(f, Math.min(g, Math.min(h, i)))))))));
   
		
	}

}
