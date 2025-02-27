package homework02;
//: Write a program that reads an integer from the console and 
//determines whether the given number is divisible by either 2 or 3 (but not both). Then the program should print TRUE, otherwise, the program should print FALSE.

import java.util.Scanner;

public class Lab1_pb1 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the value of a ");
        int a = input.nextInt();
//        System.out.println("Enter the value of b ");
//        int b = input.nextInt();
        
        if((a%2 == 0) && (a%3 == 0)){
            System.out.println("False");
        }
        else if(a%2 == 0){
            System.out.println("True");
        }
        else if(a%3 == 0){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
        
        input.close();
        
    }
    
}
