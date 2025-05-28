package forException;

public class newException {
    public static void main(String[] args) {
        int a = 10;
        int b = 1;

        try {
            System.out.println("Result: " + calculateResult(a, b));
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero!");
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }

        System.out.println("Program continues after exception.");
    }

    public static double calculateResult(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        } else {
            return (double) a / b; // Use floating-point division
        }
    }
}
