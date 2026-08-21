package d03_behavioral_patterns.p23_visitor.s01_before;

public class Circle implements Shape {
    @Override
    public void printTo(Device device) {
        if (device instanceof Phone) {
            System.out.println("print Circle to phone");
        } else if (device instanceof Watch) {
            System.out.println("print Circle to watch");
        }
    }
}
