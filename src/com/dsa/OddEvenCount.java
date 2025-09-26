package com.dsa;

public class OddEvenCount {
    public static void main(String[] args) {
        int[] Arr = {5, 12, 7, 8, 3, 10};
        int EvenCount = 0;
        int OddCount = 0;
        for(int i = 0; i < Arr.length; i++) {
            if(Arr[i] % 2 == 0) {
                EvenCount++;
            } else {
              OddCount++;
            }
        }
        System.out.println("Even : " + EvenCount + " & Odd : " + OddCount);
    }
}
