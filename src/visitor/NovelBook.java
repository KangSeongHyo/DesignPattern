package visitor;

import java.util.Map;
import java.util.WeakHashMap;

public class NovelBook implements Book{
    Map<String, Integer> store = new WeakHashMap<>();
    {
        store.put("어린왕자",12000);
        store.put("노인과바다",50000);
        store.put("오늘하루",17000);
    }

    private int price;

    public NovelBook(String name) {
        this.price = store.get(name);
    }

    @Override
    public int accpetPrice(Visitor visitor) {
        return visitor.visit(this);
    }

    public int getPrice() {
        return price;
    }

}
