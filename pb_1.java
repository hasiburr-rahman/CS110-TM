
import java.util.Scanner;


/**
 *
 * @author hasibur
 */
public class pb_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int size;
        System.out.println("Enter the size of array: ");
        size = input.nextInt();
        int[] arr = new int[size];
        
        for(int i=0; i<arr.length; i++){
            arr[i] = input.nextInt();
        }
        
        int max = arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i]> max){
                max = arr[i];
            }        
        }
        
        System.out.println("max is: " + max);
        
        int a = max-10;
        int b = max-20;
        int c = max-30;
        int d = max-40;
        
        for(int i=0; i<arr.length; i++){
            if(arr[i] > a){
                System.out.println("A");
            }
            else if(arr[i] <= a && arr[i] >= b){
                System.out.println("C");
            }
            else if(arr[i] <= b && arr[i] >= c){
                System.out.println("C");
            }
            else if(arr[i] <= c && arr[i] >= d){
                System.out.println("D");
            }
            else{
                System.out.println("F");
            }
        }
        
        
    }
}
