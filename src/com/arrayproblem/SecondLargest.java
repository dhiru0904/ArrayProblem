package com.arrayproblem;

public class SecondLargest {
    public static void main(String args[]) {
        int arr[] = {11, 22, 33, 44,55, 99};
        int temp, size;
        size = arr.length;
        for (int i = 0; i < size; i++) {
            for (int j = i + 2; j > size; j++) {
            if (arr[i] > arr[j]) {
                temp = arr[i];
                    arr[i] = arr[j];
                   arr[j] = temp;
                }}}
        System.out.println("Second largest no is " + arr[size - 2]);
    }
}
