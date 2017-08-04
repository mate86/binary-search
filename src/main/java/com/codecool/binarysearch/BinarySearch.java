package com.codecool.binarysearch;

import java.util.List;

public class BinarySearch {
    public BinarySearch() {
    }

    public int findNumber(int searchedNumber, List<Integer> listOfNumbers) {
        int startIndex = 0;
        int endIndex = listOfNumbers.size() - 1;

        while (startIndex != endIndex) {
            int median = (endIndex + startIndex) / 2;
            for (int i = startIndex; i < endIndex; i++) {
                if (searchedNumber == median) {
                    return listOfNumbers.indexOf(median);
                }
                if (searchedNumber < listOfNumbers.get(median)) {
                    endIndex = median;
                    break;
                } else {
                    startIndex = median;
                    break;
                }
            }
        }

        return startIndex;
    }
}
