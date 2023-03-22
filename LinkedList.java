package com.BridgeLabz.Linkedlisk;

public class LinkedList <T>{
    Node<T> head;
    Node<T> tail;
    public void push(T data) {
        Node<T> newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }
    public void add(T data) {
        Node<T> newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }
    public void show() {
        Node<T> temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println();
    }
    public void deleteFirstElement(T deletedelement)
    {
    deletedelement= head.data;
        if (head==tail) {
            head=null;
        }
    if (head!=null){
        head=head.next;
    }
        System.out.println("Deleted element is "+deletedelement);
    }
    public void deleteLastElement(T deletedElement){
        Node<T> temp=head;
        deletedElement= tail.data;
        if (head==null){
            System.out.println("list is empty");
        }
        if (head == tail) {
            head = null;
        } else {
            while (temp.next != tail) {
                temp = temp.next;
            }
            temp.next = null;
            tail = temp;
            System.out.println();
            System.out.println("Deleted element is " + deletedElement);
        }
    }
    public void search(T  search)
    {
        Node<T> temp =head;
        boolean check=false;
        while (temp!=null){
            if (temp.data==search){
                check=true;
            }
            temp=temp.next;
        }
        if (check)
            System.out.println("Element found");
        else
            System.out.println("Element Not Found");
    }
}
