package Advanced_Software_Design.lab5_commandPattern;

public class WithdrawCommand implements Command{

    AccountService accountService;
    double amount;
    String accountNum;

    public WithdrawCommand(AccountService accountService,double amount,String accountNum){
        this.accountService=accountService;
        this.accountNum=accountNum;
        this.amount=amount;
    }
    @Override
    public void execute() {
        accountService.withdraw(accountNum, amount);
    }

    @Override
    public void redo() {
        this.execute();
    }

    @Override
    public void undo() {
        accountService.deposit( accountNum, amount);
    }
}
