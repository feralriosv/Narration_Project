import logic.stage.Act;
import logic.stage.ActNumbers;
import logic.ioflow.StoryTeller;

public class StoryProgram {
    public static void main(String[] args) {
        Act act = new Act(ActNumbers.I);
        StoryTeller narrativeVoice = new StoryTeller(act);
        narrativeVoice.narrate();
    }
}
