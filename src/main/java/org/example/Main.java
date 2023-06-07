package org.example;

import org.example.impl.FileSorterImpl;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

/**
 * @author Vasilii Laktiushin
 * Класс запускающий приложение
 */
public class Main {
    /**
     * Путь до файла считывается из файла config.properties
     * и для этого используем Properties
     */
    private static Properties properties = new Properties();

    public static void main(String[] args) {
        try (FileInputStream fileInputStream = new FileInputStream("src/main/resources/config.properties")) {
            properties.load(fileInputStream);
            FileSorter sorter = new FileSorterImpl(properties.getProperty("path"));
            sorter.sortFileContent(sorter.parseFile()).forEach(System.out::println);

        }
        catch (IOException e) {
            e.printStackTrace();
            System.err.println("File not Found!");
        }

    }
}