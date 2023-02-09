package linked_lists;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static linked_lists.LinkedList.*;
import static linked_lists.FindLoop.*;

class FindLoopTest {

    @Test
    void should_find_loop() {
        assertEquals("3 -> 4 -> 5 -> 3*", str(of("3 -> 4 -> 5 -> 3")));
        assertEquals("3 -> 4 -> 5 -> 3*", str(findLoop(of("1 -> 2 -> 3 -> 4 -> 5 -> 3"))));
    }

    @Test
    void should_find_loop2() {
        assertEquals("4 -> 5 -> 6 -> 7 -> 8 -> 9 -> 4*", str(of("4 -> 5 -> 6 -> 7 -> 8 -> 9 -> 4")));
        assertEquals("4 -> 5 -> 6 -> 7 -> 8 -> 9 -> 4*", str(findLoop(of("0 -> 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> 7 -> 8 -> 9 -> 4"))));
    }

}