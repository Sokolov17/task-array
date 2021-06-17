package com.sokolov.task1.service;

import com.sokolov.task1.entity.CustomArray;

public interface SortService {
    void quickSort(CustomArray array);
    void bubbleSort(CustomArray array);
    void insertionSort(CustomArray array);
}
