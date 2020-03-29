public abstract class Employee {


    String employeeName;
    int employeeNumber;
    double salary;
    boolean paid;

    public Employee(String name, int payRate) {
        this.employeeName = name;
        this.salary = payRate;
        this.paid = false;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public int getEmployeeNumber() {
        return employeeNumber;
    }

    public double getSalary() {
        return salary;
    }

    public boolean isPaid() {
        return paid;
    }


    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public void setEmployeeNumber(int employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setPaid(boolean paid) {
        this.paid = paid;
    }

    public abstract void paySalary();

    @Override
    public String toString() {
        return "Employee{" +
                "employeeName='" + employeeName + '\'' +
                ", employeeNumber=" + employeeNumber +
                ", salary=" + salary +
                ", paid=" + paid +
                '}';
    }

}