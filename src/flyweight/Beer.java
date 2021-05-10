package flyweight;

public class Beer implements Flyweght {
    private final int alcoholContent;

    public Beer(int alcoholContent) {
        this.alcoholContent = alcoholContent;
    }
    
    @Override
    public void drink() {
        System.out.println(" 맥주 도수는 "+alcoholContent+" 입니다.");

    }

    public int getAlcoholContent() {
        return alcoholContent;
    }

}
