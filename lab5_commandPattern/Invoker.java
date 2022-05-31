package Advanced_Software_Design.lab5_commandPattern;

public class Invoker {

    Command[] commands;
    Command lastCommand;

    public Invoker() {

        commands = new Command[3];
        Command noCommand = new NoCommand();

        for(int i=0;i<3;i++) {
            commands[i] = noCommand;
        }

        lastCommand = noCommand;
    }

    public void setCommand(int slot, Command command) {
        commands[slot] = command;
    }

    public void buttonPushed(int slot) {
        commands[slot].execute();
        lastCommand = commands[slot];
    }

    public void undoButtonPushed() {
        lastCommand.undo();
    }

    public void redoButtonPushed(){
        lastCommand.redo();
    }

    public String toString() {
        StringBuffer stringBuff = new StringBuffer();
        stringBuff.append("\n-------------\n");
        for (int i = 0; i < commands.length; i++) {
            stringBuff.append("[slot " + i + "] " + commands[i].getClass().getSimpleName());
        }
        stringBuff.append("[undo] " + lastCommand.getClass().getSimpleName() + "\n");
        return stringBuff.toString();
    }
}
