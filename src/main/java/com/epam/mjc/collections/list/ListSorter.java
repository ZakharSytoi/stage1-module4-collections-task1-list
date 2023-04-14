package com.epam.mjc.collections.list;

import java.util.Comparator;
import java.util.List;

public class ListSorter {
    public void sort(List<String> sourceList) {
        sourceList.sort(new ListComparator());
    }
}

class ListComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        if(Math.abs(Integer.parseInt(a)) ==Math.abs(Integer.parseInt(b))){
            return Integer.compare((Integer.parseInt(a)),(Integer.parseInt(b)));
        }
        return Integer.compare(Math.abs(Integer.parseInt(a)),Math.abs(Integer.parseInt(b)));
    }
}
