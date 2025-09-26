package com.dsa.Collection;
import java.util.*;

public class ArrayList01 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("masoom");
        list.add("zafar");
        list.add(0, "my");
        list.add(1, "name");
        list.add(2, "is");
        list.set(0, "your");
        list.remove(3);
        list.clear();
        System.out.println(list);
    }

}
