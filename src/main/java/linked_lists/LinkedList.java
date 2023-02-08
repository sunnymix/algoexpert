package linked_lists;

public class LinkedList {
    public int value;
    public LinkedList next;

    public LinkedList(int value) {
        this.value = value;
        next = null;
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
}
