package de.vcs.test.model;

public class Dorf extends Stadt {

    private String boazn;

    public Dorf() {
    }

    public Dorf(String name, String boazn) {
        super(name);
        this.boazn = boazn;
    }

    public String getBoazn() {
        return boazn;
    }

    public void setBoazn(String boazn) {
        this.boazn = boazn;
    }
}
