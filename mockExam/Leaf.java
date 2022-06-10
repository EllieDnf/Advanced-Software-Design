package Advanced_Software_Design.mockExam;

public class Leaf extends Component {

    public Leaf(double value) {
        super(value);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
