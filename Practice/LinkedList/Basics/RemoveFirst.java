package LinkedList.Basics;

public class RemoveFirst {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addLast(10);
        ll.addLast(20);
        ll.addLast(30);
        ll.addLast(40);
        ll.addLast(50);
        ll.addLast(60);
        ll.display();
        System.out.println(ll.size);
        ll.removeFirst();
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

    void addLast(int val) {

        Node temp = new Node();
        temp.data = val;
        temp.next = null;

        if (size == 0) {

            head = tail = temp;
        } else {

            tail.next = temp;
            tail = temp;
        }
        size++;
    }

    void display() {

        Node temp = head;
        while (temp != null) {

            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    int size() {

        return size;
    }

    void removeFirst() {
        if (size == 0) {
            System.out.println("List is empty");
            head = tail = null;
        } else if (size == 1) {
            head = head.next;
            tail = null;
        } else {
            head = head.next;
        }
    }
}
