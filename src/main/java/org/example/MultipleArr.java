package org.example;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MultipleArr {
    public ArrayList<Integer> showMultipleArr(int [] arr, int dev){

        ArrayList<Integer> newArr = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % dev == 0){
                newArr.add(arr[i]);
            }
        }

        return newArr;
    }

}
