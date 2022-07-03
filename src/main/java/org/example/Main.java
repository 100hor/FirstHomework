package org.example;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MinMaxEl minMaxEl = new MinMaxEl();
        BubbleSort bubbleSort = new BubbleSort();
        Scanner scanner =  new Scanner(System.in);
        System.out.print("Введіть довжину масиву: ");
        int arrLength = scanner.nextInt();
        int [] arr = new int[arrLength];
        Random random = new Random();
        for (int i = 0; i < arrLength; i++) {
            arr[i] = random.nextInt();
            //System.out.print(arr[i] + " ");
        }
        long time = System.currentTimeMillis();
        bubbleSort.sortArrow(arr);
        System.out.println("time: " + (System.currentTimeMillis() - time));

//        for (int i = 0; i < arrLength; i++) {
//            System.out.print(arr[i] + " ");
//        }
        System.out.println();
        // System.out.println("Найбільший елемент масиву: " + minMaxEl.findMaxEl(arr));
        // System.out.println("Найменший елемент масиву: " + minMaxEl.findMinEl(arr));
    }
}