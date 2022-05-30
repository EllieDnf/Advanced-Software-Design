package Advanced_Software_Design.lab1_strategyPattern;

public class AccChecking implements AccType {

	
	@Override
	public double intrest(double a) {
		if(a<1000) return 1.5;
		return 2.5;
	}

}
