package com.codecool.binarysearch;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BinarySearchTest {
    List<Integer> sortedList = GenerateList.generateSortedList(1000000);

    @Test
    void findNumberInSortedList() {
        BinarySearch binarySearch = new BinarySearch();
        long startTime = System.nanoTime();
        int elementIndex = binarySearch.findNumber(237, sortedList);
        long elapsedTime = System.nanoTime() - startTime;
        assertEquals(236, elementIndex);
        System.out.println("Searching time: " + elapsedTime * Math.pow(10, -6) + " milliseconds");
    }
}
