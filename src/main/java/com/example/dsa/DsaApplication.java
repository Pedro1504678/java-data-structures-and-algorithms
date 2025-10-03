package com.example.dsa;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DsaApplication {

    public static void main(String[] args) {

        LinkedList myLinkedList = new LinkedList(1);
        myLinkedList.append(2);

        // (2) Items - Returns removed node value 2
        System.out.println(myLinkedList.removeLast().value);

        // (1) Items - Returns removed node value 1
        System.out.println(myLinkedList.removeLast().value);

        // (0) Items - Returns null
        System.out.println(myLinkedList.removeLast());

    }
}
