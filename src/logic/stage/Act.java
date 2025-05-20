package logic.stage;

import logic.model.MainCharacter;
import logic.model.Restaurant;
import logic.model.Scenery;

import java.util.List;

public class Act {
    private ActNumbers actNumber;
    private MainCharacter mainCharacter;
    private List<Character> secondaryCharacters;
    private Scenery scenery;

    public Act(ActNumbers actNumber) {
        if (actNumber == ActNumbers.I) {
            scenery = new Restaurant();
            this.actNumber = actNumber;
        }
        mainCharacter = new MainCharacter();
    }

    public void assignMainCharacterName(String name) {
        this.mainCharacter.setName(name);
    }

    @Override
    public String toString() {
        return "Act " + actNumber.toString() + ": " + scenery.getSceneryTitle();
    }

}
