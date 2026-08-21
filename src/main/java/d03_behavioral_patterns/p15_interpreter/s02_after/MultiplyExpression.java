package d03_behavioral_patterns.p15_interpreter.s02_after;

import java.util.Map;

public class MultiplyExpression implements PostfixExpression{

    private PostfixExpression left, right;

    public MultiplyExpression(PostfixExpression left, PostfixExpression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpret(Map<Character, Integer> context) {
        return left.interpret(context) * right.interpret(context);
    }
}
