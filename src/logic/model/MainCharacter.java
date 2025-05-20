package logic.model;

public class MainCharacter implements Character {
    private String name;
    private PersonalFlaw personalflaw;
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
