package ru.kuryatkov.task9;

public class Chield {

        public void eat(String title) throws Exception {
         Food food = Food.getFoodByTitle(title);
            System.out.println(food.getMessage());
            if (!food.isEat()){
                throw new Exception("Я не ем это");
            }
         }
    }


