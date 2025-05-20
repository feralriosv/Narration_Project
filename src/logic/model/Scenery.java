package logic.model;

import java.util.List;

public abstract class Scenery {
    private final String sceneryTitle;
    public Scenery(String sceneryTitle, List<logic.model.Character> characters) {
        this.sceneryTitle = sceneryTitle;
    }
    public String getSceneryTitle() {
        return sceneryTitle;
    }
}
