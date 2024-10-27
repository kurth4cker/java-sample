// SPDX-License-Identifier: GPL-3.0-or-later
// SPDX-FileCopyrightText: 2024 kurth4cker <kurth4cker@gmail.com>

package kthr;

class Node {
    Node next;
    int val;

    Node(Node next, int val) {
        this.next = next;
        this.val = val;
    }

    Node(int val) {
        this.val = val;
    }
}

public class SinglyLinkedList {
    Node head;
    Node tail;
    
    public void addHead(int val) {
        Node node = new Node(this.head, val);
        this.head = node;
        if (this.tail == null) {
            this.tail = node;
        }
    }

    public void addTail(int val) {
        Node node = new Node(val);
        if (this.head == null) {
            // list is empty
            this.tail = this.head = node;
            return;
        }
        this.tail.next = node;
        this.tail = node;
    }

    public void deleteHead() {
        if (this.head != null) {
            if (this.head == this.tail)
                this.tail = null;
            this.head = this.head.next;
        }
    }

    public void deleteTail() {
        if (this.head == null)
            return;

        if (this.head == this.tail) {
            this.head = this.tail = null;
            return;
        }

        Node newTail = this.head;
        while (newTail.next != this.tail)
            newTail = newTail.next;
        this.tail = newTail;
        this.tail.next = null;
    }

    public String toString() {
        Node current = head;
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        while (current != null) {
            sb.append(current.val);
            if (current.next != null)
                sb.append(", ");
            current = current.next;
        }
        sb.append(']');
        return sb.toString();
    }
}
