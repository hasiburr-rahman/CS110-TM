import java.util.Scanner;
/**
 *
 * @author hasibur
 */
public class MaxEachRow {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int m,n;
        System.out.println("Enter Row & Col: ");
        //System.out.println("Enter Col: ");
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
              
        for(int i=0; i<m; i++){
            int max = arr[i][0];
            int idx =0;
            for(int j=0; j<n; j++){
                if(arr[i][j] > max){
                    max = arr[i][j];
                    idx = j;
                }
            }
            System.out.println("Max in each row is " + max + " Column Index " + (idx+1));
            
        }
        
    }
}
