package com.dsa;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {12, 4, 9, 15, 13};
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            for(int j = 0; j < n - i - 1; j++) {
                if(arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println("Sorted array is : ");
        for(int i = 0; i < arr.length; i++) {
            int num = arr[i];
            System.out.print(num + " ");
        }
    }
}
