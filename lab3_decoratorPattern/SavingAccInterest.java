package Advanced_Software_Design.lab3_decoratorPattern;

public class SavingAccInterest extends InterestCal {

	@Override
	public double getInterest(double a) {
		if(a<1000) return 1;
		else if(a>1000 && a<5000) return 2;
		return 4;
	}

}
