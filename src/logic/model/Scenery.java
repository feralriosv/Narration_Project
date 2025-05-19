package logic.model;

import java.util.List;

public class Scenery {
    private final String sceneryTitle;
    private final List<logic.model.Character> characters;

    public Scenery(String sceneryTitle, List<logic.model.Character> characters) {
        this.sceneryTitle = sceneryTitle;
        this.characters = characters;
    }

    public String getSceneryTitle() {
        return sceneryTitle;
    }

    public List<Character> getCharacters() {
        return characters;
    }
}
