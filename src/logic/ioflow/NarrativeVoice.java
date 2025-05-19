package logic.ioflow;

import logic.stage.Act;

public class NarrativeVoice {
    private final Act act;
    private InputHandler inputHandler;

    public NarrativeVoice(Act actToNarrate) {
        this.act = actToNarrate;
    }

    public void narrate() {
        presentScenario();
    }

    private void presentScenario() {
        narrateSlowly(act.toString());
    }



    private void narrateSlowly(String line) {
        for (char letter : line.toCharArray()) {
            System.out.print(letter);
            try {
                Thread.sleep(40);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
