package command;

import command.cmd.Command;

import java.util.LinkedList;
import java.util.Queue;

public class MoveInvoker {
    private Queue<Command> queue;

    public MoveInvoker() {
        this.queue = new LinkedList<>();
    }
    public void addCommand(Command command){
        this.queue.add(command);
    }

    public Position execute(int x, int y){
        while (!queue.isEmpty()){
            Command command = queue.poll();
            Position newPosition = command.execute(x, y);
            x = newPosition.getX();
            y = newPosition.getY();
        }
        return new Position(x,y);
    }
}
