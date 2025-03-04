import java.util.Scanner;

/**
 *
 * @author User
 */
public class pb_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int size;
        System.out.println("Declare the array size: ");
        size = input.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter values: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }

        System.out.println("Unique values are: ");
        for (int i = 0; i < arr.length; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < arr.length; j++) {
                if (i != j && arr[i] == arr[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                System.out.println(arr[i]);
            }
        }
    }
}
