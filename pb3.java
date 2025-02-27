package homework02;

import java.util.Scanner;

public class pb3 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the value of a");
        double a = input.nextDouble();
        System.out.println("Enter the value of b");
        double b = input.nextDouble();
        System.out.println("Enter the value of c");
        double c = input.nextDouble();
        
        double discriminant = b*b - (4*a*c);
        
        if (discriminant > 0){
            double ans1 = (-b + Math.sqrt(discriminant))/(2*a);
            double ans2 = (-b - Math.sqrt(discriminant))/(2*a);
            
            System.out.println("R1 " + ans1 + " R2 " + ans2);
        }
        else if(discriminant == 0){
            double zeroans = -b/2*a;
            System.out.println("When zero " + zeroans);
        }
        else{
            System.out.println("The equation has no real roots");
        }
    }
}
