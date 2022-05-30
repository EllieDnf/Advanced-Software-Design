package Advanced_Software_Design.lab4_factoryPattern;

import java.util.Collection;

public interface AccountService {
    void setEnvironment(EnvironmentType type);
    Account createAccount(String accountNumber, String customerName);
    Account getAccount(String accountNumber);
    Collection<Account> getAllAccounts();
    void deposit (String accountNumber, double amount);
    void withdraw (String accountNumber, double amount);
    void transferFunds(String fromAccountNumber, String toAccountNumber, double amount, String description);
}
