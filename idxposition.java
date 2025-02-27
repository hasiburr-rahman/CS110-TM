package homework02;
import java.util.Scanner;

public class idxposition {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int size;
        System.out.println("Enter the size of array[] : ");
        size = input.nextInt();
        int[] arr = new int[size];
        
        System.out.println("Now,Enter elements: ");
        for(int i=0; i<arr.length; i++){
            arr[i] = input.nextInt();
        }
        
        int max = arr[0];
        int min = arr[0];
        
        int maxidx = 0, minidx = 0;
        for(int i=1; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
                maxidx = i;
            }
            if(arr[i] < min){
                min = arr[i];
                minidx = i;
            }
        }
        
        maxidx += 1;
        minidx += 1;
        
        System.out.println("Max number is " + max + " idex number is " + maxidx);
        System.out.println("Min number is " + min + " idex number is " + minidx);
        System.out.println();
        System.out.println();
        System.out.println("Note: Index num start -- 1 -- instead of -- 0 --");
        
        
        input.close();
        
    }
}
