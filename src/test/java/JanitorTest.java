import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class JanitorTest {

    private Janitor underTest;

    @BeforeEach
    public void setUp() {
        underTest = new Janitor("testname");
    }
    @Test
    public void testPaySalaryAlreadyPaid() {
        underTest.paySalary();
        assertTrue(underTest.isPaid());
    }

    @Test
    public void testPaySalaryNotPaid() {
        assertFalse(underTest.isPaid());
        underTest.paySalary();
        assertTrue(underTest.isPaid());
    }
}
