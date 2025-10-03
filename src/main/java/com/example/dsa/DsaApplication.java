package com.example.dsa;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DsaApplication {

    public static void main(String[] args) {
        // prepend();
        // removeFirst();

        getNodeIndex();
    }


    private static void getNodeIndex() {
        LinkedList myLinkedList = new LinkedList(0);
        myLinkedList.append(1);
        myLinkedList.append(2);
        myLinkedList.append(3);

        System.out.println("Node found at index 2: " + myLinkedList.get(2).value);
        myLinkedList.printList();
    }

    private static void removeFirst() {
        LinkedList myLinkedList = new LinkedList(2);
        myLinkedList.append(3);
        System.out.println("Linked list with 2 items, node removed is of value: " + myLinkedList.removeFirst().value);
        System.out.println("Linked list with 1 item, node removed is of value: " + myLinkedList.removeFirst().value);
        System.out.println("Linked list with 0 items, this list is " + myLinkedList.removeFirst());
    }

    private static void prepend() {
        LinkedList myLinkedList = new LinkedList(2);
        myLinkedList.append(3);
        myLinkedList.prepend(1);
        myLinkedList.printList();
    }


}
