package logic.model;

/**
 * Represents the main character of the story.
 *
 */
public class MainCharacter implements Character {
    private String name;
    private PersonalFlaws personalFlaw;
    private String targetCompany;

    public MainCharacter() {
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
}
