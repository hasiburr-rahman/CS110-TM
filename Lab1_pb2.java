package homework02;

import java.util.Scanner;

public class Lab1_pb2 {
 
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the mins: ");
        long mins = input.nextLong();
        
        long years = mins/(60*24*365);
        long days =  mins%(60*24*365)/(60*24);
        
        System.out.println(mins + "minutes is approximately " + years + " and " + days + " days");
        
    }
    
}
