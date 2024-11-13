class LowBalanceException extends Exception
{
    public LowBalanceException(String msg) 
    {
        super(msg);
    }
}
class NegativeNumberException extends Exception 
{
    public NegativeNumberException(String msg) 
    {
        super(msg);
    }
}
class BankAccount 
{
    public double balance;
    public BankAccount(double initialBalance) 
    {
        this.balance = initialBalance;
    }
    public double balanceEnquiry() 
    {
        return balance;
    }
    public void withdraw(double amount) throws LowBalanceException ,NegativeNumberException
    {
        if (amount < 0) 
        {
            throw new NegativeNumberException("Withdrawal amount can not be negative.");
        }
        if (balance - amount < 0) 
        {
            throw new LowBalanceException("Insufficient amount in account.");
        }
        balance =balance - amount;
        System.out.println("Withdrawal successful.");  //paise 500 kadle
        System.out.println("Remaining balance is : " + balance);
    }
    public void deposit(double amount) throws NegativeNumberException 
    {
        if (amount < 0) 
        {
            throw new NegativeNumberException("Deposit amount can not be negative.");
        }
        balance =balance + amount;
        System.out.println("Deposit is successful."); //paise 200 bharle
        System.out.println(" Updated balance is: " + balance);
    }
}
public class BankApplication
{
    public static void main(String[] args) 
    {
        try {
           BankAccount account = new BankAccount(1000);
           System.out.println("Balance: " + account.balanceEnquiry());
           account.withdraw(500);
           account.deposit(200);
           account.withdraw(800);
           account.deposit(-100);
        } catch (LowBalanceException e) 
        {
            System.err.println("Error: " + e.getMessage());
        } catch (NegativeNumberException e) 
        {
            System.err.println("Error: " + e.getMessage());
        }
    }
}