package d03_behavioral_patterns.p15_interpreter.s02_after;

import java.util.Map;

public interface PostfixExpression {

    int interpret(Map<Character, Integer> context);

}
