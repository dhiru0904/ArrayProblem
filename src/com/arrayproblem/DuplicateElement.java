package com.arrayproblem;

public class DublicateElement {
    public static void main(String args[]) {
        int arr[] = {5, 4, 3, 2, 1, 4, 3};
        System.out.println("Duplicate elements in array ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j])
                    System.out.println(arr[j]);
            }
        }
    }
}