package command.receiver;

import command.Position;

public class MoveReceiver implements Receiver {
    @Override
    public Position up(int x, int y) {
        int dx = x-1;
        if(isRange(dx)){
            return new Position(dx,y);
        }
        return new Position(x,y);
    }

    @Override
    public Position down(int x, int y) {
        int dx = x+1;
        return new Position(dx,y);
    }

    @Override
    public Position left(int x, int y) {
        int dy = y-1;
        if(isRange(dy)){
            return new Position(x,dy);
        }
        return new Position(x,y);
    }

    @Override
    public Position right(int x, int y) {
        int dy = y+1;
        return new Position(x,dy);
    }

    private boolean isRange(int d){
        return d >= 0;
    }
}
