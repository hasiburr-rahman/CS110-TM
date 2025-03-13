import java.util.Scanner;

public class newpv2 {

    public static boolean isValidPassword(String password) {
        if (password.length() < 8) {
            return false;
        }
        int digitCount = 0;
        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);

            if (!((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z') || (ch >= '0' && ch <= '9'))) {
                return false;
            }
            if (ch >= '0' && ch <= '9') {
                digitCount++;
            }
        }

        return digitCount >= 2;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the password: ");
        String pass = input.nextLine();

        System.out.println(isValidPassword(pass));
    }
}
