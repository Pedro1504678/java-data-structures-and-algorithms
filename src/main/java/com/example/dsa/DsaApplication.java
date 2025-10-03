package com.example.dsa;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DsaApplication {

    public static void main(String[] args) {

        LinkedList myLinkedList = new LinkedList(2);
        myLinkedList.append(3);
        myLinkedList.prepend(1);
        myLinkedList.printList();
    }
}
