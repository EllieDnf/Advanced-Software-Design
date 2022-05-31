package Advanced_Software_Design.app;

import Advanced_Software_Design.lab5_commandPattern.*;

import java.time.Clock;

public class ApplicationCommand {

	public static void display(AccountService accountService) {
		for (Account account : accountService.getAllAccounts()) {
			Customer customer = account.getCustomer();
			System.out.println("Statement for Account: " + account.getAccountNumber());
			System.out.println("Account Holder: " + customer.getName());

			System.out.println("-Date-------------------------"
					+ "-Description------------------"
					+ "-Amount-------------");

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
	public static void main(String[] args) {
		AccountService accountService = new AccountServiceImpl();

		// create 2 accounts;
		accountService.createAccount("1263862", "Frank Brown");
		accountService.createAccount("4253892", "John Doe");
		// use account 1;
		accountService.deposit("1263862", 240);
		accountService.deposit("1263862", 529);
		accountService.withdraw("1263862", 230);
		// use account 2;
		accountService.deposit("4253892", 12450);
		accountService.transferFunds("4253892", "1263862", 100, "payment of invoice 10232");
		// show balances

		DepositCommand dp = new DepositCommand(accountService,100,"1263862" );

		WithdrawCommand wc = new WithdrawCommand(accountService,50.0,"1263862");

		TransferFundsCommand tc = new TransferFundsCommand(accountService,70.0,"4253892","1263862","utility.");


		Invoker invoker = new Invoker();
		invoker.setCommand(0, dp);
		invoker.setCommand(1, tc);
		invoker.setCommand(2, wc);

		invoker.buttonPushed(0);
//		invoker.buttonPushed(0);
		invoker.buttonPushed(1);
		invoker.undoButtonPushed();
//		invoker.undoButtonPushed();
//		invoker.buttonPushed(1);
//		invoker.redoButtonPushed();
//		invoker.undoButtonPushed();
//		invoker.buttonPushed(2);
//		invoker.undoButtonPushed();

//		invoker.undoButtonPushed();
//		invoker.undoButtonPushed();
//		invoker.undoButtonPushed();
		display(accountService);
	}

}
