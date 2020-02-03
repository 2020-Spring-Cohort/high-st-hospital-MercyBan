public class HospitalApplication {

    public static void main(String[] args) {
        Doctor doc1 = new Doctor ("Will", "Throat");
        Doctor doc2 = new Doctor ("Tom", "OBGYN");
        Nurse nurse = new Nurse ("Betty");
        Receptionist recep  = new Receptionist ("Carol");
        Janitor janitor = new Janitor("Bob");
        Employee[] employeesList = new Employee[5];
        employeesList[0] = doc1;
        employeesList[1] = doc2;
        employeesList[2] = nurse;
        employeesList[3] = recep;
        employeesList[4] = janitor;


        printEmployeeRoster(employeesList);
        payEmployees(employeesList);
    }

    public static void printEmployeeRoster(Employee[] employees) {
        for (Employee employee : employees) {
            System.out.println(employee.getEmployeeName());
        }
    }

    public static void payEmployees(Employee[] employees) {
        for (Employee employee : employees){
            employee.paySalary();
        }
    }
}
