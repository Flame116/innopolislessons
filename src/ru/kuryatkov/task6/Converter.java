package ru.kuryatkov.task6;

public class Converter {
    public static void main(String[] args) {
        Dogovor dogovor = new Dogovor(1, "06/10/2019", "servise");
        Act act = convertDogovorToAct(dogovor);
        System.out.println(act.date);
    }

    public static Act convertDogovorToAct(Dogovor dogovor) {
        Act act = new Act();
        act.setDate(dogovor.getDate());
        act.setNum(dogovor.getNum());
        act.setServise(dogovor.getServise());
        return act;

    }

}
