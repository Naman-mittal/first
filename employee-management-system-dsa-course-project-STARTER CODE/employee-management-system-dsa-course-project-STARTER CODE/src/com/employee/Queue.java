package com.employee;

// ************************************ TODO G1 ************************************
/*
 * Implement a Queue and its basic operations using LinkedList
 */

public class Queue {

    // ************************************ SOLUTION G1 BEGIN ************************************
   //this is static class
    static class QueueNode {
        int id;
        QueueNode next;

        public QueueNode(int id) {
            this.id = id;
        }
    }
    QueueNode front;
    QueueNode rear;

    public void add(int id) {
        if(front == null) {
            front = new QueueNode(id);
            rear = front;
            return;
        }

        rear.next = new QueueNode(id);
        rear = rear.next;
    }

    public void poll() {
        if(front == null) {
            return;
        }

        QueueNode temp = front;
        front = front.next;
        temp.next = null;

    }
    // ************************************ SOLUTION G1 END ************************************
}
