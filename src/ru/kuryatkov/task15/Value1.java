package ru.kuryatkov.task15;

public class Value1 {
    private int id;
    private String joke;
    private String[] categories;

    public Value1() {
    }

    public int getId() {
        return id;
    }

    public String getJoke() {
        return joke;
    }

    public String[] getCategories() {
        return categories;
    }

    @Override
    public String toString() {
        return this.id + " " + this.joke;
    }
}
