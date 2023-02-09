package linked_lists;

import java.util.HashMap;
import java.util.Map;

/**
 * tool
 */
public class LinkedList {
    public int value;
    public LinkedList next;

    public LinkedList(int value) {
        this.value = value;
        next = null;
    }

    public static LinkedList of(int... items) {
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

    /**
     * create LinkedList for a string
     *
     * @param str 1 -> 2 -> 3 -> 4
     * @return LinkedList
     */
    public static LinkedList of(String str) {
        if (str == null || str.trim().length() == 0) return null;
        Map<Integer, LinkedList> createdNodes = new HashMap<>();
        String[] split = str.split("->");
        LinkedList head = null;
        LinkedList pre = null;
        for (String item : split) {
            int number = Integer.parseInt(item.trim());
            LinkedList createdNode = createdNodes.get(number);
            if (createdNode != null && pre != null) {
                // set loop
                pre.next = createdNode;
                break;
            }
            LinkedList cur = new LinkedList(number);
            if (head == null) head = cur;
            if (pre != null) pre.next = cur;
            createdNodes.put(number, cur);
            pre = cur;
        }
        return head;
    }

    public static String str(LinkedList head) {
        if (head == null) return "";
        Map<LinkedList, Boolean> visitedNode = new HashMap<>();
        StringBuilder out = new StringBuilder();
        LinkedList cur = head;
        int length = 1;
        do {
            if (length > 1) out.append(" -> ");
            out.append(cur.value);
            // prevent loop
            if (visitedNode.getOrDefault(cur, false)) {
                out.append("*");
                break;
            }
            visitedNode.put(cur, true);
            cur = cur.next;
            length++;
        } while (cur != null);
        return out.toString();
    }
}
