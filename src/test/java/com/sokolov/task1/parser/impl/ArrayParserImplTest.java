package com.sokolov.task1.parser.impl;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayParserImplTest {

    @Test
    public void parseStringTest() {
        ArrayParserImpl parser=new ArrayParserImpl();
        int[] expected=new int[]{5,1,10,2,4,11,6};
        int[] actual=parser.parseString("5 1, 10, 2, 4 11 6");
        Assert.assertArrayEquals(expected,actual);
    }
}