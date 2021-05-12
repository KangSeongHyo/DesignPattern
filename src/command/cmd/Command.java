package command.cmd;

import command.Position;

public interface Command {
    Position execute(int x, int y);
}
