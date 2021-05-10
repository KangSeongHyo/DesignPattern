package flyweight;

import java.util.Map;
import java.util.WeakHashMap;

public class FlyweightFactory {
    private static Map<AlcoholType,Flyweght> pool = new WeakHashMap<>();

    public static Flyweght getFlyweight(AlcoholType alcoholType){
        if (!pool.containsKey(alcoholType)) {
            if (AlcoholType.BEER == alcoholType) {
                pool.put(alcoholType, new Beer(5));
            }
            if (AlcoholType.SOJU == alcoholType) {
                pool.put(alcoholType, new Soju(17));
            }
            if (AlcoholType.WINE == alcoholType) {
                pool.put(alcoholType, new Wine(10));
            }
        }
        return pool.get(alcoholType);
    }
}
