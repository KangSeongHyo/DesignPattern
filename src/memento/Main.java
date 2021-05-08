package memento;

import memento.game.Caretaker;
import memento.game.GameInventoryOriginator;

public class Main {
    public static void main(String[] args) {
        Caretaker caretaker = new Caretaker();
        GameInventoryOriginator game = new GameInventoryOriginator();
        
        game.obtainItem("포션");
        game.obtainItem("화살");
        game.obtainItem("5성지팡이");
        game.printInventory();
        caretaker.save(game);

        game.obtainItem("양손검");
        game.obtainItem("불길한상자");
        game.printInventory();
        caretaker.load(game);

        game.printInventory();

    }
}
