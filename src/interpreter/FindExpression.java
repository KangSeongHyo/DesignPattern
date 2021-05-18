package interpreter;

import java.util.Collections;
import java.util.List;
import java.util.Map;

public class FindExpression extends AbstractExpression{


    @Override
    protected String interpret(Context context, String key) {
        String productType = context.nextToken();
        Map<String, List<String>> itemMap = DataBase.store.get(key);
        StringBuilder data = new StringBuilder(key).append(" : ");

        List<String> productList = itemMap.getOrDefault(productType, Collections.emptyList());

        data.append(String.join(",",productList));
        return data.toString();
    }
}
