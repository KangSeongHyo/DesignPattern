package state;

public class HumanContext {

    private EmotionState emotionState;

    public HumanContext(EmotionState emotionState) {
        this.emotionState = emotionState;
    }
    public void behavior(){
       emotionState = emotionState.behavior();
    }

    public void setEmotionState(EmotionState emotionState) {
        this.emotionState = emotionState;
    }
}
