package org.example.impl;

import org.example.FileSorter;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;

/**
 * Имплементация интерфейса FileSorter
 */
public class FileSorterImpl implements FileSorter {
    /**
     * Строковая переменная обозначающая путь до файла
     */
    private final String pathToFile;

    public FileSorterImpl(String pathToFile) {
        this.pathToFile = pathToFile;
    }

    @Override
    public List<String> parseFile() {
        List<String> lines = new ArrayList<>();
        try {
            lines = Files.readAllLines(Paths.get(pathToFile), StandardCharsets.UTF_8);
        }
        catch (IOException exception) {
            exception.printStackTrace();
        }
        return lines;
    }

    @Override
    public List<String> sortFileContent(List<String> parsedContent) {

        return parsedContent.stream()
                        .sorted(Comparator.comparing(line -> line.split(" ")[0]))
                        .collect(Collectors.toList());
    }

    @Override
    public int getLinesOfFile() {
        int linesOfFile = 0;
        try{
            linesOfFile = Files.readAllLines(Paths.get(pathToFile)).size();
        }
        catch (IOException exception) {
            exception.printStackTrace();
        }
        return linesOfFile;
    }
}
