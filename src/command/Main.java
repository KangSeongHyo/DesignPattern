package command;

import command.cmd.*;
import command.receiver.MoveReceiver;

import java.util.Arrays;

public class Main {
    public static int[][] map;

    public static void main(String[] args) {
        map = new int[5][5];
        int startX = 0,startY = 0;
        MoveInvoker moveInvoker = new MoveInvoker();
        Command up = new UpCommand(new MoveReceiver());
        Command down = new DownCommand(new MoveReceiver());
        Command left = new LeftCommand(new MoveReceiver());
        Command right = new RightCommand(new MoveReceiver());

        moveInvoker.addCommand(down);
        moveInvoker.addCommand(right);
        moveInvoker.addCommand(down);
        moveInvoker.addCommand(right);
        moveInvoker.addCommand(down);
        moveInvoker.addCommand(left);
        moveInvoker.addCommand(right);
        moveInvoker.addCommand(up);

        map[startX][startY] = 1;
        Position execute = moveInvoker.execute(startX, startY);
        map[execute.getX()][execute.getY()] = 2;
        print();

    }

    private static void print(){
        for (int[] arr: map) {
            System.out.println(Arrays.toString(arr));
        }
        System.out.println();
    }
}
