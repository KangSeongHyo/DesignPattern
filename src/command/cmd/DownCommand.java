package command.cmd;

import command.Position;
import command.receiver.Receiver;

public class DownCommand implements Command {

    private final Receiver receiver;

    public DownCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public Position execute(int x, int y) {
        return receiver.down(x,y);
    }
}
