
public class Doctor extends Employee {
    String specialty;

    public Doctor(String name, int payRate, String specialty) {
        super(name, payRate);
        this.specialty = specialty;
    }

    @Override
    public void paySalary() {

    }

    @Override
    public String getSpecialty() {
        return specialty;
    }

    public Doctor(String name, String specialty) {
        super(name, 90000);
        this.specialty = specialty;
    }


    public void drawBlood(Patient patient) {
        int bloodlevel = patient.getBLOOD_LEVEL();
        if (bloodlevel <= 10) {
            return;
        } else {
            patient.setBLOOD_LEVEL(bloodlevel - 10);
            patient.setHEALTH_LEVEL(patient.getHEALTH_LEVEL() - 5);
        }

    }
}


