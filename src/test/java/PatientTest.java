import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PatientTest {

    private Patient underTest;

    @BeforeEach
    void setUp() {
        underTest = new Patient("testname");
    }

    @Test
    public void checkDefaultLevels(){
        assertEquals(20, underTest.getBloodLevel());
        assertEquals(10, underTest.getHealthLevel());
    }

    @Test
    public void checkSetBloodLevel(){
        underTest.setBloodLevel(4);
        assertEquals(4,underTest.getBloodLevel());
    }
    @Test
    public void checkSetHealthLevel(){
         underTest.setHealthLevel(4);
        assertEquals(4, underTest.getHealthLevel());
    }
}