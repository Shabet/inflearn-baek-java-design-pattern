package d03_behavioral_patterns.p23_visitor.s02_after;

public interface Device {
    void print(Circle circle);

    void print(Rectangle rectangle);

    void print(Triangle triangle);
}
