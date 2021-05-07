package observer;


public class Main {
    public static void main(String[] args) {

        YouTuberSubject youTuber = new YouTuberSubject();

        SubscriberObserver subscriber1 = new SubscriberObserver("sub1");
        SubscriberObserver subscriber2 = new SubscriberObserver("sub2");
        SubscriberObserver subscriber3 = new SubscriberObserver("sub3");

        youTuber.subscribe(subscriber1);
        youTuber.subscribe(subscriber2);
        youTuber.subscribe(subscriber3);

        youTuber.upload();

    }
}
