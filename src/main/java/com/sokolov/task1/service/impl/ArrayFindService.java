package com.sokolov.task1.service.impl;

import com.sokolov.task1.entity.CustomArray;
import com.sokolov.task1.service.ArrayService;


public class ArrayFindService implements ArrayService{


    @Override
    public void changeNegativeElementsOfArray(CustomArray customArray){
        int[] array= customArray.getArray();
        changeNegative(array);
        customArray.setArray(array);
    }

    private void changeNegative(int[] array){
        for(int i=0;i<array.length;i++){
            if(array[i]<0){
                array[i]=0;
            }
        }
    }
    @Override
    public void changePositiveElementsOfArray(CustomArray customArray){
        int[] array=customArray.getArray();
        changePositive(array);
        customArray.setArray(array);
    }

    private void changePositive(int[] array){
        for(int i=0;i<array.length;i++){
            if(array[i]>0){
                array[i]=1;
            }
        }
    }
    @Override
    public int findSumValue(CustomArray customArray){
        int[] array= customArray.getArray();
        return sumValue(array);
    }

    private int sumValue(int[] array){
        int sum=0;
        for(int i=0;i<array.length;i++){
            sum+=array[i];
        }
        return sum;
    }
    @Override
    public double findAverageValue(CustomArray customArray){
        int[] array= customArray.getArray();
        return averageValue(array);
    }

    private double averageValue(int[] array){
        double average=(double)sumValue(array)/array.length;
        return average;
    }
    @Override
    public long findCountOfPositiveElements(CustomArray customArray){
        int[] array=customArray.getArray();
        return positiveCount(array);
    }

    private long positiveCount(int[] array){
        long k=0;
        for(int i=0;i<array.length;i++){
            if(array[i]>0){
                k++;
            }
        }
        return k;
    }
    @Override
    public long findCountOfNegativeElements(CustomArray customArray){
        int[] array= customArray.getArray();
        return negativeCount(array);
    }

    private long negativeCount(int[] array){
        long k=0;
        for(int i=0;i<array.length;i++){
            if(array[i]<0){
                k++;
            }
        }
        return k;
    }
@Override
    public int findMaxValue(CustomArray customArray){
        int[] array=customArray.getArray();
        return maxValue(array);
    }

    private int maxValue(int[] array){
        int max=array[0];
        for (int i=0;i<array.length;i++){
            if(max<array[i]){
                max=array[i];
            }
        }
        return max;
    }
@Override
    public int findMinValue(CustomArray customArray){
        int[] array=customArray.getArray();
        return minValue(array);
    }

    private int minValue(int[] array){
        int min=array[0];
        for (int i=0;i<array.length;i++){
            if(min>array[i]){
                min=array[i];
            }
        }
        return min;
    }
}
