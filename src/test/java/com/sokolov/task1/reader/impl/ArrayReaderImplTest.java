package com.sokolov.task1.reader.impl;

import com.sokolov.task1.exception.ArrayException;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayReaderImplTest{

    String path=".//src//main//resources//array.txt";
    ArrayReaderImpl reader=new ArrayReaderImpl();

    @Test
    public void readStringOfArrayTest() throws ArrayException {
        String expected="5 2 3 7";
        String actual=reader.readStringOfArray(path);
        Assert.assertEquals(expected,actual);
    }
}