package LinkedList.Basics;

class MergingNode {
    int data;
    MergingNode next;

    MergingNode(int data) {
        this.data = data;
        this.next = null;
    }
}

public class MergeTwoSortedLL {

    static MergingNode merge(MergingNode head1, MergingNode head2) {

        // If one list is empty
        if (head1 == null)
            return head2;
        if (head2 == null)
            return head1;

        MergingNode dummy = new MergingNode(-1); // dummy MergingNode
        MergingNode tail = dummy;

        while (head1 != null && head2 != null) {

            if (head1.data <= head2.data) {
                tail.next = head1;
                head1 = head1.next;
            } else {
                tail.next = head2;
                head2 = head2.next;
            }
            tail = tail.next;
        }

        // Attach remaining MergingNodes
        if (head1 != null)
            tail.next = head1;
        else
            tail.next = head2;

        return dummy.next;
    }

    static void printList(MergingNode head) {
        while (head != null) {
            System.out.print(head.data + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {

        MergingNode head1 = new MergingNode(10);
        head1.next = new MergingNode(20);
        head1.next.next = new MergingNode(40);

        MergingNode head2 = new MergingNode(5);
        head2.next = new MergingNode(15);
        head2.next.next = new MergingNode(30);

        MergingNode merged = merge(head1, head2);
        printList(merged);
    }
}
