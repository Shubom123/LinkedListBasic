package com.datastructure;
import java.util.Scanner;
import java.util.LinkedList;

public class LinkedListMain {
    public static void main(String[] args) {
        System.out.println("Welcome to linked list");
        System.out.println("Enter 1 to add data at start");
        System.out.println("Enter 2 to add data at end");
        System.out.println("Enter 3 to insert data in between");
        System.out.println("Enter 4 to remove data");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        switch (choice){
            case 1:
                Operations.addDataAtStart();
                break;
            case 2:
                Operations.addDataAtEnd();
                break;
            case 3:
                Operations.insertBetween();
                break;
            case 4:
                Operations.remove();
                break;
            default:
                System.out.println("wrong choice");
        }
    }
}
