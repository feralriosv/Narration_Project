import logic.stage.Act;
import logic.stage.ActNumbers;
import logic.ioflow.NarrativeVoice;

public class StoryProgram {
    public static void main(String[] args) {
        Act act = new Act(ActNumbers.I);
        NarrativeVoice narrativeVoice = new NarrativeVoice(act);
        narrativeVoice.narrate();
    }
}
