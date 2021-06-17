package com.sokolov.task1.entity;

public class CustomArray {

    private int[] array;

    public CustomArray(int ... array) {
        this.array=array;
    }


    public int[] getArray() {
        return array.clone();
    }

    public void setArray(int ... array) {
        this.array=array;
    }

}
