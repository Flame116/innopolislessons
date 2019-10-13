package ru.kuryatkov.task6;

public class Dogovor {
   private int num;
   private String date;
   private String servise;
    Dogovor(int num, String date, String servise){
        this.num = num;
        this.date = date;
        this.servise = servise;

    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getServise() {
        return servise;
    }

    public void setServise(String servise) {
        this.servise = servise;
    }
}
