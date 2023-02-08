package linked_lists;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static linked_lists.ShiftLinkedList.*;
import static linked_lists.LinkedList.*;

class ShiftLinkedListTest {

    @Test
    void should_shift() {
        assertEquals("0 -> 1 -> 2 -> 3 -> 4 -> 5", str(shift(of(0, 1, 2, 3, 4, 5), 0)));
        assertEquals("0 -> 1 -> 2 -> 3 -> 4 -> 5", str(shift(of(0, 1, 2, 3, 4, 5), 6)));
        assertEquals("0 -> 1 -> 2 -> 3 -> 4 -> 5", str(shift(of(0, 1, 2, 3, 4, 5), -6)));
        assertEquals("4 -> 5 -> 0 -> 1 -> 2 -> 3", str(shift(of(0, 1, 2, 3, 4, 5), 2)));
        assertEquals("2 -> 3 -> 4 -> 5 -> 0 -> 1", str(shift(of(0, 1, 2, 3, 4, 5), -2)));
        assertEquals("4 -> 5 -> 0 -> 1 -> 2 -> 3", str(shift(of(0, 1, 2, 3, 4, 5), 8)));
        assertEquals("2 -> 3 -> 4 -> 5 -> 0 -> 1", str(shift(of(0, 1, 2, 3, 4, 5), -8)));
    }

}