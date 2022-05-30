package Advanced_Software_Design.lab5_commandPattern;

public interface Command {
    public void execute();
    public void redo();
    public void undo();
}
