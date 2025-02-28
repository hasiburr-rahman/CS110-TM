import java.util.Scanner;
/**
 *
 * @author hasibur
 */
public class MaxEachCol {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int m,n;
        System.out.println("Enter Row & Col 2: ");
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
              
        for(int j=0; j<n; j++){
            int max = arr[0][j];
            int idx =0;
            for(int i=1; i<m; i++){
                if(arr[i][j] > max){
                    max = arr[i][j];
                    idx = i;
                }
            }
            System.out.println("Max in each Col is " + max + " Row Index " + (idx+1));
            
        }
        
    }
}