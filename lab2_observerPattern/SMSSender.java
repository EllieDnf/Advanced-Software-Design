package Advanced_Software_Design.lab2_observerPattern;

public class SMSSender implements Observer {

    private Subject subject;
    public SMSSender(Subject subject) {
        this.subject = subject;
        subject.registerObserver(this);
    }

	@Override
	public void update(Account account, ActionType action) {
        System.out.printf("%15s%30s%20s%20s\n", "Informational SMS: ", action, "Account# ",account.getAccountNumber());
		
	}


}
