package com.BridgeLabz.Linkedlisk;

public class LinkedListMain {
    public static void main(String[] args) {

        LinkedList<Integer> linkedList1 = new LinkedList<>();
        linkedList1.push(70);
        linkedList1.push(30);
        linkedList1.push(56);
        LinkedList<Integer> linkedList2 = new LinkedList<>();
        linkedList2.add(56);
        linkedList2.add(30);
        linkedList2.add(70);
        linkedList1.show();
        linkedList2.show();
        LinkedList<Integer> linkedList3 = new LinkedList<>();
        linkedList3.add(56);
        linkedList3.add(30);
        linkedList3.add(45);
        linkedList3.add(70);
        linkedList3.show();
        System.out.println("Deletion operation");
        linkedList3.show();
       linkedList3.deleteFirstElement(56);
        System.out.println("After deletion of element");
       linkedList3.show();
    }
}
