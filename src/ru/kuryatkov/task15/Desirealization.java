package ru.kuryatkov.task15;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.*;
import java.net.URL;

public class Desirealization {

    public static void main(String[] args) {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.enable(SerializationFeature.INDENT_OUTPUT);
        objectMapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        try {
            URL url = new URL("http://api.icndb.com/jokes/random");
            InputStreamReader isr = new InputStreamReader(url.openStream());
            Test test = objectMapper.readValue(isr, Test.class);
            System.out.println(test.getValue());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}