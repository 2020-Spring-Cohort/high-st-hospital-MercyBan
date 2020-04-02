import java.util.Scanner;
public class HospitalApplication {

    static Doctor doc1 = new Doctor ("Will", "Throat");
    static Doctor doc2 = new Doctor ("Tom", "OBGYN");
    static Nurse nurse = new Nurse ("Betty");
    static Nurse nurse2;
    static Receptionist recep  = new Receptionist ("Carol");
    static Janitor janitor = new Janitor("Bob");
    static Employee[] employeesList = new Employee[6];
    static Patient patient1 = new Patient("Rob");
    static Patient patient2 = new Patient("Janet");
    static Employee[] doctorNurseList = new Employee [4];


    private static String answer = "";


    static Scanner scn = new Scanner(System.in);



    public static void main(String[] args) {
        employeesList[0] = doc1;
        employeesList[1] = doc2;
        employeesList[2] = nurse;
        employeesList[3] = recep;
        employeesList[4] = janitor;

        doctorNurseList[0] = doc1;
        doctorNurseList[1] = doc2;
        doctorNurseList[2] = nurse;

        System.out.println("Welcome to High Street Hospital, where we treat all patients equally");



        payEmployees(employeesList);
        story();

        System.out.println("Thank You For Making Us Your Healthcare Provider!");




    }

    public static void printEmployeeRoster(Employee[] employees) {
        for (Employee employee : employees) {
            System.out.println(employee.getEmployeeName());
        }
    }

    public static void payEmployees(Employee[] employees) {
        for (Employee employee : employees){
            if (employee != null){
                employee.paySalary();


            }
        }
    }

    private static void printPatientStatus() {
        System.out.println("Patients have been treated. ");
        System.out.println("Rob's health level is currently at " + patient1.getHealthLevel() + ". ");
        System.out.println("Janet's health level is now at " + patient2.getHealthLevel() + ".");
        System.out.println("\n");
    }

    public static void story(){
        System.out.println("What would you like to do ?");
        System.out.println("Option 1 : Add New Nurse");
        System.out.println("Option 2: Treat Pateints");
        System.out.println("Option 3: Check Phones");
        System.out.println("Option 4: Check cleaning Supplies");

        int option = scn.nextInt();
        scn.nextLine();

        switch (option) {
            case 1:
                System.out.println("What is Nurse's name ? ");
                nurse2 = new Nurse(scn.nextLine());
                employeesList[5] = nurse2;
                doctorNurseList[3] = nurse2;

                printEmployeeRoster(employeesList);
                break;
            case 2:
                System.out.println("Who wants to treat Rob?");
                System.out.println("Dr. Will or Dr. Tom?");
                answer = scn.nextLine();
                if (answer.equalsIgnoreCase("Dr. Will")){
                    doc1.drawBlood(patient1);
                }
                else {
                    System.out.println("Rob doesn't need an OBGYN Doctor");
                }

                System.out.println("Who wants to treat Janet?");
                for (Employee employee : doctorNurseList){
                    if (employee !=null){
                        if (employee instanceof Doctor){
                            System.out.println("Dr. " + employee.getEmployeeName());
                        }
                        else {
                            System.out.println(employee.getEmployeeName());

                        }

                    }
                }
                answer = scn.nextLine();
                if (answer.equalsIgnoreCase("Dr. Will")){
                    System.out.println("She doesnt need throat Doctor");
                }
                else if (answer.equalsIgnoreCase("Dr. Tom")){
                    doc2.drawBlood(patient2);
                }
                else if (answer.equalsIgnoreCase("Betty")){
                    nurse.drawBlood(patient2);

                }
                else {
                    System.out.println("In training and need another nurse to attend");

                }
                printPatientStatus();

                break;
            case 3:
                System.out.println("Answer the phone? Yes or No");
                answer = scn.nextLine();
                if (answer.equalsIgnoreCase("yes")) {
                    System.out.println("Receptionist has been paid !");
                    recep.paySalary();
                    System.out.println(recep);
                    System.out.println("\n");
                }
                else {
                    System.out.println("The manager caught you slacking...Get back to Work!!! ");
                }

                break;
            case 4:
                System.out.println("Are the supplies well stocked? Yes or No");
                answer = scn.nextLine();
                if (answer.equalsIgnoreCase("yes")) {
                    System.out.println("Go clean the bathrooms!");
                    janitor.paySalary();
                    System.out.println(janitor);
                    System.out.println("\n");
                }
                else {
                    System.out.println("Order Supplies ");
                }

                break;
            default:
                break;
        }





    }
}
