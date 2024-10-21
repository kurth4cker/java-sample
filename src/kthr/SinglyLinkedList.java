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

    public Object get(int index) {
        Node cur = head;
        for (int i = 0; i < index; i++) {
            if (cur.next != null) {
                cur = cur.next;
            }
            else {
                return null;
            }
        }
        return cur.value;
    }
}
