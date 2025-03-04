import java.util.Scanner;

/**
 *
 * @author hasibur
 */
public class pb_06{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the number of students: ");
        int numStudents = input.nextInt();
        
        String[] names = new String[numStudents];
        int[] scores = new int[numStudents];
        
        for (int i=0; i<numStudents; i++) {
            System.out.print("Enter name of student " + (i+1) + ": ");
            names[i] = input.next();
            
            System.out.print("Enter score of " + names[i] + ": ");
            scores[i] = input.nextInt();
        }
        
        for (int i=0; i<numStudents; i++) {
            for (int j=i+1; j<numStudents; j++) {
                if (scores[i] < scores[j]) {
                    int tempScore = scores[i];
                    scores[i] = scores[j];
                    scores[j] = tempScore;
                    
                    String tempName = names[i];
                    names[i] = names[j];
                    names[j] = tempName;
                }
            }
        }
        
        System.out.println("Students in decreasing order scores: ");
        for (int i=0; i<numStudents; i++) {
            System.out.println(names[i] + ": " + scores[i]);
        }
    }
}
