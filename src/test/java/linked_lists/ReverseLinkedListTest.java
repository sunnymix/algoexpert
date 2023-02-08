package linked_lists;

import org.junit.jupiter.api.Test;

import static linked_lists.ReverseLinkedList.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static linked_lists.LinkedList.*;

class ReverseLinkedListTest {

    @Test
    void should_reverse() {
        assertEquals("", str(reverse(of())));
        assertEquals("1", str(reverse(of(1))));
        assertEquals("2 -> 1", str(reverse(of(1, 2))));
        assertEquals("3 -> 2 -> 1", str(reverse(of(1, 2, 3))));
        assertEquals("4 -> 3 -> 2 -> 1", str(reverse(of(1, 2, 3, 4))));
    }

    @Test
    void should_reverseII() {
        assertEquals("", str(reverseII(of())));
        assertEquals("1", str(reverseII(of(1))));
        assertEquals("2 -> 1", str(reverseII(of(1, 2))));
        assertEquals("3 -> 2 -> 1", str(reverseII(of(1, 2, 3))));
        assertEquals("4 -> 3 -> 2 -> 1", str(reverseII(of(1, 2, 3, 4))));
    }

}