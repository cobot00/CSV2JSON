package com.cobot00.csv2json.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class CSVDto {

    private final List<String> header;
    private final List<List<String>> values;

    public Map<String, String> getValues(int index) {
        Map<String, String> result = new HashMap<>();
        List<String> line = values.get(index);
        for (int i = 0; i < header.size(); i++) {
            result.put(header.get(i), line.get(i));
        }
        return result;
    }

}
