package com.sokolov.task1.service.impl;

import com.sokolov.task1.entity.CustomArray;
import com.sokolov.task1.service.ArrayService;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayStreamFindServiceTest {

    CustomArray array=new CustomArray(5,-6,0,1,0,-7,-8,15,9,1);
    ArrayService service=new ArrayStreamFindService();

    @Test
    public void findSumValueTest() {
        int expected=10;
        int actual= service.findSumValue(array);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void findAverageValueTest() {
        double expected=1.0;
        double actual= service.findAverageValue(array);
        Assert.assertEquals(expected,actual,0.1);
    }

    @Test
    public void findCountOfPositiveElementsTest() {
        long expected=5L;
        long actual=service.findCountOfPositiveElements(array);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void findCountOfNegativeElementsTest() {
        long expected=3L;
        long actual=service.findCountOfNegativeElements(array);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void changeNegativeElementsOfArrayTest() { //// FIXME: 16.06.2021 
        int[] expected=new int[]{5,0,0,1,0,0,0,15,9,1};
        service.changeNegativeElementsOfArray(array);
        int[] actual= array.getArray();
        Assert.assertArrayEquals(expected,actual);
    }

    @Test
    public void changePositiveElementsOfArrayTest() { //// FIXME: 16.06.2021
        int[] expected=new int[]{1,-6,0,1,0,-7,-8,1,1,1};
        service.changePositiveElementsOfArray(array);
        int[] actual= array.getArray();
        Assert.assertArrayEquals(expected,actual);
    }

    @Test
    public void findMaxValueTest() {
        int expected=15;
        int actual=service.findMaxValue(array);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void findMinValueTest() {
        int expected=-8;
        int actual=service.findMinValue(array);
        Assert.assertEquals(expected,actual);
    }
}