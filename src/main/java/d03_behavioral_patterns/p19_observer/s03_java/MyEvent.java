package d03_behavioral_patterns.p19_observer.s03_java;

import org.springframework.context.ApplicationEvent;

public class MyEvent {

    private String message;

    public MyEvent(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
