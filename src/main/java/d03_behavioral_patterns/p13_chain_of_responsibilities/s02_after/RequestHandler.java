package d03_behavioral_patterns.p13_chain_of_responsibilities.s02_after;

import d03_behavioral_patterns.p13_chain_of_responsibilities.s01_before.Request;

public abstract class RequestHandler {

    private RequestHandler nextHandler;

    public RequestHandler(RequestHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public void handle(Request request) {
        if (nextHandler != null) {
            nextHandler.handle(request);
        }
    }
}
