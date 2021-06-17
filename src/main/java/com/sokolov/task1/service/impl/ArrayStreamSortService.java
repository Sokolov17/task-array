package com.sokolov.task1.service.impl;

import com.sokolov.task1.entity.CustomArray;
import com.sokolov.task1.service.SortService;

import java.util.Arrays;

public class ArrayStreamSortService implements SortService {
    @Override
    public void bubbleSort(CustomArray customArray) {
        int[] array= customArray.getArray();
        array=Arrays.stream(array).sorted().toArray();
        customArray.setArray(array);
    }

    @Override
    public void quickSort(CustomArray customArray) {
        int[] array= customArray.getArray();
        array=Arrays.stream(array).sorted().toArray();
        customArray.setArray(array);
    }

    @Override
    public void insertionSort(CustomArray customArray) {
        int[] array= customArray.getArray();
        array=Arrays.stream(array).sorted().toArray();
        customArray.setArray(array);
    }
}
