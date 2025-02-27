package homework02;
import java.util.Scanner;

public class avarage {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the first number - ");
		double a = input.nextDouble();
		
		System.out.println("Enter the second number - ");
		double b = input.nextDouble();
		
		System.out.println("Enter the third number - ");
		double c = input.nextDouble();
		
		double result = (a+b+c)/3.0;
		
		System.out.println("Avarage is " + result);
		
		input.close();
		
	}

}
