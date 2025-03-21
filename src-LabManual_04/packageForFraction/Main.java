package packageForFraction;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the First numerator: ");
        int num1 = input.nextInt();
        System.out.println("Enter the First denominator: ");
        int denm1 = input.nextInt();

        fraction f1 = new fraction(num1, denm1);

        System.out.println("Enter the Second numerator: ");
        int num2 = input.nextInt();
        System.out.println("Enter the Second denominator: ");
        int denm2 = input.nextInt();

        fraction f2 = new fraction(num2, denm2);

        System.out.println("First Fraction: " + f1.toString());
        System.out.println("Second Fraction: " + f2.toString() );

        f1.add(f2);
        System.out.println("After Adding: " + f1);

        f1 = new fraction(num1, denm1);
        f1.sub(f2);
        System.out.println("After Sub: " + f1);

        f1 = new fraction(num1, denm1);
        f1.multiplication(f2);
        System.out.println("After Multiplication: " + f1);

        f1 = new fraction(num1, denm1);
        f1.division(f2);
        System.out.println("After divison: " + f1);

        System.out.println("This Application work's END here.");
        System.out.println("<------THANK YOU------>");
    }
}
