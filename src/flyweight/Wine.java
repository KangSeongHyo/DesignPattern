package flyweight;

public class Wine implements Flyweght{
    private final int alcoholContent;

    public Wine(int alcoholContent) {
        this.alcoholContent = alcoholContent;
    }

    @Override
    public void drink() {
        System.out.println(" 와인 도수는 "+alcoholContent+" 입니다.");
    }

    public int getAlcoholContent() {
        return alcoholContent;
    }
}
