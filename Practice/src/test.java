import java.util.Scanner;
public class test {
    public static void main(String[] args) {

        int counter = 1;
        int number;
        int largest = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number: ");
        number = input.nextInt();

        while(counter < 5)
        {
        	 if(largest < number) {
                 largest = number;
             }
        	
        	System.out.println("Enter the number: ");
            number = input.nextInt();

           

            counter++;

        }

        System.out.println("the largest number is " + largest);
    }
}