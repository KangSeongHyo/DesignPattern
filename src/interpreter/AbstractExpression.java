package interpreter;

public abstract class AbstractExpression {
    protected abstract String interpret(Context context,String key) throws Exception;
}
