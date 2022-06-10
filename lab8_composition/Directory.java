package Advanced_Software_Design.lab8_composition;

import java.util.ArrayList;
import java.util.List;

public class Directory extends FileComponent {
    protected String name;
    List<FileComponent> children;

    public Directory(String name) {
        this.name = name;
        this.children = new ArrayList<FileComponent>();
    }

    public void print(){
        System.out.println("-- dir "+name+" size="+getSizeInBytes()+" bytes");
        for (FileComponent c : children) {
            c.print();
        }
    }

    @Override
    public void addComponent(FileComponent c) {
        this.children.add(c);
    }

    @Override
    public void removeComponent(FileComponent c) {
        this.children.remove(c);
    }

    @Override
    public FileComponent getChild(int i) {
        return this.children.get(i);
    }

    @Override
    public int getSizeInBytes() {
        int size = 0;
        for (FileComponent c : children) {
            size += c.getSizeInBytes();
        }

        return size;
    }
}
