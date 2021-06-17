package com.sokolov.task1.service;

import com.sokolov.task1.entity.CustomArray;

public interface ArrayService {
    int findSumValue(CustomArray customArray);
    double findAverageValue(CustomArray customArray);
    long findCountOfPositiveElements(CustomArray customArray);
    long findCountOfNegativeElements(CustomArray customArray);
    void changeNegativeElementsOfArray(CustomArray customArray);
    void changePositiveElementsOfArray(CustomArray customArray);
    int findMaxValue(CustomArray customArray);
    int findMinValue(CustomArray customArray);
}
