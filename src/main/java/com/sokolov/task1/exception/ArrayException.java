package com.sokolov.task1.exception;

import java.lang.reflect.Array;

public class ArrayException extends Exception {

    public ArrayException(){

    }

    public ArrayException(String message){
        super(message);
    }

    public ArrayException(String message, Throwable cause){
        super(message,cause);
    }

    public ArrayException(Throwable cause){
        super(cause);
    }
}
