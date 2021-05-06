package mediator;

import java.util.ArrayList;
import java.util.List;

public class JapaneseColleage extends Colleague{

    private int balance;
    private List<String> collection;

    public JapaneseColleage(Mediator mediator, int balance) {
        super(mediator);
        this.balance = balance;
        collection = new ArrayList<>();
    }

    @Override
    protected void bidding(int paid) {
        balance -=paid;
        mediator.mediate(this,paid);
    }

    @Override
    protected void win(String product) {
        collection.add(product);
    }

    @Override
    protected void lose(int paid) {
        balance +=paid;
    }

    public int getBalance() {
        return balance;
    }

    public String getCollection() {
        return String.join(",", collection);
    }
}
