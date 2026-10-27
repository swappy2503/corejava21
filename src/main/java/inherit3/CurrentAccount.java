package inherit3;

public class CurrentAccount extends BankAccount {

    @Override
    public void withdraw(double amount) {
        double temp= balance - amount;
        if (temp>5000) {
            balance = balance - amount;
        } else {
            System.out.println("Cant withdraw. Balance should be more than 5000");

        }
    }

    static void main() {
        BankAccount c=new CurrentAccount();
        c.setAccountNumber("987654321");
        c.setAccountHolderName("Jane Smith");
        c.setBalance(10000.0);
        c.deposit(2000.0);
        c.withdraw(6000.0);
        System.out.println("Balance: " + c.getBalance());


        CurrentAccount obj=(CurrentAccount) c;
    }
}
