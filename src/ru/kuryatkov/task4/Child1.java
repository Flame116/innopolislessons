package ru.kuryatkov.task4;

public class Child1 extends Parent {

    private int uniqField;

    public Child1(int age, int uniqField) {
        super(age);
        this.uniqField = uniqField;
    }

    public int getUniqField() {
        return uniqField;
    }

    public void setUniqField(int uniqField) {
        this.uniqField = uniqField;
    }

    @Override
    public void name() {
        System.out.println("Я ребёнок");
    }
}
