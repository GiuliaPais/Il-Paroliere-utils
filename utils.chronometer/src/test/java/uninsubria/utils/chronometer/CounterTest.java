package uninsubria.utils.chronometer;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CounterTest {

    private Counter test;

    @BeforeEach
    void setUp() {
        test = new Counter(5, 0, 0);
    }

    @Test
    void decrementMillis() {
        test.decrementMillis(200);
        assertEquals(4, test.getMin());
        assertEquals(58, test.getSec());

        // ATTENZIONE: il conteggio per questo test parte da 04:58:00
        test.decrementMillis(2);
        assertEquals(4, test.getMin());
        assertEquals(57, test.getSec());
        assertEquals(98, test.getMillis());
    }

    @Test
    void decrementSec() {
        test.decrementSec(60);
        assertEquals(4, test.getMin());
    }

    @Test
    void decrementMin() {
        test.decrementMin(6);
        assertEquals(0, test.getMin());
    }

    @Test
    void isEnded() {
        test.decrementMin(6);
        assertEquals(true, test.isEnded());
    }

}