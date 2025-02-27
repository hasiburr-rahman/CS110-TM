package homework02;
import java.util.Scanner;

/**
 *
 * @author hasib
 */
public class MaxAndMin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Welcome to the function of find out Max and Min interger among three ");
        int[] arr = new int[3];
        
        System.out.println("Enter three elements: ");
        for(int i=0; i<arr.length; i++){
            arr[i] = input.nextInt();
        }
        
        int max = arr[0];
        int min = arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i]>arr[0]){
                max = arr[i];
            }
            if(arr[i]<arr[0]){
                min = arr[i];
            }
        }
        
        System.out.println("Max num is " + max + " And Min num is " + min);
    }
}
