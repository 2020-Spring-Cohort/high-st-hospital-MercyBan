import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class NurseTest {

    private Nurse underTest;


    @BeforeEach
    public void setUp() {
        underTest = new Nurse("TESTNAME", 0);

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

    @Test
    public void drawBloodLessThan5() {
        Patient patient = new Patient("");
        patient.setBloodLevel(4);
        underTest.drawBlood(patient);
        assertEquals(4, patient.getBloodLevel());
        assertEquals(10, patient.getHealthLevel());
    }

    @Test
    public void drawBloodEqual5() {
        Patient patient = new Patient("");
        patient.setBloodLevel(5);
        underTest.drawBlood(patient);
        assertEquals(5, patient.getBloodLevel());
        assertEquals(10, patient.getHealthLevel());
    }

    @Test
    public void drawBloodAbove5() {
        Patient patient = new Patient("");
        patient.setBloodLevel(12);
        underTest.drawBlood(patient);
        assertEquals(7, patient.getBloodLevel());
        assertEquals(11, patient.getHealthLevel());

    }

}