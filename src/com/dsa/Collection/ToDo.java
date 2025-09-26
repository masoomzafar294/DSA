package com.dsa.Collection;
import java.util.*;
public class ToDo {
    public static void main(String[] args) {
        ArrayList<String> Tasks = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        boolean istrue = true;
        while(istrue) {
            System.out.println("---------TODO LIST--------");
            System.out.println("press 1 :------     add Task  ------");
            System.out.println("press 2 :------  to view the task  ------");
            System.out.println("press 3 :------  to remove the task  ------");
            System.out.println("press 4 :------        exit       ------");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1 :
                    String task = sc.nextLine();
                    Tasks.add(task);
                    System.out.println("Task added");
                    break;
                case 2 :
                    System.out.println("your tasks : ");
                    for(int i = 0; i < Tasks.size(); i++) {
                        System.out.println(Tasks.get(i));
                    }
                    break;
                case 3 :
                    System.out.print("which task you want to remove : ");
                    int number = sc.nextInt();
                    number--;
                    Tasks.remove(number);
                    System.out.println("Task remove");
                    break;
                case 4 :
                    istrue = false;
                    break;

                default :
                    System.out.println("invalid input");
                    System.out.println("please select above given number");
            }
        }
    }
}
