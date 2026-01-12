package LinkedList.Basics;

public class DisplayList {
    public static void main(String[] args) {
        DisplayLinkedList ll = new DisplayLinkedList();
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

class DisplayLinkedList {
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
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "\t");
            temp = temp.next;
        }
        System.out.println();
    }
}
