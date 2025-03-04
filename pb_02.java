import java.util.Scanner;

public class pb_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int[] arr = new int[100];
        int size = 0;
        
        System.out.println("Enter values (enter 0 to stop): ");
        
        while(true){
            int value = input.nextInt();
            if (value == 0) {
                break;  
            }
            arr[size] = value;  
            size++;
        }
        
        for (int i=0; i<size; i++){

            int count = 0;     
            if (arr[i] == 0) continue;             
            for (int j=0; j<size; j++){
                if (arr[i] == arr[j]) {
                    count++;
                }
            }            
            System.out.println(arr[i] + " appears " + count + " times");
        }
    }
}
