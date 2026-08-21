package d03_behavioral_patterns.p13_chain_of_responsibilities.s02_after;

import d03_behavioral_patterns.p13_chain_of_responsibilities.s01_before.Request;

public class AuthRequestHandler extends RequestHandler {

    public AuthRequestHandler(RequestHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void handle(Request request) {
        System.out.println("인증이 되었는가?");
        super.handle(request);
    }
}
