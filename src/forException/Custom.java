package forException;

import java.util.Scanner;

public class Custom {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an age: ");

        try {
            int age = sc.nextInt();
            if (age > 100) {
                throw new MyException("The man already died");
            } else {
                System.out.println("Valid age: " + age);
            }
        } catch (MyException e) {
            System.out.println("Custom Exception: " + e.getMessage());
        }

        sc.close();
    }

    static class MyException extends Exception {
        public MyException(String message) {
            super(message);
        }
    }
}