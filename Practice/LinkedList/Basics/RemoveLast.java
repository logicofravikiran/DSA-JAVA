package LinkedList.Basics;

public class RemoveLast {
    public static void main(String[] args) {
        RemoveLastLinkedList ll = new RemoveLastLinkedList();
        ll.addLast(10);
        ll.addLast(20);
        ll.addLast(30);
        ll.addLast(40);
        ll.addLast(50);
        ll.addLast(60);
        ll.display();
        ll.removeLast();
        ll.display();
    }
}

class RemoveLastLinkedList {
    Node head;
    Node tail;
    int size;

    void removeLast() {
        if (size == 0) {
            System.out.println("List is empty");
        } else if (size == 1) {
            head = tail = null;
        } else {
            Node temp = head;
            for (int index = 0; index < size - 2; index++) {
                temp = temp.next;
            }
            tail = temp;
            temp.next = null;
            size--;
        }
    }

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
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "\t");
            temp = temp.next;
        }
        System.out.println();
    }
}
