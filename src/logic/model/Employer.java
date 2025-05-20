package logic.model;

public class Employer implements Character {
    private String name;
    String workingCompany;

    public Employer() {
        setName("Benjamin");
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
