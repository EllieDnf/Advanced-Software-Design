package Advanced_Software_Design.lab5_commandPattern;

public class TransferFundsCommand implements Command{

    AccountService accountService;
    double amount;
    String accountNum;
    String toAccNum;
    String description;

    public TransferFundsCommand(AccountService accountService){
        this.accountService=accountService;
    }

    @Override
    public void execute() {
        accountService.transferFunds(accountNum,toAccNum, amount,description);
    }

    @Override
    public void redo() {
        this.execute();
    }

    @Override
    public void undo() {
        accountService.transferFunds(toAccNum , accountNum, amount,"return money: "+description);

    }
}
