package com.dsa;

public class SecondLargestArray {
    public static void main(String[] args) {
        int[] arr = { 2, 4, 17, 13, 15};
        int largest = arr[0];
        int secondlargest = Integer.MIN_VALUE;

        for(int i = 1; i < arr.length; i++) {
            if(arr[i] > largest) {
                largest = arr[i];
                secondlargest = arr[0];

            }
            else if(arr[i] > secondlargest && arr[i] < largest) {
                secondlargest = arr[i];
            }
            }
        System.out.println("Largest element : " + largest);
        System.out.println("second largest element : " +secondlargest);
        }
    }
