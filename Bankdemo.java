class BankAccount 
{
    public double balance;

    public BankAccount(double initialBalance)
    {
        this.balance = initialBalance;
    }

    public void deposit(double amount)
    {
        balance += amount;
        System.out.println("Deposited: " + amount);
        displayBalance();
    }

    public void withdraw(double amount)
    {
        if (balance >= amount)
        {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        }
        else
        {
            System.out.println("Withdrawal unsuccessful.");
        }
        displayBalance();
    }

    public void displayBalance() 
    {
        System.out.println("Current Balance: " + balance);
    }
}

class SavingsAccount extends BankAccount 
{
    public SavingsAccount(double initialBalance) 
    {
        super(initialBalance);
    }
 public void withdraw(double amount) 
    {
        if (balance - amount >= 100)
        {
            super.withdraw(amount);
        } else 
        {
            System.out.println("Withdrawal unsuccessful.");
        }
        displayBalance();
    }
}

public class Bankdemo 
{
    public static void main(String args[])
     {
        // Example Usage
        BankAccount bank = new BankAccount(500);
        bank.deposit(200);
        bank.withdraw(50);
     }
}

