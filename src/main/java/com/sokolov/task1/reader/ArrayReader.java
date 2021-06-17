package com.sokolov.task1.reader;

import com.sokolov.task1.entity.CustomArray;
import com.sokolov.task1.exception.ArrayException;

public interface ArrayReader {
    String readStringOfArray(String path) throws ArrayException;
}
