package flyweight;

public class Soju implements Flyweght {
    private final int alcoholContent;

    public Soju(int alcoholContent) {
        this.alcoholContent = alcoholContent;
    }

    @Override
    public void drink() {
        System.out.println(" 소주 도수는 "+alcoholContent+" 입니다.");
    }

    public int getAlcoholContent() {
        return alcoholContent;
    }


}
