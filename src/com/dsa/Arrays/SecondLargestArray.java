package com.dsa.Arrays;

//find the first and second largest element in array
public class SecondLargestArray{
    public static void main(String[] args) {
        int[] array = {10, 5, 30, 40, 35, 20, 31};
        int firstlargest = Integer.MIN_VALUE;
        int secondlargest = Integer.MIN_VALUE;

        for(int i = 0; i < array.length; i++) {
            if(array[i] > firstlargest) {
                secondlargest = firstlargest;
                firstlargest = array[i];
            } else if(array[i] > secondlargest && array[i] != firstlargest) {
                secondlargest = array[i];
            }
        }
        System.out.println("First largest element : " +firstlargest);
        System.out.print("Second largest element : " +secondlargest);
    }
}