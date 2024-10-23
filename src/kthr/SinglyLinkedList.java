// SPDX-License-Identifier: GPL-3.0-or-later
// SPDX-FileCopyrightText: 2024 kurth4cker <kurth4cker@gmail.com>

package kthr;

class Node {
    Node next;
    Object value;
}

public class SinglyLinkedList {
    Node head;
    
    public void push(Object obj) {
        Node head = new Node();
        head.next = this.head;
        head.value = obj;
        this.head = head;
    }

    public String toString() {
        Node current = head;
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        while (current != null) {
            sb.append(current.value);
            sb.append(", ");
            current = current.next;
        }
        sb.append(']');
        return sb.toString();
    }
}
