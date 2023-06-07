package org.example.impl;

import org.example.FileSorter;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;

public class FileSorterImpl implements FileSorter {
    private final String pathToFile;

    public FileSorterImpl(String pathToFile) {
        this.pathToFile = pathToFile;
    }

    @Override
    public List<String> parseFile() throws IOException {
        Path path = Paths.get(pathToFile);
        return Files
                .lines(path)
                .collect(Collectors.toList());

    }

    @Override
    public List<String> sortFileContent(List<String> parsedContent) {

        return parsedContent.stream()
                        .sorted(Comparator.comparing(line -> line.split(" ")[0]))
                        .collect(Collectors.toList());
    }

    @Override
    public int getLinesOfFile() throws IOException {
        return Files.readAllLines(Paths.get(pathToFile)).size();
    }
}
