package com.sokolov.task1.parser.impl;

import com.sokolov.task1.parser.ArrayParser;

public class ArrayParserImpl implements ArrayParser {

    private static final String SPLIT="(\\s|(\\,\\s))";

    public int[] parseString(String string){
        String[] arrayString=string.split(SPLIT);
        int[] array=new int[arrayString.length];
        for(int i=0;i<array.length;i++){
            array[i]=Integer.parseInt(arrayString[i]);
        }
        return array;
    }
}
