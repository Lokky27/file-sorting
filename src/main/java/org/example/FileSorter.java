package org.example;

import java.io.IOException;
import java.util.List;

public interface FileSorter {

    List<String> parseFile() throws IOException;

    List<String> sortFileContent(List<String> parsedContent);

    int getLinesOfFile() throws IOException;

}
