package homework02;
import java.util.Scanner;
/**
 * @author hasibur
 */
public class Dayfinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int day = 6;
        System.out.println("Today is Thursday ");
        System.out.println("To find out a future day, enter the number of days ahead: ");
        int daynum = input.nextInt();
        
        int dayfinder = (day+daynum)%7;
        
        switch(dayfinder){
            case 0:
                System.out.println("Fri");
                break;
            case 1:
                System.out.println("Sat");
                break;
            case 2:
                System.out.println("Sun");
                break;
            case 3:
                System.out.println("Mon");
                break;
            case 4:
                System.out.println("Tues");
                break;
            case 5:
                System.out.println("Wed");
                break;
            case 6:
                System.out.println("Thurs");
                break;   
        }     
        
    }
}
