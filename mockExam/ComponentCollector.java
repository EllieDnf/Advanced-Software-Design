package Advanced_Software_Design.mockExam;

import java.util.function.Supplier;

public class ComponentCollector implements Supplier<Component>, Visitor {

    private Component greater;

    public Component get() {
        return greater;
    }

    public void visit(Composite composite) {
        if (greater == null) greater = composite;
        if (greater.getValue() < composite.getValue()) greater = composite;
    }

    public void visit(Leaf leaf) {
        if (greater == null) greater = leaf;
        if (greater.getValue() < leaf.getValue()) greater = leaf;
    }
}

