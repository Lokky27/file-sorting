package org.example;

import java.util.List;

/**
 * Интерфейс FileSorter, который предоставляет
 * основные методы для работы со справочником
 */
public interface FileSorter {
    /**
     * метод считывает строки из файла
     * @return Лист строк, содержащихся в файле
     */
    List<String> parseFile();

    /**
     * Метод, который сортирует строки, полученные в методе parseFile();
     * @param parsedContent - лист строк
     * @return возвращает лист отсортированных строк
     */
    List<String> sortFileContent(List<String> parsedContent);

    /**
     * Метод, возвращает количество строк листа, полученного из метода parseFile();
     * @return размер листа строк, полученного в методе parseFile()
     */
    int getLinesOfFile();

}
