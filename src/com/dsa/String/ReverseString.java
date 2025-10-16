package com.dsa.String;

public class ReverseString {
    public static void main(String[] args) {
        //there are multiple way of solving reverse of string in java.
        //using Stringbuilder has built in methode rerverse().
        String name = "MASOOM ZAFAR";
        String reversed = new StringBuilder(name).reverse().toString();
        System.out.println("Reversed name is : " + reversed);

        // Using Loop
//        for(int i = name.length()-1; i >= 0; i--) {
//            reversed += name.charAt(i);
//        }
//        System.out.println("Reversed name is : " + reversed);

    }
}
