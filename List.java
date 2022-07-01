package com.datastructure;

public class List {
    Node head;
    Node tail;
    public Node push(int data){
        Node newNode = new Node(data);
        if(head==null){
            head = newNode;
            tail = newNode;
        }else {
            Node temp = head;
            this.head = newNode;
            newNode.next = temp;
        }
        return newNode;
    }
    public void print(){
        if(head==null){
            System.out.println("Linked list is empty");
        }
        else{
            Node temp = head;
            while (temp!=null){
                System.out.println(temp.data+" ");
                temp = temp.next;
            }
        }
    }
    public void append(int data){
        Node newNode = new Node(data);
        if (head==null){
            head = newNode;
            tail = newNode;
        }else {
            this.tail.next = newNode;
            tail = newNode;
        }
    }
    public void insertInBetween(Node previousNode, Node newNode){
        Node tempNode = previousNode.next;
        previousNode.next = newNode;
        newNode.next = tempNode;
    }
    public Node pop(){
        Node tempNode = head;
        head = head.next;
        return tempNode;
    }
    public Node popLast(){
        Node tempNode = head;
        while (tempNode.next!=tail){
            tempNode = tempNode.next;
        }
        tail=tempNode;
        tempNode.next = null;
        return head;
    }
    public void popBySearch(int data){
        Node currentNode = head;
        Node previousNode = null;
        if(head!=null){
            while (currentNode!=null && currentNode.data!=data){
                previousNode=currentNode;
                currentNode=currentNode.next;
            }
            if(currentNode==null){
                System.out.println("Value doesn't exist");
            }
            else{
                previousNode.next=currentNode.next;
                currentNode = null;
            }
        }
    }
    public void insertAfterSearch(int key, int data){
        Node newNode = new Node(data);
        Node currentNode = head;
        Node previousNode = null;
        if(head!=null){
            while (currentNode!=null && currentNode.data!=key) {
                previousNode = currentNode;
                currentNode = currentNode.next;
            }
            if(currentNode==null){
                System.out.println("Value doesn't exist");
            }
            else{
                newNode.next=currentNode.next;
                currentNode.next=newNode;
            }
        }
    }
    public int size(){
        int count = 0;
        Node temp = head;
        while (temp!=null){
            count++;
            temp=temp.next;
        }
        System.out.println("Size of linked list is: " + count);
        return count;
    }
    public void sort(){
        Node currentNode;
        Node nextNode;
        int temp;
        for(currentNode=head;currentNode.next!=null;currentNode=currentNode.next){
            for(nextNode=currentNode.next;nextNode!=null;nextNode=nextNode.next){
                if(currentNode.data>nextNode.data){
                    temp=currentNode.data;
                    currentNode.data=nextNode.data;
                    nextNode.data=temp;
                }
            }
        }
    }

}
