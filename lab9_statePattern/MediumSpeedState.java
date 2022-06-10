package Advanced_Software_Design.lab9_statePattern;

public class MediumSpeedState implements State {

    CeilingFan ceilingFan;

    public MediumSpeedState(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void redButton() {
        System.out.println("low speed");
        ceilingFan.setCurrentState(new LowSpeedState(ceilingFan));
    }

    @Override
    public void greenButton() {
        System.out.println("high speed");
        ceilingFan.setCurrentState(new HighSpeedState(ceilingFan));
    }
}
