package Advanced_Software_Design.lab5_commandPattern;

public class DepositCommand implements Command{
    AccountService accountService;
    double amount;
    String accountNum;

    public DepositCommand(AccountService accountService,double amount, String accountNum ){
        this.accountService=accountService;
        this.amount=amount;
        this.accountNum=accountNum;
    }

    @Override
    public void execute() {
        accountService.deposit( accountNum, amount);
    }

    @Override
    public void redo() {
        this.execute();
    }

    @Override
    public void undo() {
        accountService.withdraw(accountNum, amount);
    }
}
