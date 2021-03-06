
public class Doctor extends Employee {
    String specialty;

    public Doctor(String name, int payRate, String specialty) {
        super(name, payRate);
        this.specialty = specialty;
    }

    @Override
    public void paySalary() {
        this.paid = true;
    }

    public String getSpecialty() {
        return specialty;
    }

    public Doctor(String name, String specialty) {
        super(name, 90000);
        this.specialty = specialty;
    }


    public void drawBlood(Patient patient) {
        int bloodlevel = patient.getBloodLevel();
        if (bloodlevel <= 10) {
            return;
        } else {
            patient.setBloodLevel(bloodlevel - 10);
            patient.setHealthLevel(patient.getHealthLevel() - 5);
        }

    }
}


