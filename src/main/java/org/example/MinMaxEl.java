package org.example;

public class MinMaxEl {

    private void checkArrLength(int arrLength){

        if (arrLength == 0){
            System.out.println("Arrow is empty");
            System.exit(0);
        }


    }
    public int findMaxEl(int [] arr){

        checkArrLength(arr.length);

        int maxEl = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (maxEl < arr[i]){
                maxEl = arr[i];
            }

        }


        return maxEl;
    }

    public int findMinEl(int [] arr){

        checkArrLength(arr.length);

        int minEl = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (minEl > arr[i]){
                minEl = arr[i];
            }

        }


        return minEl;
    }
}
