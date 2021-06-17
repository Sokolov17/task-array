package com.sokolov.task1.service.impl;

import com.sokolov.task1.entity.CustomArray;
import com.sokolov.task1.exception.ArrayException;
import com.sokolov.task1.service.ArrayService;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ArrayStreamFindService implements ArrayService {
    public int findSumValue(CustomArray customArray){
        int[] array=customArray.getArray();
        return sumValue(array);
    }

    private int sumValue(int[] array){
        int sum = Arrays.stream(array).sum();
        return sum;
    }

    public double findAverageValue(CustomArray customArray){
        int[] array=customArray.getArray();
        return averageValue(array);
    }

    private double averageValue(int[] array){
        double average=Arrays.stream(array).average().getAsDouble();
        return average;
    }

    public long findCountOfPositiveElements(CustomArray customArray){
        int[] array=customArray.getArray();
        return findPositiveElements(array);
    }

    private long findPositiveElements(int[] array){
        long count=Arrays.stream(array).filter(x->x>0).count();
        return count;
    }

    public long findCountOfNegativeElements(CustomArray customArray){
        int[] array=customArray.getArray();
        return findNegativeElements(array);
    }

    private long findNegativeElements(int[] array){
        long count=Arrays.stream(array).filter(x->x<0).count();
        return count;
    }

    public void changeNegativeElementsOfArray(CustomArray customArray){
        int[] array=customArray.getArray();
        array=changeNegativeElements(array);
        customArray.setArray(array);
    }

    private int[] changeNegativeElements(int[] array){
        array=Arrays.stream(array).map(x->x<0?0:x).toArray();
        return array;
    }

    public void changePositiveElementsOfArray(CustomArray customArray){
        int[] array=customArray.getArray();
        array=changePositiveElements(array);
        customArray.setArray(array);
    }

    private int[] changePositiveElements(int[] array){
        array=Arrays.stream(array).map(x->x>0?1:x).toArray();
        return array;
    }

    public int findMaxValue(CustomArray customArray){
        int[] array=customArray.getArray();
        return maxValue(array);
    }

    private int maxValue(int[] array){
        int max=Arrays.stream(array).max().getAsInt();
        return max;
    }

    public int findMinValue(CustomArray customArray){
        int[] array=customArray.getArray();
        return minValue(array);
    }

    private int minValue(int[] array){
        int min=Arrays.stream(array).min().getAsInt();
        return min;
    }
}
