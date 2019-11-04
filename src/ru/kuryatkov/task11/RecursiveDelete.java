package ru.kuryatkov.task11;

import java.io.File;
import java.io.IOException;

public class RecursiveDelete {
    public static void main(String[] args) {
        create();
        delete(new File("test"));
    }
    private static void create() {
        try {
            new File("test/dir/dir1/dir2/").mkdirs();
            new File("test/dir/dir2/dir3").mkdirs();
            new File("test/test.txt").createNewFile();
            new File("test/dir/test.txt").createNewFile();
            new File("test/dir/dir1/dir2/test.txt").createNewFile();
            } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("файлы и каталоги созданы!");
    }

    private static void delete(File root) {
        if (root.exists()){
            if (root.isDirectory()){
                for (File file : root.listFiles()) {
                delete(file);
                }
            }
            root.delete();
        }
        }

}
