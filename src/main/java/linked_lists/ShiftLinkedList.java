package linked_lists;

/**
 * 0 -> 1 -> 2 -> 3 -> 4 -> 5
 *
 * k = 2:
 * 0 -> 1 -> 2 -> 3 -> 4 -> 5
 *                ^    ^
 *           newTail   newHead
 * 4 -> 5 -> 0 -> 1 -> 2 -> 3
 *
 * k = -2:
 * 0 -> 1 -> 2 -> 3 -> 4 -> 5
 *      ^    ^
 * newTail   newHead
 * 2 -> 3 -> 4 -> 5 -> 0 -> 1
 */
public class ShiftLinkedList {
    public static LinkedList shift(LinkedList head, int k) {
        if (head == null) return null;
        if (k == 0) return head;

        LinkedList tail = head;
        int length = 1;
        while (tail.next != null) {
            length++;
            tail = tail.next;
        }
        if (length == 1) return head;

        int offset = Math.abs(k) % length;
        if (offset == 0) return head;

        int newTailPos = k > 0 ? length - offset : offset;

        LinkedList newTail = head;
        for (int i = 1; i < newTailPos; i++) {
            newTail = newTail.next;
        }
        LinkedList newHead = newTail.next;
        newTail.next = null;
        tail.next = head;

        return newHead;
    }
}
