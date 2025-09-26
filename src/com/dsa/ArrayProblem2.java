package com.dsa;

import java.util.Arrays;

public class ArrayProblem2 {
    public static double FindMedianSortedArray(int[] num1, int[] num2) {
       int[] merged = new int[num1.length + num2.length];
       System.arraycopy(num1, 0, merged, 0, num1.length );
       System.arraycopy(num2, 0, merged, num1.length, num2.length);
        Arrays.sort(merged);
        int n = merged.length;
        if(n % 2 == 0) {
            return (merged[n/2 - 1] + merged[n/2]) / 2.0;
        } else {
            return (merged[n/2]);
        }
        
    }
    public static void main(String[] args) {
        int[] num1 = {1, 2};
        int[] num2 = {3, 4};
        double result = FindMedianSortedArray(num1, num2);
        System.out.println(" Median :  "+result);
    }
}
