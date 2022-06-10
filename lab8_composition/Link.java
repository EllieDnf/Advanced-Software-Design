package Advanced_Software_Design.lab8_composition;

public class Link extends FileComponent {

    FileComponent target;

    public Link(FileComponent target) {
        super();
        this.target = target;
    }
    @Override
    public int getSizeInBytes() {
        return target.getSizeInBytes();
    }

    @Override
    public void print() {
        System.out.print("[added link] ");
        target.print();
    }
}
