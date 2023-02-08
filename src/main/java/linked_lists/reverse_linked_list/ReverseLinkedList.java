package linked_lists.reverse_linked_list;

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

    public static LinkedList of(int ...items) {
        LinkedList head = null;
        LinkedList pre = null;
        for (int item : items) {
            LinkedList node = new LinkedList(item);
            if (pre != null) pre.next = node;
            if (head == null) head = node;
            pre = node;
        }
        return head;
    }

    public static String str(LinkedList head) {
        if (head == null) return "";
        StringBuilder out = new StringBuilder();
        LinkedList cur = head;
        do {
            if (cur != head) out.append(" -> ");
            out.append(cur.value);
            cur = cur.next;
        } while (cur != null);
        return out.toString();
    }

    public static class LinkedList {
        int value;
        LinkedList next = null;

        public LinkedList(int value) {
            this.value = value;
        }
    }
}
