package com.employee;

// ************************************ TODO F1 ************************************
/*
 * Implement a Singly linkedList
 *
 */

class Node {
    PermanentEmployee permanentEmployee;
    Node next;

    public Node(PermanentEmployee permanentEmployee) {
        this.permanentEmployee = permanentEmployee;
    }
}


public class SingleLinkedList {

    // ************************************ SOLUTION F1 BEGIN ************************************


    Node head;
    Node tailNode;
    public int tail;

    public void add(PermanentEmployee permanentEmployee) {


        if(head == null) {
            head = new Node(permanentEmployee);
            tailNode = head;
            tail = tailNode.permanentEmployee.getId();
            return;
        }

        tailNode.next = new Node(permanentEmployee);
        tailNode = tailNode.next;
        tail = tailNode.permanentEmployee.getId();

    }
    // ************************************ SOLUTION F1 END ************************************

}
