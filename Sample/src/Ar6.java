
public class Ar6 {
public static void main(String[] args) {
	int mirza[] = {3,4,5,6,7};
	change(mirza);
	
	for(int y:mirza)
		System.out.println(y);
}
public static void change(int x[]) {
for (int counter=0; counter<x.length;counter++)
	x[counter]+=5; //3+5, 4+5, 5+5...

}

}
