package d03_behavioral_patterns.p13_chain_of_responsibilities.s02_after;

import d03_behavioral_patterns.p13_chain_of_responsibilities.s01_before.Request;

public class LoggingRequestHandler extends RequestHandler {

    public LoggingRequestHandler(RequestHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void handle(Request request) {
        System.out.println("로깅");
        super.handle(request);
    }
}
