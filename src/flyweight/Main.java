package flyweight;

public class Main {
    public static void main(String[] args) {

        Flyweght flyweght1 = FlyweightFactory.getFlyweight(AlcoholType.SOJU);
        Flyweght flyweght2 = FlyweightFactory.getFlyweight(AlcoholType.BEER);
        Flyweght flyweght3 = FlyweightFactory.getFlyweight(AlcoholType.BEER);
        Flyweght flyweght4 = FlyweightFactory.getFlyweight(AlcoholType.WINE);
        Flyweght flyweght5 = FlyweightFactory.getFlyweight(AlcoholType.SOJU);

        flyweght1.drink();
        flyweght2.drink();
        flyweght3.drink();
        flyweght4.drink();
        flyweght5.drink();

        System.out.println(flyweght2+" "+flyweght3);
    }
}
