package packageForAccount;

import java.util.Calendar;

public class CheckingAccount extends Account {

    private double overdraftLimit;

    CheckingAccount(int id, double balance, double annualinterstRate, double overdraftLimit){
        super(id, balance, annualinterstRate);
        this.overdraftLimit = overdraftLimit;
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (getBalance() - amount >= overdraftLimit) {
            super.withdraw(amount);
        } else {
            System.out.println("Overdraft limit exceeded.");
        }
    }


    @Override
    public void display() {
        System.out.println("This is a Checking Account");
        super.display();
        System.out.println("Overdraft Limit: " + overdraftLimit);
    }

}