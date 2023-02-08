package linked_lists;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static linked_lists.LinkedList.*;

class LinkedListTest {

    @Test
    void should_str_of() {
        assertEquals("", str(of()));
        assertEquals("1", str(of(1)));
        assertEquals("1 -> 2", str(of(1, 2)));
        assertEquals("1 -> 2 -> 3", str(of(1, 2, 3)));
        assertEquals("1 -> 2 -> 3 -> 4", str(of(1, 2, 3, 4)));
    }

}