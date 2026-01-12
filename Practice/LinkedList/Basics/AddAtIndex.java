package LinkedList.Basics;

public class AddAtIndex {
    public static void main(String[] args) {

        AddAtIndexLinkedList ll = new AddAtIndexLinkedList();
        ll.addLast(10);
        ll.addLast(20);
        ll.addLast(30);
        ll.addLast(40);
        ll.addLast(50);
        ll.addLast(60);
        ll.display();
        ll.addAtIndex(-1, 444);
        ll.display();
    }
}

class AddAtIndexLinkedList {
    Node head;
    Node tail;
    int size;

    void addAtIndex(int index, int value) {

        if (index < 0 || index > size) {
            System.out.println("invalid index");
        } else if (index == 0) {
            addFirst(value);
        } else if (index == size) {
            addLast(value);
        } else {
            Node newNode = new Node();
            newNode.data = value;
            size++;

            Node temp = head;

            for (int i = 0; i < size; i++) {
                System.out.println(temp.data);
                if (i == index - 1) {
                    newNode.next = temp.next;
                    temp.next = newNode;
                }
                temp = temp.next;
            }
        }
    }

    void addFirst(int value) {
        Node temp = new Node();
        temp.data = value;
        if (size == 0) {
            head = tail = temp;
        } else {
            temp.next = head;
            head = temp;
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
