package Advanced_Software_Design.lab9_statePattern;

public class HighSpeedState implements State{

    CeilingFan ceilingFan;

    public HighSpeedState(CeilingFan ceilingFan) {
        this.ceilingFan=ceilingFan;
    }

    @Override
    public void redButton() {
        System.out.println("medium speed");
        ceilingFan.setCurrentState(new MediumSpeedState(ceilingFan));
    }

    @Override
    public void greenButton() {
        System.out.println("turning off");
        ceilingFan.setCurrentState(new OffState(ceilingFan));
    }
}
