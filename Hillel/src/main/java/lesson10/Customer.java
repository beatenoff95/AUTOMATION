package lesson10;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private List<BankAccount> accounts = new ArrayList<>();

    public void addAccount(BankAccount account) {
        if (account != null) {
            accounts.add(account);
        }
    }

    public void removeAccount(BankAccount account) {
        accounts.remove(account);
    }

    public double getTotalBalance() {
        double total = 0;
        for (BankAccount account : accounts) {
            total += account.getBalance();
        }
        return total;
    }
}
