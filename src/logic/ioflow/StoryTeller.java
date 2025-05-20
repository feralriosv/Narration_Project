package logic.ioflow;

import logic.stage.Act;
/**
 * This class represents the StoryTeller of the story.
 * It is responsible for managing the narration flow of the story.
 */
public class StoryTeller {
    private final Act act;
    private final Prompter prompter;

    public StoryTeller(Act actToNarrate) {
        this.act = actToNarrate;
        this.prompter = new Prompter();
    }

    public void narrate() {
        setUpStory();
    }

    private void setUpStory() {
        String name = prompter.promptCharacterName();
        act.assignMainCharacterName(name);
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
