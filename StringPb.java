import java.util.*;
/**
 *
 * @author hasibur
 */
public class StringPb {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Input any string: ");
        String name = input.nextLine();
        
        if (name.length() >= 2 && 
            ((name.charAt(0) >= '0' && name.charAt(0) <= '9') &&
            (name.charAt(1) >= '0' && name.charAt(1) <= '9'))) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        
        input.close();
        
    }
    
}
