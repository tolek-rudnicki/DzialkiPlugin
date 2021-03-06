package com.github.tolek.dzialki.plot;

public enum Type {
    NONE("NONE"),
    STORE("STORE");

    private String name;

    Type(String name) {
        this.name = name == null ? "NONE" : name;
    }

    public String toString() {
        return name;
    }
}
