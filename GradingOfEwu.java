package homework02;
import java.util.Scanner;

/**
 *
 * @author hasib
 */
public class GradingOfEwu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("WELCOME!");
        System.out.println("Enter your marks: ");
        int marks = input.nextInt();
        
        if(marks<=100 && marks>=80){
            System.out.println("A+");
        }
        else if(marks<=79&& marks>=75){
            System.out.println("A");
        }
        else if(marks<=74 && marks>=70){
            System.out.println("A-");
        }
        else if(marks<=69 && marks>=65){
            System.out.println("B+");
        }
        else if(marks<65 && marks>=60){
            System.out.println("B");
        }
        else if(marks<60 && marks>=55){
            System.out.println("B-");
        }
        else if(marks<55 && marks>=50){
            System.out.println("C+");
        }
        else{
            System.out.println("F");
        }
    }
}
