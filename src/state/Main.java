package state;

public class Main {

    public static void main(String[] args) {
        HumanContext humanContext = new HumanContext(new HappyState());
        humanContext.behavior();

        humanContext.setEmotionState(new AngryState());
        humanContext.behavior();
        humanContext.behavior();

    }
}
