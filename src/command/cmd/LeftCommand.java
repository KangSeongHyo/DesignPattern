package command.cmd;

import command.Position;
import command.receiver.Receiver;

public class LeftCommand implements Command {
    private final Receiver receiver;

    public LeftCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public Position execute(int x, int y) {
        return receiver.left(x,y);
    }
}
