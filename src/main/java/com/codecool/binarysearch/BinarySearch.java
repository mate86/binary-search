package com.codecool.binarysearch;

import java.util.List;

public class BinarySearch {
    private int startIndex;
    private int endIndex;

    public BinarySearch() {
    }

    public int findNumber(int searchedNumber, List<Integer> listOfNumbers) {
        endIndex = listOfNumbers.size() - 1;

        while (startIndex != endIndex) {
            int median = (endIndex + startIndex) / 2;

            if (searchedNumber - 1 == median) {
                return median;
            }
            if (searchedNumber < listOfNumbers.get(median)) {
                endIndex = median;
            } else {
                startIndex = median;
            }
        }
        return startIndex;
    }
}
