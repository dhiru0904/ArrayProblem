package com.arrayproblem;

public class ReverseArray {
    public static void main(String args[])
    {
        int arr[]={11,22,33,44,55,99,99};
        System.out.println("Array elements in reverse order ");
        for (int i= arr.length-1;i>=0;i--)
        {
            System.out.println(arr[i]);
        }
    }
}
