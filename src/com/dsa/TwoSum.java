package com.dsa;

public class TwoSum {
    public static int[] Target(int[] num, int target) {
        for(int i = 0; i < num.length; i++) {
            for(int j = i + 1 ; j < num.length; j++) {
                if(num[i] + num[j] == target) {
                    return new int[] {i, j};
                }
            }
        }
        return new int[] {};
    }
    public static void main(String[] args) {
        int num[] = {2, 7, 11, 15};
        int target = 26;
        int result[] = Target(num, target);
        System.out.println("indices: " +result[0]+ "," +result[1]);
    }
}
