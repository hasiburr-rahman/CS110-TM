package homework02;
import java.util.Scanner;

public class swapping {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int size;
        System.out.println("Enter the size of the Array[]:  ");
        size = input.nextInt();
        int[] arr = new int[size];
        
        for(int i=0; i<arr.length; i++){
            arr[i] = input.nextInt();
        }
        
        int swp1 = 0;
        //int swp2=0;
        
        int idx1, idx2;
        System.out.println("Enter First index num: ");
        idx1 = input.nextInt();
        System.out.println("Enter Second index num: ");
        idx2 = input.nextInt();
        
        idx1 -= 1;
        idx2 -= 1;
        
        swp1 = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = swp1;
        
        for(int i=0; i<arr.length; i++){
            System.out.println("Arrays are after swapping: " + arr[i]);
        }
        
        input.close();
    }
}
