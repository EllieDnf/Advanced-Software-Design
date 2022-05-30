package Advanced_Software_Design.lab1_strategyPattern;

import java.util.Collection;

public interface AccountService {
    Account createAccount(String accountNumber,AccType accType, String customerName);
    Account getAccount(String accountNumber);
    Collection<Account> getAllAccounts();
    void deposit (String accountNumber, double amount);
    void withdraw (String accountNumber, double amount);
    void transferFunds(String fromAccountNumber, String toAccountNumber, double amount, String description);
}
