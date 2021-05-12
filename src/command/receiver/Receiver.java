package command.receiver;

import command.Position;

public interface Receiver {
    Position up(int x, int y);
    Position down(int x, int y);
    Position left(int x, int y);
    Position right(int x, int y);
}
