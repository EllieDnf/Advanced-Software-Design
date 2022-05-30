package Advanced_Software_Design.lab3_decoratorPattern;

public class P3 extends InterestPromotionDecorator {
    InterestCal interestCal;

    public P3(InterestCal interestCal) {
        this.interestCal= interestCal;
    }
    public double getInterest(double balance) {
        return 3.0 + interestCal.getInterest(balance);
    }

    @Override
    public String getDescription() {
        return "promotion p1 added";
    }
}
