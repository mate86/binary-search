package com.codecool.binarysearch;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BinarySearchTest {
    List<Integer> sortedList = GenerateList.generateSortedList(1000000);

    @Test
    void findNumberInSortedList() {
        BinarySearch binarySearch = new BinarySearch();
        int elementIndex = binarySearch.findNumber(7237, sortedList);
        assertEquals(7236, elementIndex);
    }
}
