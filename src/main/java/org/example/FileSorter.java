package org.example;

import java.util.List;

public interface FileSorter {

    List<String> parseFile(String path);

    List<String> sortFileContent(List<String> parsedData);

    int getCountOfRaws(String path);

}
