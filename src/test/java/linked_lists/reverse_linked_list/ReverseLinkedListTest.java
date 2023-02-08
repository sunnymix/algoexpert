package linked_lists.reverse_linked_list;

import org.junit.jupiter.api.Test;

import static linked_lists.reverse_linked_list.ReverseLinkedList.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ReverseLinkedListTest {

    @Test
    void should_str_of() {
        assertEquals("", str(of()));
        assertEquals("1", str(of(1)));
        assertEquals("1 -> 2", str(of(1, 2)));
        assertEquals("1 -> 2 -> 3", str(of(1, 2, 3)));
        assertEquals("1 -> 2 -> 3 -> 4", str(of(1, 2, 3, 4)));
    }

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