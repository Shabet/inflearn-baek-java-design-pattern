package d03_behavioral_patterns.p23_visitor.s02_after;

public class Client {

    public static void main(String[] args) {
        Shape rectangle = new Rectangle();
        Device device = new Pad();
        rectangle.accept(device);
    }
}
