package d03_behavioral_patterns.p13_chain_of_responsibilities.s01_before;

public class RequestHandler {

    public void handler(Request request) {
        System.out.println(request.getBody());
    }
}
