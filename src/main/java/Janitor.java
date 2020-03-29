public class Janitor extends Employee {
    boolean isSweeping;

    public Janitor(String name, int payRate) {
        super(name, payRate);
    }
    public Janitor (String name) {
        super(name, 40000);
    }

    public void paySalary() {
        if (paid) {
            return;
        } else {
            paid = true;
        }


    }

}
