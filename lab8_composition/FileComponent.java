package Advanced_Software_Design.lab8_composition;

public abstract class FileComponent {

    public void addComponent(FileComponent c) {
        throw new UnsupportedOperationException("This object does not support this method.");
    }

    public void removeComponent(FileComponent c) {
        throw new UnsupportedOperationException("This object does not support this method.");
    }

    public FileComponent getChild(int i) {
        throw new UnsupportedOperationException("This object does not support this method.");
    }

    public abstract int getSizeInBytes();

    public abstract void print();
}
