package de.vcs.test.model;

public class Titel extends TestObject {

    private String name;

    public Titel() {
    }

    public Titel(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
