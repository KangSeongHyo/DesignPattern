package interpreter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        for (int testIndex = 0; testIndex < 3; testIndex++) {
            String input = scanner.nextLine();
            // 시스템입력 : 위치 [제조사] 찾기 [분류]
            Context context = new Context(input);
            BeginExpression beginExpression = new BeginExpression();
            System.out.println(beginExpression.interpret(context));
        }
    }
}
