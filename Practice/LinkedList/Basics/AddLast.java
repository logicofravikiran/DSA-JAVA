package LinkedList.Basics;

public class AddLast {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addLast(10);
        ll.addLast(10);
        ll.addLast(20);
        ll.addLast(30);
        ll.addLast(40);
        ll.addLast(50);
        ll.addLast(60);
        ll.display();
    }
}

class Node {
    int data;
    Node next;
}

class LinkedList {
    Node head;
    Node tail;
    int size;

    void addLast(int value) {
        Node temp = new Node();
        temp.data = value;
        temp.next = null;

        if (size == 0) {
            head = tail = temp;
            // System.out.println("in size 0");
        } else {
            tail.next = temp;
            tail = temp;
        }
        size++;
    }

    void display() {
        for (int i = 0; i < size; i++) {
            System.out.println(head.data);
            head = head.next;
        }
    }
}
