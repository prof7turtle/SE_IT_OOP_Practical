//Problem Statement
/*
Design and develop inheritance for a given case study, identify objects and relationships and
implement inheritance wherever applicable. Employee class hasEmp_name, Emp_id, Address, Mail_id, and Mobile_noas members. Inherit the classes: Programmer, Team Lead, Assistant Project
Manager and Project Manager from employee class. Add Basic Pay (BP) as the member of all the
inherited classes with 97% of BP as DA, 10 % of BP as HRA, 12% of BP as PF, 0.1% of BP for staff
club fund. Generate pay slips for the employees with their gross and net salary.
*/


import java.util.Scanner;

// Base class Employee
class Employee {
    protected String empName;
    protected String empId;
    protected String address;
    protected String mailId;
    protected String mobileNo;
    protected double basicPay;

    public Employee(String empName, String empId, String address, String mailId, String mobileNo, double basicPay) {
        this.empName = empName;
        this.empId = empId;
        this.address = address;
        this.mailId = mailId;
        this.mobileNo = mobileNo;
        this.basicPay = basicPay;
    }

    public double calculateDA() {
        return 0.97 * basicPay;
    }

    public double calculateHRA() {
        return 0.10 * basicPay;
    }

    public double calculatePF() {
        return 0.12 * basicPay;
    }

    public double calculateStaffClubFund() {
        return 0.001 * basicPay;
    }

    public double calculateGrossSalary() {
        return basicPay + calculateDA() + calculateHRA();
    }

    public double calculateNetSalary() {
        return calculateGrossSalary() - calculatePF() - calculateStaffClubFund();
    }

    public void generatePaySlip() {
        System.out.println("\nEmployee Name: " + empName);
        System.out.println("Employee ID: " + empId);
        System.out.println("Basic Pay: " + basicPay);
        System.out.println("DA: " + calculateDA());
        System.out.println("HRA: " + calculateHRA());
        System.out.println("PF: " + calculatePF());
        System.out.println("Staff Club Fund: " + calculateStaffClubFund());
        System.out.println("Gross Salary: " + calculateGrossSalary());
        System.out.println("Net Salary: " + calculateNetSalary());
    }
}

// Derived class Programmer
class Programmer extends Employee {
    public Programmer(String empName, String empId, String address, String mailId, String mobileNo, double basicPay) {
        super(empName, empId, address, mailId, mobileNo, basicPay);
    }
}

// Derived class TeamLead
class TeamLead extends Employee {
    public TeamLead(String empName, String empId, String address, String mailId, String mobileNo, double basicPay) {
        super(empName, empId, address, mailId, mobileNo, basicPay);
    }
}

// Derived class AssistantProjectManager
class AssistantProjectManager extends Employee {
    public AssistantProjectManager(String empName, String empId, String address, String mailId, String mobileNo, double basicPay) {
        super(empName, empId, address, mailId, mobileNo, basicPay);
    }
}

// Derived class ProjectManager
class ProjectManager extends Employee {
    public ProjectManager(String empName, String empId, String address, String mailId, String mobileNo, double basicPay) {
        super(empName, empId, address, mailId, mobileNo, basicPay);
    }
}

// Main class to test the implementation
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter employee type (Programmer, TeamLead, AssistantProjectManager, ProjectManager):");
        String type = scanner.nextLine();

        System.out.println("Enter Employee Name:");
        String name = scanner.nextLine();

        System.out.println("Enter Employee ID:");
        String id = scanner.nextLine();

        System.out.println("Enter Address:");
        String address = scanner.nextLine();

        System.out.println("Enter Mail ID:");
        String mailId = scanner.nextLine();

        System.out.println("Enter Mobile Number:");
        String mobileNo = scanner.nextLine();

        System.out.println("Enter Basic Pay:");
        double basicPay = scanner.nextDouble();

        Employee employee = null;

        switch (type.toLowerCase()) {
            case "programmer":
                employee = new Programmer(name, id, address, mailId, mobileNo, basicPay);
                break;
            case "teamlead":
                employee = new TeamLead(name, id, address, mailId, mobileNo, basicPay);
                break;
            case "assistantprojectmanager":
                employee = new AssistantProjectManager(name, id, address, mailId, mobileNo, basicPay);
                break;
            case "projectmanager":
                employee = new ProjectManager(name, id, address, mailId, mobileNo, basicPay);
                break;
            default:
                System.out.println("Invalid employee type.");
                return;
        }

        employee.generatePaySlip();

        scanner.close();
    }
}

//===========================================================================================
//Input:
/*
Enter employee type (Programmer, TeamLead, AssistantProjectManager, ProjectManager):
Programmer

Enter Employee Name:
John Doe

Enter Employee ID:
P123

Enter Address:
123 Elm Street

Enter Mail ID:
john.doe@example.com

Enter Mobile Number:
555-1234

Enter Basic Pay:
60000
=============================================================================================
//Output:
Employee Name: John Doe
Employee ID: P123
Basic Pay: 60000.0
DA: 36200.0
HRA: 6000.0
PF: 7200.0
Staff Club Fund: 60.0
Gross Salary: 66200.0
Net Salary: 59040.0

*/
