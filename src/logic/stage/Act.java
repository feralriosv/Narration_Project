package logic.stage;

import logic.model.Restaurant;
import logic.model.Scenery;

public class Act {
    private ActNumbers actNumber;
    private Scenery scenery;

    public Act(ActNumbers actNumber) {
        if (actNumber == ActNumbers.I) {
            scenery = new Restaurant();
            this.actNumber = actNumber;
        }
    }

    @Override
    public String toString() {
        return "Act " + actNumber.toString() + ": " + scenery.getSceneryTitle();
    }

}
