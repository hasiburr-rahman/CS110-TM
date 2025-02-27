package homework02;

import java.util.Scanner;

public class pb5 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter x axis center: ");
        double a = input.nextDouble();
        
        System.out.println("Enter the y axis: ");
        double b = input.nextDouble();
        
        System.out.println("Please enter the radious: ");
        double r = input.nextDouble();
        
        System.out.println("now, you have to input two points - ");
        
        System.out.println("Enter x point: ");
        double x = input.nextDouble();
        System.out.println("Enter y point: ");
        double y = input.nextDouble();
        
        
        double result = Math.sqrt(Math.pow((x-a),2) + Math.pow((y-b), 2));
        
        if(result > r){
            System.out.println("OUT");
        }
        else if(result < r){
            System.out.println("IN");
        }
        else if(result == r){
            System.out.println("ON");
        }
        else{
            System.out.println("invalid");
        }
    }
    
}
