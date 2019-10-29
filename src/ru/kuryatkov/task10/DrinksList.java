package ru.kuryatkov.task10;

public enum DrinksList {
    COCA ("Кока Кола", 45),
    PEPSI ("Пепси Кола", 42),
    SPRITE ("Спрайт", 40),
    FANTA ("Фанта", 35);

    private String title;
    private final int cost;

    DrinksList(String title, int cost) {
        this.title = title;
        this.cost = cost;
    }
    public  String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "Для выбора " + title + " нажмите -" + ordinal() + "- цена: " + getCost() + " рублей \n" ;
    }

    public int getCost() {
        return cost;
    }
     public static DrinksList getDrinkById (int num) {
        DrinksList[] array = DrinksList.values();
        for (int i=0; i < array.length; i++ ) {
            if (array[i].ordinal() == num)
            return array[i];
                           }
        return null;
             }

    }
