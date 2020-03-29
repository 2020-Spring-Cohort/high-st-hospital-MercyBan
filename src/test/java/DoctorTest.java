import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DoctorTest {

    private Doctor underTest;

    @BeforeEach
    void setUp() {
        underTest = new Doctor("TESTNAME", "OBGYN");
    }

    @Test
    void testGetEmployeeName() {
        String actual = underTest.getEmployeeName();
        assertEquals("TESTNAME", actual);
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
    void drawBloodLessThan10() {
        Patient patient = new Patient();
        patient.setBLOOD_LEVEL(7);
        underTest.drawBlood(patient);
        assertEquals(7, patient.getBLOOD_LEVEL());
        assertEquals(10, patient.getHEALTH_LEVEL());
    }

    @Test
    void drawBloodEqual10() {
        Patient patient = new Patient();
        patient.setBLOOD_LEVEL(10);
        underTest.drawBlood(patient);
        assertEquals(10, patient.getBLOOD_LEVEL());
        assertEquals(10, patient.getHEALTH_LEVEL());
    }

    @Test
    void drawBloodAbove10() {
        Patient patient = new Patient();
        patient.setBLOOD_LEVEL(12);
        underTest.drawBlood(patient);
        assertEquals(2, patient.getBLOOD_LEVEL());
        assertEquals(5, patient.getHEALTH_LEVEL());

    }
    @Test
    void doctorShouldHaveSpecialty() {
        Doctor underTest = new Doctor("TESTNAME", "OBGYN");
        String result = underTest.getSpecialty();
        assertEquals("OBGYN", result);

    }
}
