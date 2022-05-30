package Advanced_Software_Design.app;

import Advanced_Software_Design.lab3_decoratorPattern.*;

public class ApplicationDecorator {
	public static void main(String[] args) {
		AccountService accountService = new AccountServiceImpl();
		InterestCal checking = new CheckingAccInterest();
		checking = new P1(checking);
		checking = new P2(checking);
		checking = new P3(checking);

		InterestCal saving = new SavingAccInterest();

		// create 4 accounts;
		accountService.createAccount("1263862", checking , "Frank Brown");
		accountService.createAccount("1263863", saving , "Frank Brown");
		accountService.createAccount("4253893", checking, "John Doe");
		accountService.createAccount("4253892", saving, "John Doe");

		// use account 1;
		accountService.deposit("1263862", 240);
		accountService.deposit("1263862", 529);
		accountService.withdraw("1263862", 230);

		// use account 2;
		accountService.deposit("1263863", 529);
		accountService.withdraw("1263863", 230);

		// use account 3;
		accountService.deposit("4253893", 12450);
		accountService.withdraw("4253893", 230);

		// use account 4;
		accountService.deposit("4253892", 12450);
		accountService.transferFunds("4253892", "1263862", 100, "payment of invoice 10232");

		// show balances
		for (Account account : accountService.getAllAccounts()) {
			Customer customer = account.getCustomer();
			System.out.println("Statement for Account: " + account.getAccountNumber());
			System.out.println("Account Holder: " + customer.getName());
			System.out.print("Account type: "+account.getInterestCal().getClass().getSimpleName());
			System.out.println("   Interest rate is: "+account.getInterestCal().getInterest(account.getBalance())+"%");
			System.out.println("-Date------------------------------------------" 
					+ "-Description-------------" 
					+ "-Amount");
			
			for (AccountEntry entry : account.getEntryList()) {
				System.out.printf("%30s%30s%20.2f\n", 
						entry.getDate().toString(), 
						entry.getDescription(),
						entry.getAmount());
			}
			
			System.out.println("----------------------------------------" + "----------------------------------------");
			System.out.printf("%30s%30s%20.2f\n\n", "", "Current Balance:", account.getBalance());
		}
	}

}
