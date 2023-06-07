package org.example;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FileSorterTest {

    private static String path;
    private static List<String> lines;

    @BeforeAll
    public static void init() {
        Path pathToFile = Paths.get(path);
        try {
            BufferedReader bufferedReader = Files.newBufferedReader(pathToFile);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
    @Test
    void parseFile() {
    }

    @Test
    void sortFileContent() {
    }

    @Test
    void getCountOfRaws() {
    }
}