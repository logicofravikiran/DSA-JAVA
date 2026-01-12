package LinkedList.Basics;

public class GetValue {
    public static void main(String[] args) {
        GetLinkedListClass ll = new GetLinkedListClass();
        ll.addLast(10);
        ll.addLast(10);
        ll.addLast(20);
        ll.addLast(30);
        ll.addLast(40);
        ll.addLast(50);
        ll.addLast(60);
        // ll.display();
        System.out.println(ll.getFirst());
        System.out.println(ll.getLast());
        // ll.getFirst();
        System.out.println(ll.getAt(10));

    }
}

// class Node {
// int data;
// Node next;
// }

class GetLinkedListClass {
    Node head;
    Node tail;
    int size;

    void addLast(int value) {
        Node temp = new Node();
        temp.data = value;
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
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    int getFirst() {
        if (head == null) {
            System.out.println("List is empty");
            return -1;
        }
        return head.data;
    }

    int getLast() {
        if (tail == null) {
            System.out.println("List is empty");
            return -1;
        }
        return tail.data;
    }

    int getAt(int index) {
        if (index < 0 || index > size) {
            System.out.println("Invalid index");
            return -1;
        } else if (index == 0) {
            getFirst();
        } else if (index == size) {
            getLast();
        } else {
            int count = 0;
            Node temp = head;
            if (size == 0) {
                return -1;
            }
            while (temp != null) {
                if (index == count) {
                    return temp.data;
                }
                temp = temp.next;
                count++;
            }
            return -1;
        }
        return -1;
    }
}
