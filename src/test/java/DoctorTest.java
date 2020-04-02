import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DoctorTest {

    private Doctor underTest;

    @BeforeEach
    public void setUp() {
        underTest = new Doctor("TESTNAME", "OBGYN");
    }

    @Test
    public void testGetEmployeeName() {
        String actual = underTest.getEmployeeName();
        assertEquals("TESTNAME", actual);
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
    public void drawBloodLessThan10() {
        Patient patient = new Patient("");
        patient.setBloodLevel(7);
        underTest.drawBlood(patient);
        assertEquals(7, patient.getBloodLevel());
        assertEquals(10, patient.getHealthLevel());
    }

    @Test
    public void drawBloodEqual10() {
        Patient patient = new Patient("");
        patient.setBloodLevel(10);
        underTest.drawBlood(patient);
        assertEquals(10, patient.getBloodLevel());
        assertEquals(10, patient.getHealthLevel());
    }

    @Test
    public void drawBloodAbove10() {
        Patient patient = new Patient("");
        patient.setBloodLevel(12);
        underTest.drawBlood(patient);
        assertEquals(2, patient.getBloodLevel());
        assertEquals(5, patient.getHealthLevel());

    }
    @Test
    public void doctorShouldHaveSpecialty() {
        Doctor underTest = new Doctor("TESTNAME", "OBGYN");
        String result = underTest.getSpecialty();
        assertEquals("OBGYN", result);

    }
}
