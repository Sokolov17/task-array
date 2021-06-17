package com.sokolov.task1.creator.impl;

import com.sokolov.task1.creator.ArrayCreator;
import com.sokolov.task1.entity.CustomArray;

public class ArrayCreatorImpl implements ArrayCreator {
    public CustomArray createArray(int[] array){
        CustomArray customArray=new CustomArray(array);
        return customArray;
    }
}
