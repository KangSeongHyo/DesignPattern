package state;

public class SadState implements EmotionState{
    @Override
    public EmotionState behavior() {
        System.out.println("슬픔이 : 울고있습니다.");
        return this;
    }
}
