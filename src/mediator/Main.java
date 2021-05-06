package mediator;

public class Main {

    public static void main(String[] args) {

        Mediator mediator = new AuctionMediator();

        ChineseColleague ch = new ChineseColleague(mediator,10000);
        KoreanColleague ko = new KoreanColleague(mediator,30000);
        JapaneseColleage ja = new JapaneseColleage(mediator,20000);

        mediator.addCollege(ch);
        mediator.addCollege(ko);
        mediator.addCollege(ja);

        mediator.round("Tablet");
        ko.bidding(3000);
        ja.bidding(1000);
        ch.bidding(2000);
        mediator.result();

        mediator.round("Computer");
        ko.bidding(6000);
        ja.bidding(5500);
        ch.bidding(5000);
        mediator.result();

        System.out.println("Korean  Collection["+ko.getCollection()+"]  잔액 : "+ko.getBalance());
        System.out.println("Japanese Collection["+ja.getCollection()+"] 잔액 : "+ja.getBalance());
        System.out.println("Chinese  Collection["+ch.getCollection()+"] 잔액 : "+ch.getBalance());
    }
}
