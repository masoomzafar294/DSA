package com.dsa;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {3, 7, 10, 15, 5};
        int n = arr.length;

        for(int i = 0; i < n - 1; i++) {
            int miniIndex = i;

            for(int j = i + 1; j < n; j++) {
                if(arr[j] < arr[miniIndex]) {
                    miniIndex = j;
                }
            }

            int temp = arr[miniIndex];
            arr[miniIndex] = arr[i];
            arr[i] = temp;
        }

        System.out.println("Sorting arr is : ");
        for(int i = 0; i < arr.length; i++) {
            int num = arr[i];
            System.out.print(num + " ");
        }
    }
}
