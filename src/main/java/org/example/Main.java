package org.example;

import org.example.impl.FileSorterImpl;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

public class Main {
    private static Properties properties = new Properties();;
    public static void main(String[] args) {
        try {
            properties.load(new FileInputStream("src/main/resources/config.properties"));
            FileSorter sorter = new FileSorterImpl(properties.getProperty("path"));
            sorter.sortFileContent(sorter.parseFile()).forEach(System.out::println);


        } catch (IOException e) {
            System.err.println("File not Found!");
        }

    }
}