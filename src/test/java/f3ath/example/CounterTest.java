package f3ath.example;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

class CounterTest {
    private Counter counter;

    @BeforeMethod
    void setUp() {
        counter = new Counter();
    }

    @Test(invocationCount = 10, threadPoolSize = 10)
    void thisTestShouldFail() {
        assertEquals(1, counter.incrementAndGet());
        assertEquals(2, counter.incrementAndGet());
        assertEquals(3, counter.incrementAndGet());
        assertEquals(4, counter.incrementAndGet());
    }

    @Test(invocationCount = 1)
    void thisTestShouldPass() {
        assertEquals(1, counter.incrementAndGet());
        assertEquals(2, counter.incrementAndGet());
        assertEquals(3, counter.incrementAndGet());
        assertEquals(4, counter.incrementAndGet());
    }
}