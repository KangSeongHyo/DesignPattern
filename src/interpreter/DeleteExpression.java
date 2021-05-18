package interpreter;

import java.util.List;
import java.util.Map;

public class DeleteExpression extends AbstractExpression {
    @Override
    protected String interpret(Context context, String key) {
        String productType = context.nextToken();
        Map<String, List<String>> itemMap = DataBase.store.get(key);
        List<String> remove = itemMap.remove(productType);

        return "remove " + remove.size() + " rows";
    }
}
