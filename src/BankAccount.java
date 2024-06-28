// BankAccount.java
public class BankAccount {
    private String BankAccountNumber;
    private String BankAccountHolderName;
    private double balance;

    // Public constructor
    public BankAccount(String accountNumber, String accountHolderName, double initialBalance) {
        this.BankAccountNumber = accountNumber;
        this.BankAccountHolderName = accountHolderName;
        this.balance = initialBalance;
    }

    public String getBankAccountNumber() {
        return BankAccountNumber;
    }

    public void setBankAccountNumber(String bankAccountNumber) {
        BankAccountNumber = bankAccountNumber;
    }

    public String getBankAccountHolderName() {
        return BankAccountHolderName;
    }

    public void setBankAccountHolderName(String bankAccountHolderName) {
        BankAccountHolderName = bankAccountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: " + amount);
            System.out.println("Invalid withdrawal amount.");
        }
    }

    // Method to display account details
    public void displayAccountDetails() {
        System.out.println("Account Number: " + BankAccountNumber);
        System.out.println("Account Holder Name: " + BankAccountHolderName);
        System.out.println("Balance: " + balance);
    }


    public static void main(String[] args) {
        // Create an instance of BankAccount
        BankAccount account1 = new BankAccount("74836857683", "Sowjanya Reddy", 10000.0);

        // Use setter methods to set the account details
        account1.setBankAccountNumber("12398764");
        account1.setBankAccountHolderName("Sowjanya reddy");

        // Use getter methods to retrieve and display the account details
        System.out.println("Account Number: " + account1.getBankAccountNumber());
        System.out.println("Account Holder Name: " + account1.getBankAccountHolderName());
        System.out.println("Initial Balance: " + account1.getBalance());

        // Test deposit method
        account1.deposit(20000.0);
        System.out.println("Balance after deposit: " + account1.getBalance());

        // Test withdraw method
        account1.withdraw(5000.0);
        System.out.println("Balance after withdrawal: " + account1.getBalance());

        // Test invalid deposit
        account1.deposit(5000.0);

        // Test invalid withdrawal
        account1.withdraw(2000.0);

        // Display final account details
        account1.displayAccountDetails();
    }
}
