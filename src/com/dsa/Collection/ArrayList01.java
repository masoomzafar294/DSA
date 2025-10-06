package com.dsa.Collection;
import java.util.*;

public class ArrayList01 {
    public static void main(String[] args) {
        // create the arraylist.
        ArrayList<String> list = new ArrayList<>();
        // add the element in the list.
        list.add("masoom");
        list.add("zafar");
        // insert the element in the list with index.
        list.add(0, "my");
        list.add(1, "name");
        list.add(2, "is");
        list.add(3, "Masoom");
        // change the element with index value.
        list.set(0, "your");
        // remove the element in the list with index value.
        list.remove(3);
        // remove all the element in the list
//        list.clear();
        // acces the list
        System.out.println(list);
    }

}
