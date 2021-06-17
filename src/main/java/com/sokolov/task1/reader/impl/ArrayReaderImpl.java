package com.sokolov.task1.reader.impl;

import com.sokolov.task1.entity.CustomArray;
import com.sokolov.task1.exception.ArrayException;
import com.sokolov.task1.reader.ArrayReader;
import com.sokolov.task1.validator.ArrayValidator;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ArrayReaderImpl implements ArrayReader {


    public String readStringOfArray(String path) throws ArrayException{
        String line;
        try {
            BufferedReader br = new BufferedReader(new FileReader(path));
            line= br.readLine();
            while(line!=null){
                if(ArrayValidator.validateString(line)){
                    break;
                }
                line= br.readLine();
            }
        }catch (FileNotFoundException e) {
            throw new ArrayException();
        }
        catch
        (IOException ex){
            throw new ArrayException();
        }
        return line;
    }
}
