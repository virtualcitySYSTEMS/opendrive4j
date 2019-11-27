package de.vcs.test.model;

public class Stadt extends TestObject {

    private String name;

    public Stadt() {
    }

    public Stadt(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
