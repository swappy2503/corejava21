package inherit3;

public class SavingsAccount extends BankAccount{
    final double interestRate=2.0;
    public double getInterestRate() {
        return interestRate;
    }
    public SavingsAccount() {
        super();
    }
    public SavingsAccount(String accountNumber, String accountHolderName, double balance) {
        super(accountNumber, accountHolderName, balance);
    }
    @Override
    public void withdraw(double amount) {
        double temp= balance - amount;
        if (temp>1000) {
            balance = balance - amount;
        } else {
            System.out.println("Cant withdraw. Balance should be more than 1000");
        }
    }

    static void main() {
        SavingsAccount obj=new SavingsAccount();
        obj.setAccountNumber("123456789");
        obj.setAccountHolderName("John Doe");
        obj.setBalance(1000.0);
        obj.deposit(500.0);
        obj.withdraw(600.0);
        System.out.println("Account Number: " + obj.getAccountNumber());
        System.out.println("Account Holder Name: " + obj.getAccountHolderName());
        System.out.println("Balance: " + obj.getBalance());
    }
}