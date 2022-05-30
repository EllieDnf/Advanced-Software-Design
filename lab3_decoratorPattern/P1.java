package Advanced_Software_Design.lab3_decoratorPattern;

public class P1 extends InterestPromotionDecorator {

    InterestCal interestCal;

    public P1(InterestCal interestCal) {
        this.interestCal= interestCal;
    }
    public double getInterest(double balance) {
        return 1.0 + interestCal.getInterest(balance);
    }

    @Override
    public String getDescription() {
        return "promotion p1 added";
    }
}
