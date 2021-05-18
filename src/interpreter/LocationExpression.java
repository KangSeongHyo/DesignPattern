package interpreter;

public class LocationExpression extends AbstractExpression{

    private AbstractExpression abstractExpression;
    @Override
    protected String interpret(Context context, String key) throws Exception {
        key = context.nextToken();
        String process = context.nextToken();
        if("찾기".equals(process)){
            abstractExpression = new FindExpression();
        }
        if("삭제".equals(process)){
            abstractExpression = new DeleteExpression();
        }

       return abstractExpression.interpret(context, key);
    }
}
