package oopassignment;
import java.util.Scanner;
public class Oddevenevaluator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
        int number;
        
        
        System.out.print("Enter a number: ");
        number = scanner.nextInt();
        
        
        while (number % 2 != 0) {
            System.out.print("The number is odd. Please enter an even number: ");
            number = scanner.nextInt();
        }
        
       
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += number;
            System.out.println("Sum after adding " + number + " is: " + sum);
        }
        
        
    }
}
