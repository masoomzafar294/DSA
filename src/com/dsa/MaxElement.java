package com.dsa;

public class MaxElement {
    public static void main(String[] args) {
        int[] num = {5, 12, 7, 25, 9, 3};
        int max = num[0];
        for(int i = 1; i < num.length; i++) {
            if(num[i] > max) {
                max = num[i];
            }
        }
        System.out.println("Maximum Element : " +max);
    }
}
