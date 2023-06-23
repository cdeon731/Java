import java.util.Random;

public class BankAccount {
    // create attributes
    private double checkingBalance;
    private double savingsBalance;
    private int accountNumber;

    // create static class members
    public static int numberOfAccounts = 0;
    public static double totalMoneyAllAccounts = 0;

    // create constructor class (include counter for numberOfAccounts)
    public BankAccount() {
        this.checkingBalance = 0;
        this.savingsBalance = 0;
        this.accountNumber = generateId();
        numberOfAccounts += 1;
    }

    // Ninja bonus: generate random 10 digit bank account number for each account
    private static int generateId() {
        Random randGenerator = new Random();
        int randomId = randGenerator.nextInt(1000000000) + 999999999;
        return randomId;
    }

    // Getters
    public double getCheckingBalance() {
        return this.checkingBalance;
    }

    public double getSavingsBalance() {
        return this.savingsBalance;
    }

    public int getAccountNumber() {
        return this.accountNumber;
    }

    // deposit and withdrawl Methods (include counter for totalMoneyAllAccounts)

    /*
     * My Solution:
     * public Double depositChecking(Double amount) {
     * BankAccount.totalMoneyAllAccounts += amount;
     * return this.checkingBalance + amount;
     * }
     * 
     * public Double depositSavings(Double amount) {
     * BankAccount.totalMoneyAllAccounts += amount;
     * return this.savingsBalance + amount;
     * }
     */

    // Combine the above code to make this:
    public void depositMoney(double amount, String account) {
        if (account.equals("savings"))
            this.savingsBalance += amount;
        else if (account.equals("checking"))
            this.checkingBalance += amount;
        BankAccount.totalMoneyAllAccounts += amount;
    }

    /*
     * My Solution:
     * public Double withdrawFromChecking(Double amount) {
     * if (amount > this.checkingBalance) {
     * System.out.println("Insufficient Funds");
     * }
     * BankAccount.totalMoneyAllAccounts -= amount;
     * return this.checkingBalance - amount;
     * }
     * 
     * public Double withdrawFromSavings(Double amount) {
     * if (amount > this.savingsBalance) {
     * System.out.println("Insufficient Funds");
     * }
     * BankAccount.totalMoneyAllAccounts -= amount;
     * return this.savingsBalance - amount;
     * }
     */

    // Combind the above code to make this:
    public void withdrawMoney(double amount, String account) {
        boolean successful = false;
        if (account.equals("savings")) {
            // check if enough in account
            if (this.savingsBalance - amount >= 0) {
                successful = true;
                this.savingsBalance -= amount;
            }
        } else if (account.equals("checking")) {
            // check if enough in account
            if (this.checkingBalance - amount >= 0) {
                successful = true;
                this.checkingBalance -= amount;
            }
        }
        if (successful) {
            BankAccount.totalMoneyAllAccounts -= amount;
        } else {
            System.out.println("Insufficient funds.");
        }
    }

    public void displayAccountBalance() {
        // %.2f formats decimal to the 10s place
        System.out.println(String.format("Savings: %.2f, Checking: %.2f", this.savingsBalance, this.checkingBalance));
    }
}
