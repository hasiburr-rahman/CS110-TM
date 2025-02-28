import java.util.Scanner;
/**
 *
 * @author hasibur
 */
public class MaxInEntireArr {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int m,n;
        System.out.println("Enter Row & Col: x ");
        m = input.nextInt();
        n = input.nextInt();
        int[][] arr = new int[m][n];
        
        System.out.println("Enter elements");
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                arr[i][j] = input.nextInt();
            }
        }
        System.out.println("Martix : ");
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println();
        }
        
        int max = arr[0][0];
        int idxRow = 0;
        int idxCol = 0;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(arr[i][j] > max){
                    max = arr[i][j];
                    idxRow = i;
                    idxCol = j;
                }
            }        
        }
        System.out.println("Max is: " + max + " Row Index: " + (idxRow+1) + "Column index: " + (idxCol+1));
    }
}
