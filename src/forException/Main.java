package forException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a;
        a = input.nextInt();
        try {
            CheckAge(a);
        }
        catch (MyException e){
            System.out.println(e.getMessage());
        }

    }
    public static void CheckAge(int a) throws MyException{
        if (a < 18) {
            throw new MyException("Age under 18");
        }
        else {
            System.out.println("Age is OKAY " + a);
        }
    }
}
