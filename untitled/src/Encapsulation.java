class BankAccount {
    // private fields (hidden data)
    private String accountHolder;
    private double balance;

    // constructor
    public BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // getter (read access)
    public double getBalance() {
        return balance;
    }

    // setter (controlled write access)
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient funds or invalid amount!");
        }
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("Abhishek", 5000);

        // Can't access balance directly (it's private)
        // account.balance = 10000; ❌ not allowed

        // Must use public methods
        System.out.println("Balance: " + account.getBalance()); // 5000
        account.deposit(2000);  // Deposited: 2000
        System.out.println("Balance: " + account.getBalance()); // 7000
        account.withdraw(8000); // Insufficient funds
    }
}
