import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class NurseTest {

    private Nurse underTest;


    @BeforeEach
    void setUp() {
        underTest = new Nurse("TESTNAME", 0);

    }
    @Test
    void testPaySalaryAlreadyPaid() {
        underTest.paySalary();
        assertTrue(underTest.isPaid());
    }

    @Test
    void testPaySalaryNotPaid() {
        assertFalse(underTest.isPaid());
        underTest.paySalary();
        assertTrue(underTest.isPaid());
    }

    @Test
    void drawBloodLessThan5() {
        Patient patient = new Patient();
        patient.setBLOOD_LEVEL(4);
        underTest.drawBlood(patient);
        assertEquals(4, patient.getBLOOD_LEVEL());
        assertEquals(10, patient.getHEALTH_LEVEL());
    }

    @Test
    void drawBloodEqual5() {
        Patient patient = new Patient();
        patient.setBLOOD_LEVEL(5);
        underTest.drawBlood(patient);
        assertEquals(5, patient.getBLOOD_LEVEL());
        assertEquals(10, patient.getHEALTH_LEVEL());
    }

    @Test
    void drawBloodAbove5() {
        Patient patient = new Patient();
        patient.setBLOOD_LEVEL(12);
        underTest.drawBlood(patient);
        assertEquals(7, patient.getBLOOD_LEVEL());
        assertEquals(11, patient.getHEALTH_LEVEL());

    }

}