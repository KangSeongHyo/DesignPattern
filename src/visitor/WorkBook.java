package visitor;

import java.util.Map;
import java.util.WeakHashMap;

public class WorkBook implements Book{
    Map<String, Integer> store = new WeakHashMap<>();
    {
        store.put("영어문법",15000);
        store.put("수리가형문제집",10000);
        store.put("한국사100제",30000);
    }

    private int price;

    public WorkBook(String bookName) {
        this.price = store.get(bookName);
    }

    @Override
    public int accpetPrice(Visitor visitor) {
        return visitor.visit(this) ;
    }

    public int getPrice() {
        return this.price;
    }
}
