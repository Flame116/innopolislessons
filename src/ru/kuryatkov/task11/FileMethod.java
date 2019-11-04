package ru.kuryatkov.task11;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;


public class FileMethod {
    public static void main(String[] args) throws IOException {
        File file = new File("test.txt");
        try {
            System.out.println("Создаём файл: " + file.getAbsolutePath() + " результат - " + file.createNewFile());
        } catch (IOException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
        if (file.exists()) {
            System.out.println("Переименовываем файл: " + file.renameTo(new File("test1.txt")));
            }
        Path path1 = Paths.get("C:\\Users\\Flame\\IdeaProjects\\innopolis\\src\\ru\\kuryatkov\\test1.txt");
        Path path2 = Paths.get("C:\\Users\\Flame\\IdeaProjects\\innopolis\\src\\ru\\kuryatkov\\test2.txt");
        try {
            Path path = Files.copy(path1, path2, StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            e.printStackTrace();
        }
        File file2 = path2.toFile();
        if (file2.exists()){
                System.out.println("Пытаемся удалить файл: " + file2.getAbsolutePath() + " результат - " +file2.delete());
            }
    }

}

