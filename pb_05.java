import java.util.Random;

/**
 *
 * @author hasibur
 */
public class pb_05{
    public static void main(String[] args) {
        Random random = new Random();
        
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(101);
        }
        
        int idx = 0;
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                idx = i;
            }
        }
        System.out.println("Max value is: " + max + " at index " + idx);
        
        int minIdx = 0;
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                minIdx = i;
            }
        }
        System.out.println("Min value is: " + min + " at index " + minIdx);
    }
}
