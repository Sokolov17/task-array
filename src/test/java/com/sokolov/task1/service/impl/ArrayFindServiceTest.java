package com.sokolov.task1.service.impl;

import com.sokolov.task1.entity.CustomArray;
import com.sokolov.task1.service.ArrayService;
import com.sokolov.task1.service.impl.ArrayFindService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayFindServiceTest {

    private static final Logger logger= LogManager.getLogger();

    static ArrayService service=new ArrayFindService();
    CustomArray array=new CustomArray(-5,0,10,-23,11,-5,0,-9,15,16);

    @Test
    public void findSumValueTest() {
        int expected=10;
        int actual=service.findSumValue(array);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void findAverageValueTest() {
        double expected=1.0;
        double actual=service.findAverageValue(array);
        Assert.assertEquals(expected,actual,0.1);
    }

    @Test
    public void findCountOfPositiveElementsTest() {
        long expected=4;
        long actual=service.findCountOfPositiveElements(array);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void findCountOfNegativeElementsTest() {
        long expected=6;
        long actual=service.findCountOfNegativeElements(array);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void changeNegativeElementsOfArrayTest() {
        int[] expected=new int[]{0,0,10,0,11,0,0,0,15,16};
        service.changeNegativeElementsOfArray(array);
        int[] actual=array.getArray();
        Assert.assertArrayEquals(expected,actual);
    }

    @Test
    public void changePositiveElementsOfArrayTest() {
        int[] expected=new int[]{-5,0,1,-23,1,-5,0,-9,1,1};
        service.changePositiveElementsOfArray(array);
        int[] actual=array.getArray();
        Assert.assertArrayEquals(expected,actual);
    }

    @Test
    public void findMaxValueTest() {
        int expected=16;
        int actual=service.findMaxValue(array);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void findMinValueTest() {
        int expected=-23;
        int actual=service.findMinValue(array);
        Assert.assertEquals(expected,actual);
    }
}