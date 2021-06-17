package com.sokolov.task1.service.impl;

import com.sokolov.task1.service.SortService;
import com.sokolov.task1.entity.CustomArray;


public class ArraySortService implements SortService {
    public void quickSort(CustomArray array){
        int[] arr=array.getArray();
        qSort(arr,0,arr.length-1);
        array.setArray(arr);
    }
    private void qSort(int[] array,int l,int r){
        int i = l, j = r, x, t;
        x = array[(i + j) / 2];


        while (i <= j) {

            while (array[i] < x && i < array.length - 1) {
                i++;
            }

            while (array[j] > x && j > 0) {
                j--;
            }

            if (i <= j) {
                t = array[i];
                array[i] = array[j];
                array[j] = t;
                i++;
                j--;
            }

        }

        if (l < j) {
            qSort(array, l, j);
        }

        if (i < r) {
            qSort(array, i, r);
        }
    }

    public void bubbleSort(CustomArray array){
        int[] arr=array.getArray();
        bSort(arr);
        array.setArray(arr);
    }

    private void bSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    public void insertionSort(CustomArray array){
        int[] arr=array.getArray();
        iSort(arr);
        array.setArray(arr);
    }

    private void iSort(int[] array) {
           for(int left=0;left<array.length;left++){
               int value=array[left];
               int i=left-1;
               for(;i>=0;i--){
                   if(value<array[i]){
                       array[i+1]=array[i];
                   } else{
                       break;
                   }
               }
               array[i+1]=value;
           }
       }
}
