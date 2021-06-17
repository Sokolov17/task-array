package com.sokolov.task1.service.impl;

import com.sokolov.task1.entity.CustomArray;
import com.sokolov.task1.service.SortService;
import org.junit.Assert;
import org.junit.Test;

import java.util.Currency;

import static org.junit.Assert.*;

public class ArrayStreamSortServiceTest {

    CustomArray array=new CustomArray(5,-3,7,2,6,2,6,0,10);
    SortService service=new ArrayStreamSortService();

    @Test
    public void bubbleSortTest() {
        int[] expected=new int[]{-3,0,2,2,5,6,6,7,10};
        service.bubbleSort(array);
        int[] actual=array.getArray();
        Assert.assertArrayEquals(expected,actual);
    }

    @Test
    public void quickSortTest() {
        int[] expected=new int[]{-3,0,2,2,5,6,6,7,10};
        service.quickSort(array);
        int[] actual=array.getArray();
        Assert.assertArrayEquals(expected,actual);
    }

    @Test
    public void insertionSortTest() {
        int[] expected=new int[]{-3,0,2,2,5,6,6,7,10};
        service.insertionSort(array);
        int[] actual=array.getArray();
        Assert.assertArrayEquals(expected,actual);
    }
}