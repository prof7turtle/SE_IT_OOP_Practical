

import java.util.Scanner;

interface Vehicle {
    void inputDetails();
    void changeGear();
    void speedUp();
    void applyBrakes();
    void displayStatus();
}

class Bicycle implements Vehicle {
    private int speed = 0;
    private int gear = 1;
    private final int maxGear = 5;
    private final int maxSpeed = 25;
    private String name;
    private Scanner sc = new Scanner(System.in);

    public void inputDetails() {
        System.out.print("Enter the name of your Bicycle: ");
        name = sc.nextLine();
        System.out.println("Bicycle: " + name + " is ready to ride!");
    }

    public void changeGear() {
        if (gear < maxGear) {
            gear++;
            System.out.println("Gear changed. Current Gear: " + gear);
        } else {
            System.out.println("You are already in the highest gear!");
        }
    }

    public void speedUp() {
        if (speed + 5 <= maxSpeed) {
            speed += 5;
            System.out.println("Speed increased. Current Speed: " + speed + " km/h");
        } else {
            System.out.println("You've reached the maximum speed of " + maxSpeed + " km/h!");
        }
    }

    public void applyBrakes() {
        speed = 0;
        gear = 1;
        System.out.println("Brakes applied. Speed is now: " + speed + " km/h, Gear reset to: " + gear);
    }

    public void displayStatus() {
        System.out.println("Bicycle " + name + " | Current Speed: " + speed + " km/h | Current Gear: " + gear);
    }
}

class Bike implements Vehicle {
    private int speed = 0;
    private int gear = 1;
    private final int maxGear = 6;
    private final int maxSpeed = 120;
    private String name;
    private Scanner sc = new Scanner(System.in);

    public void inputDetails() {
        System.out.print("Enter the name of your Bike: ");
        name = sc.nextLine();
        System.out.println("Bike: " + name + " is ready to ride!");
    }

    public void changeGear() {
        if (gear < maxGear) {
            gear++;
            System.out.println("Gear changed. Current Gear: " + gear);
        } else {
            System.out.println("You are already in the highest gear!");
        }
    }

    public void speedUp() {
        if (speed + 20 <= maxSpeed) {
            speed += 20;
            System.out.println("Speed increased. Current Speed: " + speed + " km/h");
        } else {
            System.out.println("You've reached the maximum speed of " + maxSpeed + " km/h!");
        }
    }

    public void applyBrakes() {
        speed = 0;
        gear = 1;
        System.out.println("Brakes applied. Speed is now: " + speed + " km/h, Gear reset to: " + gear);
    }

    public void displayStatus() {
        System.out.println("Bike " + name + " | Current Speed: " + speed + " km/h | Current Gear: " + gear);
    }
}

class Car implements Vehicle {
    private int speed = 0;
    private int gear = 1;
    private final int maxGear = 8;
    private final int maxSpeed = 240;
    private String name;
    private Scanner sc = new Scanner(System.in);

    public void inputDetails() {
        System.out.print("Enter the name of your Car: ");
        name = sc.nextLine();
        System.out.println("Car: " + name + " is ready to drive!");
    }

    public void changeGear() {
        if (gear < maxGear) {
            gear++;
            System.out.println("Gear changed. Current Gear: " + gear);
        } else {
            System.out.println("You are already in the highest gear!");
        }
    }

    public void speedUp() {
        if (speed + 40 <= maxSpeed) {
            speed += 40;
            System.out.println("Speed increased. Current Speed: " + speed + " km/h");
        } else {
            System.out.println("You've reached the maximum speed of " + maxSpeed + " km/h!");
        }
    }

    public void applyBrakes() {
        speed = 0;
        gear = 1;
        System.out.println("Brakes applied. Speed is now: " + speed + " km/h, Gear reset to: " + gear);
    }

    public void displayStatus() {
        System.out.println("Car " + name + " | Current Speed: " + speed + " km/h | Current Gear: " + gear);
    }
}

public class Prac5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vehicle myVehicle = null;

        System.out.println("Welcome to the Vehicle Simulation Program!");
        System.out.println("Select your vehicle:");
        System.out.println("1. Bicycle");
        System.out.println("2. Bike");
        System.out.println("3. Car");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();
        sc.nextLine();

        switch (choice) {
            case 1:
                myVehicle = new Bicycle();
                break;
            case 2:
                myVehicle = new Bike();
                break;
            case 3:
                myVehicle = new Car();
                break;
            default:
                System.out.println("Invalid choice! Exiting the program.");
                return;
        }

        myVehicle.inputDetails();
        boolean exit = false;

        while (!exit) {
            System.out.println("\nChoose an operation:");
            System.out.println("1. Change Gear");
            System.out.println("2. Speed Up");
            System.out.println("3. Apply Brakes");
            System.out.println("4. Display Status");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int operation = sc.nextInt();

            switch (operation) {
                case 1:
                    myVehicle.changeGear();
                    break;
                case 2:
                    myVehicle.speedUp();
                    break;
                case 3:
                    myVehicle.applyBrakes();
                    break;
                case 4:
                    myVehicle.displayStatus();
                    break;
                case 5:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid operation! Please try again.");
            }
        }

        System.out.println("Thank you for using the Harshil Vehicle Simulation Program!");
    }
}

