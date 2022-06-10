package Advanced_Software_Design.lab8_composition;

public class Drive {
    protected String name;
    protected FileComponent rootDir;

    public Drive(String name, FileComponent rootDir) {
        this.name = name;
        this.rootDir = rootDir;
    }

    public int computeSize() {
        return rootDir.getSizeInBytes();
    }

    public void print() {
        System.out.println("- drive " + name);
        rootDir.print();
    }
}
