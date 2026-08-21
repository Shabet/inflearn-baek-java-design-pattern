package d03_behavioral_patterns.p19_observer.s03_java.t05_spring;

public class MyEvent {

    private String message;

    public MyEvent( String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
