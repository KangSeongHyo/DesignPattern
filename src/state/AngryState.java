package state;

public class AngryState implements EmotionState{
    @Override
    public EmotionState behavior() {
        System.out.println("버럭이 : 모니터를 때립니다.");
        System.out.println("버럭이 : 모니터 액정이 깨졌습니다.");
        return new SadState();
    }
}
