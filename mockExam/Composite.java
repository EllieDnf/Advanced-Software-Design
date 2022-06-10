package Advanced_Software_Design.mockExam;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Component {

    List<Component> componentList = new ArrayList<>();

    public Composite(double value) {
        super(value);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
        for (Component component:componentList) {
            component.accept(visitor);
        }
    }
}
