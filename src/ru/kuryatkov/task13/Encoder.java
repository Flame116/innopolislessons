package ru.kuryatkov.task13;

import java.io.*;
import java.nio.charset.Charset;

public class Encoder {
    public static void main(String[] args) throws IOException {
        String hello = "Привет!";
        save("windows1251.txt", hello, "windows-1251");
        encode("windows1251.txt", "windows-1251");


    }

    private static void save(String fileName, String hello, String encoding) {
        try(OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(fileName), encoding)) {
            osw.write(hello);
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void encode(String fromFileName, String fromEncoding) {
        String result = "";
        try (InputStreamReader isr = new InputStreamReader(new FileInputStream(fromFileName),fromEncoding)) {
            char[] buffer = new char[8192];
            int size;
            while ((size = isr.read(buffer)) > 0) {
                result += new String(buffer, 0, size);
            }
        }catch (IOException e) {
                e.printStackTrace();
            }
        try (FileOutputStream fos = new FileOutputStream("encoded.txt")) {
                    fos.write(result.getBytes(Charset.forName("UTF8")));
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
}