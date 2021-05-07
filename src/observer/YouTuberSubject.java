package observer;

public class YouTuberSubject extends Subject {


    public void subscribe(SubscriberObserver observer){
        super.addObserver(observer);
    }

    public void unsubscribe(SubscriberObserver observer){
        super.removeObserver(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observerList) {
            observer.notice();
        }
    }

    @Override
    public void upload() {
        notifyObservers();
    }
}
