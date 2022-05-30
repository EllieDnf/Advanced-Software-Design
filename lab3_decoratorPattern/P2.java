package Advanced_Software_Design.lab3_decoratorPattern;

public class P2 extends InterestPromotionDecorator{
    InterestCal interestCal;

    public P2(InterestCal interestCal) {
        this.interestCal= interestCal;
    }
    public double getInterest(double balance) {
        return 2.0 + interestCal.getInterest(balance);
    }

    @Override
    public String getDescription() {
        return "promotion p2 added";
    }
}
