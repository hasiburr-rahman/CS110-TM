import java.util.*;

public class boubblesort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] arr = new int[5];
        System.out.println("Enter 5 numbers: ");
        for (int i = 0; i < 5; i++) {
            arr[i] = input.nextInt();
        }

        System.out.println("Before sorting: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(arr[i] + " ");
        }
        
        System.out.println();

        for  (int i=0; i<arr.length; i++) {
            for (int j=0; j<arr.length-1-i; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }        
        }

        System.out.println("\nAfter sorting: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(arr[i] + " ");
        }


    }   
}