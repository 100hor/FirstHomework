package org.example;

public class Main {
    public static void main(String[] args) {
        MinMaxEl minMaxEl = new MinMaxEl();
        int [] arr = new int[] {10, 43,25, 54,2435, 2345, 543};
        System.out.println("Найбільший елемент масиву: " + minMaxEl.findMaxEl(arr));
        System.out.println("Найменший елемент масиву: " + minMaxEl.findMinEl(arr));
    }
}