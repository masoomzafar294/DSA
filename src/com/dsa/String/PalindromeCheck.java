package com.dsa.String;

import java.util.Scanner;
// check if a string is a palindrome.
public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String : ");
        String str = sc.next();
        boolean isPalindrome = true;
        for (int i = 0; i < str.length()/2; i++) {
            if (str.charAt(i) != str.charAt(str.length()-1-i)) {
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome) {
            System.out.println(str + " is Palindrome");
        }else {
            System.out.println(str + " is not Palindrome");
        }
//        String reverse = new StringBuilder(str).reverse().toString();
//        if (str.equals(reverse)) {
//            System.out.println("Given String is Palindrome");
//        }else {
//            System.out.println("Given String is not Palindrome");
//        }
    }
}
