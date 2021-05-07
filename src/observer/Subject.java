package observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {

    List<Observer>  observerList = new ArrayList<>();

    protected final void addObserver(Observer observer){
        observerList.add(observer);
    }

    protected final void removeObserver(Observer observer){
        observerList.remove(observer);
    }

    public abstract void notifyObservers();
    public abstract void upload();

}
