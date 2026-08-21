package d03_behavioral_patterns.p19_observer.s03_java;

import java.util.concurrent.Flow;
import java.util.concurrent.SubmissionPublisher;

public class FlowInSyncJava {

    public static void main(String[] args) throws InterruptedException {
        Flow.Publisher<String> publisher = new Flow.Publisher<String>() {

            @Override
            public void subscribe(Flow.Subscriber<? super String> subscriber) {
                System.out.println("subscriber...");
                subscriber.onNext("hello flow");
                subscriber.onComplete();
            }
        };

        Flow.Subscriber<String> subscriber = new Flow.Subscriber<String>() {

            @Override
            public void onSubscribe(Flow.Subscription subscription) {
                System.out.println("sub!");
            }

            @Override
            public void onNext(String item) {
                System.out.println("onNext called");
                System.out.println(item);
            }

            @Override
            public void onError(Throwable throwable) {
            }

            @Override
            public void onComplete() {
                System.out.println("completed");
            }
        };

        publisher.subscribe(subscriber);
        System.out.println("위의 처리가 다 끝나야지 출력됩니다.");
    }
}
