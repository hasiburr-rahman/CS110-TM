package packageForAccount;

import java.util.Calendar;

public class Account {
    private int id;
    private double balance;
    private double annualInterestRate;
    private Calendar dateCreated;

    Account(){

    }

    Account(int id, double balance, double annualInterestRate){
        setId(id);
        setBalance(balance);
        setAnnualInterestRate(annualInterestRate);
        dateCreated = Calendar.getInstance();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public Calendar getDateCreated() {
        return dateCreated;
    }

    public double getMonthlyInterestRate(){
        double monthlyInterestRate = (getAnnualInterestRate()/100) / 12;
        return getBalance() * monthlyInterestRate;
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void display() {
        System.out.println("Account ID: " + id );
        System.out.println("Date Created: " + dateCreated.getTime());
        System.out.println("Current Balance: " + balance);
        System.out.println("Annual Interest Rate: " + annualInterestRate);
        System.out.println("Monthly Interest Amount: " + getMonthlyInterestRate());
    }


}