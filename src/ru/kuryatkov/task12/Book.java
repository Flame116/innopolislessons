package ru.kuryatkov.task12;

import java.io.Serializable;

public class Book implements Serializable {
    final static long serialVersionUID = 11;
    String name;
    String autor;
    String year;

    public Book(String name, String autor, String year) {
        this.name = name;
        this.autor = autor;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public Book() {
    }

    @Override
    public String toString() {
        return String.format("Книга [ Название = %s, автор = %s, год издания = %s]\n", name, autor, year);
    }
}
