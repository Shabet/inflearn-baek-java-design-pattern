package d03_behavioral_patterns.p23_visitor.s02_after;

public class Circle implements Shape {

    @Override
    public void accept(Device device) {
        device.print(this);
    }
}
