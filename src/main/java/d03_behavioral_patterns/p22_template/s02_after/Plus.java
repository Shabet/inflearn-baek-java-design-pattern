package d03_behavioral_patterns.p22_template.s02_after;

public class Plus implements Operator {
    @Override
    public int getResult(int result, int number) {
        return result += number;
    }
}
