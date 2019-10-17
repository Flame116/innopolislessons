package ru.kuryatkov.task9;

public enum Food {
    APPLE ("Яблоко", true, "Вкусненько"),
    PORRIDGE ("Каша", false, "--"),
    SOUP ("Суп", false, "---"),
    PIZZA ("Пицца", true, "+++");

    private String title;
    private boolean eat;
    private String message;

    Food(String title, boolean eat, String message) {
        this.title = title;
        this.eat = eat;
        this.message = message;
    }

    public String getTitle() {
        return title;
    }

    public boolean isEat() {
        return eat;
    }

    public String getMessage() {
        return message;
    }
    public static Food getFoodByTitle(String eda){
        for (Food f: Food.values()
             ) { if (eda.equals(f.getTitle()));
             return f;
        }
        return null;
    }
}
