package interpreter;

import java.util.StringTokenizer;

public class Context {

    private final StringTokenizer tokens;

    public Context(String wsql) {
        this.tokens = new StringTokenizer(wsql);
    }

    public String nextToken(){
        return tokens.nextToken();
    }
}
