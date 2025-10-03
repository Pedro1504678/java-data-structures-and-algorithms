package com.example.dsa;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DsaApplication {

    public static void main(String[] args) {
        // prepend();
        removeFirst();
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
