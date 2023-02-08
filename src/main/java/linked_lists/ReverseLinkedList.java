package linked_lists;

public class ReverseLinkedList {
    public static LinkedList reverse(LinkedList head) {
        LinkedList p1 = null, p2 = head;
        while (p2 != null) {
            LinkedList p3 = p2.next;
            p2.next = p1;
            p1 = p2;
            p2 = p3;
        }
        return p1;
    }

    public static LinkedList reverseII(LinkedList head) {
        LinkedList pre = null, cur = head;
        while (cur != null) {
            LinkedList next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }
}
