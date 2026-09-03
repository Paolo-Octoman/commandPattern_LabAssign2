package commandPattern;

public class Hub {
    private Command cmd;
    
    public void setCommand(Command cmd) {
        this.cmd = cmd;
    }

    public void click() {
        if (cmd == null) {
            System.out.println("No command assigned.");
            return;
        }
        cmd.execute();
    }
}
