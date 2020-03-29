public class Nurse extends Employee {
   int numPatients;

    public Nurse(String name, int payRate) {
        super(name, payRate);
    }

    @Override
    public void paySalary() {
        this.paid = true;
    }


    public Nurse (String name) {
        super(name, 50000);
    }



    public void drawBlood(Patient patient) {
        int bloodLevel = patient.getBloodLevel();
        if (bloodLevel <= 5) {
            return;
        } else {
            patient.setBloodLevel(bloodLevel - 5);
            patient.setHealthLevel(patient.getHealthLevel() + 1);
        }
    }
}
