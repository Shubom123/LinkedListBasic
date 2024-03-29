package com.datastructure;
import java.util.Collections;
import java.util.LinkedList;

public class Operations {
    public static void addDataAtStart(){
        List linkedList = new List();
        linkedList.push(70);
        linkedList.push(30);
        linkedList.push(56);
        linkedList.print();
        linkedList.size();
    }
    public static void addDataAtEnd(){
        List linkedList = new List();
        linkedList.append(56);
        linkedList.append(30);
        linkedList.append(70);
        linkedList.print();
        linkedList.size();
    }
    public static void insertBetween(){
        List linkedList = new List();
        Node secondNode = linkedList.push(70);
        Node firstNode = linkedList.push(56);
        Node newNode = new Node(30);
        System.out.println("Before");
        linkedList.print();
        linkedList.insertInBetween(firstNode, newNode);
        System.out.println("After");
        linkedList.print();
        linkedList.size();
    }
    public static void remove(){
        List linkedList = new List();
        linkedList.push(70);
        linkedList.push(30);
        linkedList.push(56);
        System.out.println("Before poping");
        linkedList.print();
        linkedList.pop();
        System.out.println("After poping");
        linkedList.print();
        linkedList.size();
    }
    public static void removeLast(){
        List linkedList = new List();
        linkedList.push(70);
        linkedList.push(30);
        linkedList.push(56);
        System.out.println("Before poping");
        linkedList.print();
        linkedList.popLast();
        System.out.println("After poping");
        linkedList.print();
        linkedList.size();
    }
    public static void removeBySearch(){
        List linkedList = new List();
        linkedList.push(70);
        linkedList.push(30);
        linkedList.push(56);
        System.out.println("Before Poping");
        linkedList.print();
        linkedList.popBySearch(30);
        System.out.println("After Poping");
        linkedList.print();
        linkedList.size();
    }
    public static void addAfterSearching(){
        List linkedList = new List();
        linkedList.push(70);
        linkedList.push(30);
        linkedList.push(56);
        System.out.println("Before Adding");
        linkedList.print();
        linkedList.insertAfterSearch(30,40);
        System.out.println("After Adding");
        linkedList.print();
        linkedList.size();

    }
    public static void removeAddedData(){
        List linkedList = new List();
        linkedList.push(70);
        linkedList.push(30);
        linkedList.push(56);
        System.out.println("Before Adding");
        linkedList.print();
        linkedList.insertAfterSearch(30,40);
        System.out.println("After Adding");
        linkedList.print();
        linkedList.size();
        linkedList.popBySearch(40);
        System.out.println("After Poping");
        linkedList.print();
        linkedList.size();
    }
    public static void sortData(){
        List linkedList = new List();
        linkedList.push(70);
        linkedList.push(30);
        linkedList.push(56);
        System.out.println("Before Adding");
        linkedList.print();
        linkedList.insertAfterSearch(30,40);
        System.out.println("After Adding");
        linkedList.print();
        linkedList.size();
        linkedList.sort();
        System.out.println("After Sorting");
        linkedList.print();
        linkedList.size();
    }
}
