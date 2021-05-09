package state;

public class HappyState implements EmotionState{
    @Override
    public EmotionState behavior() {
        System.out.println("행복이 : 웃고있습니다.");
        return this;
    }
}
