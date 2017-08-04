package com.codecool.binarysearch;

import java.util.ArrayList;
import java.util.List;

public class GenerateList {
    public GenerateList() {
    }

    public static List<Integer> generateSortedList(int listSize) {
        List<Integer> generatedList = new ArrayList<>();
        for (int i = 0; i < listSize; i++) {
            generatedList.add(i + 1);
        }
        return generatedList;
    }
}
