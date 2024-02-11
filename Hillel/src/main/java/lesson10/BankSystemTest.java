package lesson10;

public class BankSystemTest {
    public static void main(String[] args) {
        Customer customer = new Customer();

        BankAccount checkingAccount = new BankAccount("12345", 1000);
        SavingsAccount savingsAccount = new SavingsAccount("67890", 5000, 2);

        customer.addAccount(checkingAccount);
        customer.addAccount(savingsAccount);

        checkingAccount.deposit(500);
        savingsAccount.withdraw(100);

        savingsAccount.applyInterest();

        System.out.println("Total balance: " + customer.getTotalBalance());
    }
}
