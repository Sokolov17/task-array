package com.sokolov.task1.validator;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayValidatorTest {

    @Test
    public void trueValidateStringTest() {
        String test="5 - 7, 9 10";
        boolean actual=ArrayValidator.validateString(test);
        Assert.assertTrue(actual);
    }

    @Test
    public void falseValidateStringTest() {
        String test="5, 7f, 9 - 10";
        boolean actual=ArrayValidator.validateString(test);
        Assert.assertTrue(actual);
    }
}