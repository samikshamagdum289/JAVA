class LowBalanceException extends Exception {
    public LowBalanceException(String message) {
        super(message);
    }
}

// User-defined exception for negative numbers
class NegativeNumberException extends Exception {
    public NegativeNumberException(String message) {
        super(message);
    }
}

// Bank Account class
class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    // Method to check balance
    public double balanceEnquiry() {
        return balance;
    }

    // Method to withdraw money
    public void withdraw(double amount) throws LowBalanceException, NegativeNumberException {
        if (amount < 0) {
            throw new NegativeNumberException("Withdrawal amount cannot be negative.");
        }

        if (balance - amount < 0) {
            throw new LowBalanceException("Insufficient funds for withdrawal.");
        }

        balance -= amount;
        System.out.println("Withdrawal successful. Remaining balance: " + balance);
    }

    // Method to deposit money
    public void deposit(double amount) throws NegativeNumberException {
        if (amount < 0) {
            throw new NegativeNumberException("Deposit amount cannot be negative.");
        }

        balance += amount;
        System.out.println("Deposit successful. Updated balance: " + balance);
    }
}
