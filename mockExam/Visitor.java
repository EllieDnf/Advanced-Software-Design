package Advanced_Software_Design.mockExam;

public interface Visitor {
    void visit(Composite composite);
    void visit(Leaf leaf);
}
