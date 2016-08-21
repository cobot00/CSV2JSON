package com.cobot00.csv2json.io;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.cobot00.csv2json.model.CSVDto;

public class CSVReader {

    public CSVDto read(String filePath) {
        List<String> lines = new TextFileReader().read(filePath);
        List<List<String>> csv = lines.stream().map(this::parse).collect(Collectors.toList());

        List<String> header = csv.get(0);
        List<List<String>> values = csv.subList(1, csv.size() - 1);
        return new CSVDto(header, values);
    }

    private List<String> parse(String line) {
        String[] fields = line.split(",");
        return Arrays.asList(fields);
    }

}
