package memento.game;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GameInventoryOriginator {

    private List<String> inventory;
    private Stack<Memento> mementoStack;

    public GameInventoryOriginator() {
        this.inventory = new ArrayList<>();
        this.mementoStack = new Stack<>();
    }

    public void obtainItem(String item){
        inventory.add(item);
    }

    public void printInventory(){
        System.out.println(String.join(", ",inventory));
    }

    void saveGame(){
        mementoStack.push(new Memento(new ArrayList<>(inventory)));
    }

    void loadGame(){
        Memento memento = mementoStack.pop();
        inventory = memento.getInventory();
    }

    private class Memento {

        private final List<String> inventory;

        Memento(List<String> inventory) {
            this.inventory = inventory;
        }

        List<String> getInventory() {
            return inventory;
        }
    }
}
