package com.pinki.class12;

public class Cartoon {

    private String name;
    private String about;
    private int inage;

    public Cartoon(String name, String about, int inage) {
        this.name = name;
        this.about = about;
        this.inage = inage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public int getInage() {
        return inage;
    }

    public void setInage(int inage) {
        this.inage = inage;
    }
}
