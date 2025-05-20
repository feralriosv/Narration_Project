package logic.model;

public class Restaurant implements Scenery {
    private String name;
    public Restaurant() {

    }

    @Override
    public String getSceneryName() {
        return name;
    }

    @Override
    public void setSceneryName(String name) {
        this.name = name;
    }
}
