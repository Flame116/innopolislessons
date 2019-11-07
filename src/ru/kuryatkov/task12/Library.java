package ru.kuryatkov.task12;

import java.io.*;

public class Library {

   static File file = new File("library.txt");

    public static void main(String[] args) {
        Book book = new Book();
        book.setName("Крёстный отец");
        book.setAutor("Марио Пьюзо");
        book.setYear("1969");
        Book book1 = new Book();
        book1.setName("12 стульев");
        book1.setAutor("Илья Ильф");
        book1.setYear("1927");
        Book book2 = new Book();
        book2.setName("Сборник стихов");
        book2.setAutor("Сергей Есенин");
        book2.setYear("1925");
        saveBooks(book, book1, book2);
        loadBooks();


    }
    public static void saveBooks (Book... books) {
        System.out.println("сохраняем книги: " );
        if (!file.exists()){
            for (Book book : books) {
                System.out.println(book.toString());
            }
            try (
                    FileOutputStream fos = new FileOutputStream(file);
                    ObjectOutputStream oos = new ObjectOutputStream(fos);
            ) {
                oos.writeObject(books);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            Book[] temp = loadBooks();
            Book[] temp1 = new Book[temp.length + books.length];
            int i;
            for (i = 0; i < temp.length; i++){
                temp1[i] = temp[i];
            }
            int j;
            for (j = temp.length; j < books.length; j++) {
                temp1[i] = books[j];
                i++;
            }
            for (Book book : books) {
                System.out.println(book.toString());
            }
            try (
                    FileOutputStream fos = new FileOutputStream(file);
                    ObjectOutputStream oos = new ObjectOutputStream(fos);
            ) {
                    oos.writeObject(temp1);

            } catch (IOException e) {
                e.printStackTrace();
            }

        }


    }

    public static  Book[] loadBooks() {
        Book[] books = null;
        try
                 {FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
            books = (Book[]) ois.readObject();
        } catch ( IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("Читаем библиотеку: ");
        for (Book book : books) {
           if (book != null)
            System.out.println(book.toString());
        }
        return books;
    }

}
