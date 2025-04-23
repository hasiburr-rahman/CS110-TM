package packageForAccount;

import java.util.Calendar;

public class SavingAccount extends Account {
    private String cardNumber;
    private Calendar expiryDate;

    public SavingAccount(int  id, double balance, double annualInterestRate, String cardNumber, Calendar expiryDate){
        super(id, balance, annualInterestRate);
        this.cardNumber = cardNumber;
        this.expiryDate = expiryDate;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public Calendar getExpiryDate() {
        return expiryDate;
    }

    public double getCreditBalance(){
        return getBalance()*3;
    }

    @Override
    public void display() {
        System.out.println("This is a Savings Account");
        super.display();
        System.out.println("Credit Card Number: " + cardNumber);
        System.out.println("Card Expiry Date: " + expiryDate.getTime());
        System.out.println("Credit Balance: " + getCreditBalance());
    }

}