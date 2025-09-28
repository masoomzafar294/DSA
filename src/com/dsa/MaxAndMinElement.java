package com.dsa;
public class MaxAndMinElement {
    public static void main(String[] args) {
        int[] element = {10, 5, 30, 40, 15, 20, 31};
        int max = element[0];
        int min = element[0];

        for(int i = 1; i < element.length - 1; i++) {
            if (element[i] > max) {
                max = element[i];
            } if (element[i] < min) {
                min = element[i];

            }
        }
        System.out.println("Maximum element is : " + max);
        System.out.println("Minimum element is : " + min);

    }
}