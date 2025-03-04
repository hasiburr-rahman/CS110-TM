
import java.util.Scanner;

/**
 *
 * @author User
 */
public class pb_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int value = input.nextInt();
        int num = value;
        int rev =0;
        while(value == 0){
            rev = rev*10+(num%10);
            num = num/10;
        }
        
        if (num == value){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("It's not a Palindrome");
        }
        
    }
}
