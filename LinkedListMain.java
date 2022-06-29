package com.datastructure;

import java.util.LinkedList;

public class LinkedListMain {
    public static void main(String[] args) {
        System.out.println("Welcome to linked list");
        LinkedList<Integer> number = new LinkedList<>();

        number.add(56);
        number.add(30);
        number.add(70);

        System.out.println("Linked List is: " + number);
    }
}
