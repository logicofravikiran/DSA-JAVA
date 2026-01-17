package LinkedList.Basics;

class MYNODE {
    int data;
    MYNODE next;

    MYNODE(int data) {
        this.data = data;
        this.next = null;
    }
}

public class RemoveDuplicateFromSortedLL {

    static MYNODE removeDuplicates(MYNODE head) {

        if (head == null || head.next == null)
            return head;

        MYNODE current = head;

        while (current.next != null) {
            if (current.data == current.next.data) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
        return head;
    }

    public static void main(String[] args) {

        MYNODE head = new MYNODE(10);
        head.next = new MYNODE(10);
        head.next.next = new MYNODE(20);
        head.next.next.next = new MYNODE(30);
        head.next.next.next.next = new MYNODE(30);

        printList(head);
        head = removeDuplicates(head);
        printList(head);
    }

    static void printList(MYNODE head) {
        while (head != null) {
            System.out.print(head.data + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }
}
