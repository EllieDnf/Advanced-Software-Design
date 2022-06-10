package Advanced_Software_Design.lab9_statePattern;

public class CeilingFan {

    State currents;

    public CeilingFan() {
        this.currents = new OffState(this);
    }

    public void setCurrentState(State currentState) {
        this.currents = currentState;
    }

    public void pullRed(){
        currents.redButton();
    }
    public void pullGreen(){
        currents.greenButton();
    }
}
