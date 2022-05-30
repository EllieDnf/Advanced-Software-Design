package Advanced_Software_Design.lab3_decoratorPattern;

public class CheckingAccInterest extends InterestCal {

	@Override
	public double getInterest(double a) {
		if(a<1000) return 1.5;
		return 2.5;
	}

}
