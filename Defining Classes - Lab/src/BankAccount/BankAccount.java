package BankAccount;

public class BankAccount {
    private final static double DEFAULT_INTEREST_RATE = 0.02d;
    private static double interestRate = DEFAULT_INTEREST_RATE;
    private static int idCounter = 1;
    private int id;

    public int getId() {
        return id;
    }

    private double balance;

    public BankAccount() {
        this.id = idCounter++;
    }

    public static void setInterestRate(double interest) {
        BankAccount.interestRate = interest;

    }

    public double getInterest(int years) {
        return BankAccount.interestRate * years * this.balance;

    }

    public void deposit(double amount) {
        this.balance += amount;


    }

}
