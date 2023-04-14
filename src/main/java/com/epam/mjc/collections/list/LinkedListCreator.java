package com.epam.mjc.collections.list;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LinkedListCreator {
    public LinkedList<Integer> createLinkedList(List<Integer> sourceList) {
        List<Integer> l = sourceList.stream().filter(element -> element % 2 == 1).collect(Collectors.toList());
        Collections.reverse(l);
        return Stream.concat(l.stream(),sourceList.stream().filter(element -> element % 2 == 0)).collect(Collectors.toCollection(LinkedList::new));
    }
}
