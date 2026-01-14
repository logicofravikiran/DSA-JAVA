package LinkedList.Basics;

public class RemoveAtIndex {
    public static void main(String[] args) {
        RemoveAtIndexLinkedList ll = new RemoveAtIndexLinkedList();
        ll.addLast(10);
        ll.addLast(20);
        ll.addLast(30);
        ll.addLast(40);
        ll.addLast(50);
        ll.addLast(60);
        ll.display();
        ll.removeAtIndex(3);
        ll.display();
    }
}

class RemoveAtIndexLinkedList {
    Node head;
    Node tail;
    int size;

    void removeAtIndex(int index) {

        if (index < 0 || index >= size) {
            System.out.println("Invalid Index");
        } else if (size == 0) {
            System.out.println("List is empty");
        } else if (size == 1) {
            head = tail = null;
            size = 0;
        } else if (index == 0) {
            head = head.next;
            size--;
        } else if (index == size - 1) {
            Node temp = head;
            for (int i = 0; i < size - 2; i++) {
                temp = temp.next;
            }
            tail = temp;
            temp.next = null;
            size--;
        } else {
            Node temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
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
