package interpreter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DataBase {
    public static Map<String,Map<String, List<String>>> store = new HashMap<>();
    static {
        Map<String, List<String>> samsung = new HashMap<>();
        List<String> stab = new ArrayList<>();
        stab.add("gtab S7");
        stab.add("gtab A7");
        samsung.put("tablet",stab);

        List<String> sphoen = new ArrayList<>();
        sphoen.add("galaxy s20");
        sphoen.add("galaxy fold");
        samsung.put("phone",sphoen);

        store.put("samsung",samsung);

        Map<String, List<String>> apple = new HashMap<>();
        List<String> atab = new ArrayList<>();
        atab.add("ipad air");
        atab.add("ipad pro");
        apple.put("tablet",atab);

        List<String> aphone = new ArrayList<>();
        aphone.add("iphone se");
        aphone.add("iphone 12");
        apple.put("phone",aphone);

        store.put("apple",apple);

    }
}
