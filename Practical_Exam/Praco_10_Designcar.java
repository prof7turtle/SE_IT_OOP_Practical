import java.util.*;
import java.io.*;
interface car {
    void allocateAccessories();

    void buildEngine();

    void paintCar();

    void finalMakeup();

    default void manufactureCar() {
        allocateAccessories();
        buildEngine();
        paintCar();
        finalMakeup();
    }
}

class Hatchback implements car {
    @Override
    public void allocateAccessories() {
        System.out.println("Allocating basic accessories for Hatchback.");
    }

    @Override
    public void buildEngine() {
        System.out.println("Building a compact engine for Hatchback.");
    }

    @Override
    public void paintCar() {
        System.out.println("Painting Hatchback with standard colors.");
    }

    @Override
    public void finalMakeup() {
        System.out.println("Applying final touches to Hatchback.");
    }
}

class Sedan implements car {
    @Override
    public void allocateAccessories() {
        System.out.println("Allocating luxury accessories for Sedan.");
    }

    @Override
    public void buildEngine() {
        System.out.println("Building a powerful engine for Sedan.");
    }

    @Override
    public void paintCar() {
        System.out.println("Painting Sedan with premium colors.");
    }

    @Override
    public void finalMakeup() {
        System.out.println("Applying final touches to Sedan.");
    }
}

class SUV implements car {
    @Override
    public void allocateAccessories() {
        System.out.println("Allocating rugged accessories for SUV.");
    }

    @Override
    public void buildEngine() {
        System.out.println("Building a high-performance engine for SUV.");
    }

    @Override
    public void paintCar() {
        System.out.println("Painting SUV with durable coatings.");
    }

    @Override
    public void finalMakeup() {
        System.out.println("Applying final touches to SUV.");
    }
}

class CarFactory {
    public static car createCar(String carType) {
        if (carType == null) {
            throw new IllegalArgumentException("Car type cannot be null");
        }

        switch (carType.toLowerCase()) {
            case "hatchback":
                return new Hatchback();
            case "sedan":
                return new Sedan();
            case "suv":
                return new SUV();
            default:
                throw new IllegalArgumentException("Invalid car type: " + carType);
        }
    }
}




public class Prac10 {
    public static void main(String[] args) {
        System.out.println("Creating a Hatchback:");
        car hatchback = CarFactory.createCar("Hatchback");
        hatchback.manufactureCar();

        System.out.println("\nCreating a Sedan:");
        car sedan = CarFactory.createCar("Sedan");
        sedan.manufactureCar();

        System.out.println("\nCreating an SUV:");
        car suv = CarFactory.createCar("SUV");
        suv.manufactureCar();
    }
}
