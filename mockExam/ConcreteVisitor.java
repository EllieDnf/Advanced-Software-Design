package Advanced_Software_Design.mockExam;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class ConcreteVisitor implements Visitor, Supplier<Component> {
    List<Component> componentList = new ArrayList<>() ;

    @Override
    public void visit(Composite composite) {
        componentList.add(composite);
    }

    @Override
    public void visit(Leaf leaf) {
        componentList.add(leaf);
    }

    @Override
    public Component get() {
        return (Component) componentList;
    }
}
