public class Receptionist extends Employee {
    boolean onPhone;

    public Receptionist(String name, int payRate) {
        super(name, payRate);
    }

    @Override
    public void paySalary() {
            if (paid) {
                return;
            } else {
                paid = true;
            }

    }
    public Receptionist(String name) {
        super(name, 45000);
    }





}
