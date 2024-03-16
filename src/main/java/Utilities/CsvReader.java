package Utilities;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CsvReader {
    public String readFirstLine(String fileName) throws IOException {
        List<String> lines = Files.readAllLines(Path.of(fileName));
        String firstLine = lines.get(0);
        return firstLine;
    }

    public List<String> readFirstKLines(String fileName, int k) throws IOException {
        List<String> lines = Files.readAllLines(Path.of(fileName));
        return new ArrayList<>(lines.subList(1, Math.min(k + 1, lines.size())));
    }

    public List<StatsFrom3Days> readAllStatsByCountry(String fileName, String filterCountry) throws IOException {
        List<String> lines = Files.readAllLines(Path.of(fileName));
        return lines.stream()
                .skip(1)
                .map(StatsFrom3Days::new)
                .filter(stats -> (filterCountry == null || filterCountry.isEmpty()) || stats.getNation().equalsIgnoreCase(filterCountry))
                .collect(Collectors.toList());
    }
}