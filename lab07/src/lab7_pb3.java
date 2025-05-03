import java.util.Scanner;

public class lab7_pb3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] array = new int[100];
        for(int i=0; i<100; i++){
            array[i] = i;
        }

        System.out.println("Input An Array[] Index: ");
        int arr = input.nextInt();

        try {
            System.out.println("Your given index is " + arr + " And the value is " + array[arr]);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid index Number");
            System.out.println(e.getMessage());
        }
    }
}
