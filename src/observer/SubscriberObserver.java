package observer;

public class SubscriberObserver implements Observer{

    private String id;
    public SubscriberObserver(String id) {
        this.id = id;
    }

    @Override
    public void notice() {
        System.out.println(id +" : 영상 업로드 PUSH 알림받음");
    }
}
