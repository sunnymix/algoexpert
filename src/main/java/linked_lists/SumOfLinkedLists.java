package linked_lists;

public class SumOfLinkedLists {
    public static LinkedList sum(LinkedList linkedListOne, LinkedList linkedListTwo) {
        LinkedList one = linkedListOne, two = linkedListTwo;
        if (one == null && two == null) return null;
        LinkedList sum = null, pre = null;
        boolean carry = false;
        while (one != null || two != null) {
            int v1 = one != null ? one.value : 0;
            int v2 = two != null ? two.value : 0;
            int vSum = v1 + v2 + (carry ? 1 : 0);
            carry = vSum >= 10;
            vSum = vSum % 10;
            LinkedList cur = new LinkedList(vSum);
            if (sum == null) sum = cur;
            if (pre != null) pre.next = cur;
            pre = cur;
            if (one != null) one = one.next;
            if (two != null) two = two.next;
        }
        if (carry) {
            pre.next = new LinkedList(1);
        }
        return sum;
    }
}
