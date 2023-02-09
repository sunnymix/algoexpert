package linked_lists;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static linked_lists.SumOfLinkedLists.*;
import static linked_lists.LinkedList.*;

class SumOfLinkedListsTest {

    @Test
    void should_sum() {
        assertEquals("", str(sum(of(""), of(""))));
        assertEquals("1", str(sum(of("1"), of(""))));
        assertEquals("2", str(sum(of("1"), of("1"))));
        assertEquals("2 -> 2", str(sum(of("1 -> 1"), of("1 -> 1"))));
        assertEquals("0 -> 3", str(sum(of("9 -> 1"), of("1 -> 1"))));
        assertEquals("0 -> 0 -> 0 -> 1", str(sum(of("9 -> 9 -> 9"), of("1"))));
    }

}