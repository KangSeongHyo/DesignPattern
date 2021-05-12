package command.cmd;

import command.Position;
import command.receiver.Receiver;

public class RightCommand implements Command {
    private final Receiver receiver;

    public RightCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public Position execute(int x, int y) {
        return receiver.right(x,y);
    }
}
