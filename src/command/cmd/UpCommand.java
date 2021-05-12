package command.cmd;

import command.Position;
import command.receiver.Receiver;

public class UpCommand implements Command {
    private final Receiver receiver;

    public UpCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public Position execute(int x, int y) {
        return receiver.up(x,y);
    }
}
