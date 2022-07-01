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
        System.out.println("Enter 5 to remove last node");
        System.out.println("Enter 6 to remove node by searching");
        System.out.println("Enter 7 to add data next to the node after searching");
        System.out.println("Enter 8 to remove added data after searching");
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
            case 5:
                Operations.removeLast();
                break;
            case 6:
                Operations.removeBySearch();
                break;
            case 7:
                Operations.addAfterSearching();
                break;
            case 8:
                Operations.removeAddedData();
                break;
            default:
                System.out.println("wrong choice");
        }
    }
}
