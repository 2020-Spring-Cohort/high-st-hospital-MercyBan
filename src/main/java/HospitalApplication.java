import java.util.Scanner;
public class HospitalApplication {

    public static void main(String[] args) {
        Doctor doc1 = new Doctor ("Will", "Throat");
        Doctor doc2 = new Doctor ("Tom", "OBGYN");
        Nurse nurse = new Nurse ("Betty");
        Nurse nurse2;
        Receptionist recep  = new Receptionist ("Carol");
        Janitor janitor = new Janitor("Bob");
        Janitor janitor2;
        Employee[] employeesList = new Employee[7];
        employeesList[0] = doc1;
        employeesList[1] = doc2;
        employeesList[2] = nurse;
        employeesList[3] = recep;
        employeesList[4] = janitor;


        Scanner scn = new Scanner(System.in);
        System.out.println("What is your name");
        nurse2 = new Nurse(scn.nextLine());
        employeesList[5] = nurse2;
        System.out.println("what is your name please");
        janitor2 = new Janitor(scn.nextLine());
        employeesList[6] = janitor2;



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
