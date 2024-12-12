import java.util.Scanner;

class Employee {
    private String empName;
    private String empId;
    private String address;
    private String mailId;
    private long mobileNo;
    private double basicPay;
    private double grossSalary;
    private double netSalary;

    public Employee(String empName, String empId, String address, String mailId, long mobileNo, double basicPay) {
        this.empName = empName;
        this.empId = empId;
        this.address = address;
        this.mailId = mailId;
        this.mobileNo = mobileNo;
        this.basicPay = basicPay;
        calculateSalary();
    }

    private void calculateSalary() {
        double da = basicPay * 0.97;
        double hra = basicPay * 0.10;
        double pf = basicPay * 0.12;
        double staffClub = basicPay * 0.001;

        grossSalary = basicPay + da + hra;
        netSalary = grossSalary - pf - staffClub;
    }

    public void displayPaySlip() {
        System.out.println("---------------------------------------------------");
        System.out.println("Employee Name: " + empName);
        System.out.println("Employee ID: " + empId);
        System.out.println("Address: " + address);
        System.out.println("Mail ID: " + mailId);
        System.out.println("Mobile Number: " + mobileNo);
        System.out.println("Basic Pay: " + basicPay);
        System.out.println("Gross Salary: " + grossSalary);
        System.out.println("Net Salary: " + netSalary);
        System.out.println("---------------------------------------------------");
    }
}

class Programmer extends Employee {
    public Programmer(String empName, String empId, String address, String mailId, long mobileNo, double basicPay) {
        super(empName, empId, address, mailId, mobileNo, basicPay);
    }
}

class TeamLead extends Employee {
    public TeamLead(String empName, String empId, String address, String mailId, long mobileNo, double basicPay) {
        super(empName, empId, address, mailId, mobileNo, basicPay);
    }
}

class AssistantProjectManager extends Employee {
    public AssistantProjectManager(String empName, String empId, String address, String mailId, long mobileNo, double basicPay) {
        super(empName, empId, address, mailId, mobileNo, basicPay);
    }
}

class ProjectManager extends Employee {
    public ProjectManager(String empName, String empId, String address, String mailId, long mobileNo, double basicPay) {
        super(empName, empId, address, mailId, mobileNo, basicPay);
    }
}

public class prac3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Employee Type");
        System.out.println("1. Programmer");
        System.out.println("2. TeamLead");
        System.out.println("3. Assistant Project Manager");
        System.out.println("4. Project Manager");
        int choice = sc.nextInt();

        sc.nextLine(); // Consume the newline character
        System.out.println("Enter Employee Name:");
        String empName = sc.nextLine();

        System.out.println("Enter Employee ID:");
        String empId = sc.nextLine();

        System.out.println("Enter Employee Address:");
        String address = sc.nextLine();

        System.out.println("Enter Employee Mail ID:");
        String mailId = sc.nextLine();

        System.out.println("Enter Employee Mobile Number:");
        long mobileNo = sc.nextLong();

        System.out.println("Enter Basic Pay:");
        double basicPay = sc.nextDouble();

        Employee employee = null;

        switch (choice) {
            case 1:
                employee = new Programmer(empName, empId, address, mailId, mobileNo, basicPay);
                break;
            case 2:
                employee = new TeamLead(empName, empId, address, mailId, mobileNo, basicPay);
                break;
            case 3:
                employee = new AssistantProjectManager(empName, empId, address, mailId, mobileNo, basicPay);
                break;
            case 4:
                employee = new ProjectManager(empName, empId, address, mailId, mobileNo, basicPay);
                break;
            default:
                System.out.println("Invalid Input. Please restart the program and try again.");
                sc.close();
                return;
        }

        employee.displayPaySlip();

        sc.close(); 
    }
}
