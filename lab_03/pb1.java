//import java.util.Scanner;
import java.util.Random;

public class pb1 {
     public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        int[][] arr = new int[4][4];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = rand.nextInt(2);
            }
        }

        
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        
        int maxIndexNumRow = -1;
        int maxRowCount = -1;
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == 1) {
                    count++;
                }
            }
            if (count > maxRowCount) {
                maxRowCount = count;
                maxIndexNumRow = i;
            }
        }

        System.out.println("Largest Row index: " + maxIndexNumRow);

        
        int maxIndexNumCol = -1;
        int maxColCount = -1;
        for (int j = 0; j < arr[0].length; j++) { 
            int count1 = 0;
            for (int i = 0; i < arr.length; i++) { 
                if (arr[i][j] == 1) {
                    count1++;
                }
            }
            if (count1 > maxColCount) {
                maxColCount = count1;
                maxIndexNumCol = j; 
            }
        }

        System.out.println("Largest Col index: " + maxIndexNumCol);
        
     }    
}
