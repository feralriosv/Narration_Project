package logic.model;

public abstract class Character {
    private String name;
    public Character() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
