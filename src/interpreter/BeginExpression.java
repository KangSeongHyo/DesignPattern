package interpreter;

public class BeginExpression extends AbstractExpression{
    private final AbstractExpression abstractExpression = new LocationExpression();

    public String interpret(Context context) throws Exception {
        return interpret(context,"");
    }
    @Override
    protected String interpret(Context context, String key) throws Exception {
        if("위치".equals(context.nextToken())){
           return abstractExpression.interpret(context,key);
        }
        throw new Exception("시작구문 오류");
    }
}
