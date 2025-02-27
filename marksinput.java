import java.util.Scanner;

public class marksinput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of students: ");
        int n = scanner.nextInt();
        
        int[][] marks = new int[n][2];
        
        for (int i = 0; i < n; i++) {
            System.out.print("Enter Quiz 1 mark for student " + (i + 1) + ": ");
            marks[i][0] = scanner.nextInt();
            
            System.out.print("Enter Quiz 2 mark for student " + (i + 1) + ": ");
            marks[i][1] = scanner.nextInt();
        }
        
        System.out.println("\nStudent  Quiz 1  Quiz 2");
        for (int i = 0; i < n; i++) {
            System.out.printf("   %d        %d       %d\n", 
                            (i + 1), marks[i][0], marks[i][1]);
        }
        
        scanner.close();
    }
}