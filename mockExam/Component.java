package Advanced_Software_Design.mockExam;

public abstract class Component implements Consumer<Visitor> {
    private Double value;

    public Component(double value) {
        this.value = value;
    }
    public final Double getValue() {
        return value;
    }
}
