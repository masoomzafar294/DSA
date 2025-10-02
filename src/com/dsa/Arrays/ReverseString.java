package com.dsa.Arrays;

public class ReverseString {
    public static void main(String[] args) {
        String str = "MASOOM";
        String rev = "";
        for(int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
        System.out.println(str);
        System.out.println(rev);
    }
}
