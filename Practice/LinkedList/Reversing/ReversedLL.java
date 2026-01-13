package LinkedList.Reversing;

public class ReversedLL {
    public static void main(String[] args) {
        ReversedLinkedList ll = new ReversedLinkedList();
        ll.addLast(10);
        ll.addLast(20);
        ll.addLast(30);
        ll.addLast(40);
        ll.addLast(50);
        ll.addLast(60);
        ll.display();
        ll.reverseLL();
        ll.display();
    }
}

class Node {
    int data;
    Node next;
}

class ReversedLinkedList {
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

    private Node getNodeAt(int index) {
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    void reverseLL() {

        int leftIndex = 0;
        int rightIndex = size - 1;

        while (leftIndex < rightIndex) {
            Node left = getNodeAt(leftIndex);
            Node right = getNodeAt(rightIndex);

            int temp = left.data;
            left.data = right.data;
            right.data = temp;

            leftIndex++;
            rightIndex--;
        }
    }
}