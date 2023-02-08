package arrays.two_number_sum;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class TwoNumberSumTest {
    private TwoNumberSum instance;

    @BeforeEach
    void setup() {
        instance = new TwoNumberSum();
    }

    @Test
    void should_return_empty_array_for_array_size_less_than_2() {
        assertArrayEquals(new int[0], instance.twoNumberSum(new int[0], 0));
        assertArrayEquals(new int[0], instance.twoNumberSum(new int[]{0}, 0));
    }

    @Test
    void should_return_array_1_2_for_array_1_2_target_sum_3() {
        assertArrayEquals(new int[]{1, 2}, instance.twoNumberSum(new int[]{1, 2}, 3));
    }

    @Test
    void should_return_array_2_3_for_array_1_2_3_target_sum_5() {
        assertArrayEquals(new int[]{2, 3}, instance.twoNumberSum(new int[]{1, 2, 3}, 5));
    }
}
