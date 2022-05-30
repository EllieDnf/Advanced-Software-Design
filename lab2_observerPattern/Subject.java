package Advanced_Software_Design.lab2_observerPattern;


public interface Subject {
	public void registerObserver(Observer o);
	public void removeObserver(Observer o);
	public void notifyObservers(Account account, ActionType action);

}
