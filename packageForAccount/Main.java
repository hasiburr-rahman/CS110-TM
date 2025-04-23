package packageForAccount;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Account acc01 = new Account(1122, 20000, 4.5);

        //Lab problem A!!!!
        acc01.withdraw(3000);
        System.out.println("Total Balance After withDraw - " + acc01.getBalance());

        acc01.deposit(2500);
        System.out.println("Total balance After deposite - " + acc01.getBalance());

        System.out.println("Account Information - ");
        acc01.display();

        //Lab problem A END here!!
        /*--------------------------------------------------*/

        //B+C!!
        System.out.println("This part after Arraylist : ");
        ArrayList<Account> account = new ArrayList<>();

        for(int i=0; i<2; i++){
            System.out.println("Press (1) for creating a Checking Account");
            System.out.println("Press (2) for creating a Savings Account");
            int choice = input.nextInt();
            System.out.println("Enter Account Id: ");
            int id = input.nextInt();
            System.out.println("Enter Account balance: ");
            double balance = input.nextDouble();
            System.out.println("Enter AnnualInterestRate(In percentage): ");
            double annualInterestRate = input.nextDouble();

            if (choice == 1 ){
                System.out.println("Enter OverDratf Limit: ");
                double overDraftLimit = input.nextDouble();
                account.add(new CheckingAccount(id, balance, annualInterestRate, overDraftLimit));
            }
            else if (choice == 2) {
                System.out.println("Enter 16-digit Ca5rd Number: ");
                String cardNum = input.next();
                Calendar expiryData = Calendar.getInstance();
                expiryData.add(Calendar.YEAR, 10);
                account.add(new SavingAccount(id, balance, annualInterestRate, cardNum, expiryData));
            }
        }

        for (Account acc : account) {
            System.out.println("----------------------------------------");
            acc.display();
            System.out.println("----------------------------------------");
        }

    }

    /*
    @Author Hasibur.
    */
}

