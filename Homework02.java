package homework02;
import java.util.Scanner;
import java.util.Random;

public class Homework02 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        
        System.out.println("Enter a Array[] size: ");
        int size = input.nextInt();
        int[] arr = new int[size];
        
        for(int i=0; i<arr.length; i++){
            arr[i] = random.nextInt(1,11);
            System.out.println("Values " + arr[i]);
        }
        
        input.close();
    }
    
}
