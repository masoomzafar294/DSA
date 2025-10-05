package com.dsa.Arrays;
//Moore's Voting Algorithm
// find the majority element in the array
public class MajorityElement {
    public static void main(String[] args) {
        int[] number = {2, 3, 2, 4, 2, 6, 2};
        int candidate = 0;
        int n = number.length;
        int count = 0;

        for(int i = 0; i < n; i++) {
            if(count == 0) {
                candidate = number[i];
            }
            if (candidate == number[i]) {
                 count++;
            }else {
                count--;
            }
        }
        System.out.println("Majority Element : " + candidate);
    }
}
