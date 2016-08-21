package com.cobot00.csv2json.model;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class CSVDtoTest {

    @Test
    public void test() {
        List<String> header = Arrays.asList("a", "b", "c");
        List<List<String>> values = Arrays.asList(Arrays.asList("1-a", "1-b", "1-c"),
                Arrays.asList("2-a", "2-b", "2-c"));
        CSVDto target = new CSVDto(header, values);

        Map<String, String> actual_0 = target.getValues(0);
        assertThat(actual_0.size(), is(3));
        assertThat(actual_0.get("a"), is("1-a"));
        assertThat(actual_0.get("b"), is("1-b"));
        assertThat(actual_0.get("c"), is("1-c"));

        Map<String, String> actual_1 = target.getValues(1);
        assertThat(actual_1.size(), is(3));
        assertThat(actual_1.get("a"), is("2-a"));
        assertThat(actual_1.get("b"), is("2-b"));
        assertThat(actual_1.get("c"), is("2-c"));
    }

}
