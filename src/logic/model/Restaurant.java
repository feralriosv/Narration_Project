package logic.model;

import java.util.List;

public class Restaurant extends Scenery {

    public Restaurant() {
        super("The Restaurant", List.of(new MainCharacter(), new Employer()));
    }

}
