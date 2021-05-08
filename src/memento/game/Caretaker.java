package memento.game;

public class Caretaker {

    public void save(GameInventoryOriginator gameInventory){
        gameInventory.saveGame();
    }

    public void load(GameInventoryOriginator gameInventory){
        gameInventory.loadGame();
    }

}
