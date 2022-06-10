package Advanced_Software_Design.lab9_statePattern;

public class LowSpeedState implements State {

    CeilingFan ceilingFan;

    public LowSpeedState(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void redButton() {
        System.out.println("turning off");
        ceilingFan.setCurrentState(new OffState(ceilingFan));
    }

    @Override
    public void greenButton() {
        System.out.println("medium speed");
        ceilingFan.setCurrentState(new MediumSpeedState(ceilingFan));
    }
}
