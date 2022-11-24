package com.arrayproblem;

public class SmallestElement {
    public static void main(String[] args) {
        int arr[]={11,22,33,44,55,99};
        int Minimum=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<Minimum)
                Minimum=arr[i];
        }
        System.out.println("Smallest Element Of Array----"+Minimum);
    }
}
