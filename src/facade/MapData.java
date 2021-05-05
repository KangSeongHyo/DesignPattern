package facade;

import java.util.Map;
import java.util.WeakHashMap;

public class MapData {

    Map<Integer,String> store = new WeakHashMap<>();
    {
        store.put(1,"YOU");
        store.put(2,"WILL");
        store.put(3,"B");
        store.put(4,"FINE");
        store.put(5,"BLOG");
    }

    public String getData(int ...keyArray){
        StringBuilder sb = new StringBuilder();
        for(int key:keyArray){
            sb.append(store.get(key)).append(" ");
        }
        return sb.toString();
    }

}
