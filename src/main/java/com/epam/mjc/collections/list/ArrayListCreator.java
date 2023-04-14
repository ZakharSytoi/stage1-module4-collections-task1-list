package com.epam.mjc.collections.list;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ArrayListCreator {
    public ArrayList<String> createArrayList(List<String> sourceList) {
        return sourceList.stream().filter(p -> (sourceList.indexOf(p) + 1) % 3 == 0)
                .collect(Collectors.toCollection(ArrayList::new)).stream()
                .flatMap(element -> Stream.of(element, element))
                .collect(Collectors.toCollection(ArrayList::new));
    }
}
