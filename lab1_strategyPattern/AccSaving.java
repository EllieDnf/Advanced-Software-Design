package Advanced_Software_Design.lab1_strategyPattern;

public class AccSaving implements AccType {

	@Override
	public double intrest(double a) {
		if(a<1000) return 1;
		else if(a>1000 && a<5000) return 2;
		return 4;
	}

}
