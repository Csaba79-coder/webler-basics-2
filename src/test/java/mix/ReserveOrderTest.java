package mix;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static mix.ReserveOrder.reverseOrder;
import static org.junit.jupiter.api.Assertions.*;

class ReserveOrderTest {

    @Test
    @DisplayName("Test reverseOrder method")
    public void testReversedOrder() {
        int[] numbers = {1, 2, 3, 4, 5};
        int[] expected = {5, 4, 3, 2, 1};
        int[] actual = reverseOrder(numbers);
        assertArrayEquals(expected, actual);
    }

    @Test
    @DisplayName("Test reverseOrder method when input is null")
    public void testReversedOrderNull() {
        int[] actual = reverseOrder(null);
        assertArrayEquals(null, actual);
    }

}