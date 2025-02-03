package Assignment;

/*3. Polymorphism:
Question:
Implement a class hierarchy for Vehicles with a base class Vehicle that contains a method startEngine(). 
Derive two classes: Car and Motorcycle, both overriding the startEngine() method to print different messages 
indicating how their engines are started. Create a method vehicleTestDrive(Vehicle vehicle) that accepts any object 
of type Vehicle and calls its startEngine() method. Demonstrate polymorphism by passing different vehicle objects to this method. */


abstract class Vehicle {
    
    abstract void startEngine();
}


class Car extends Vehicle {
    @Override
    void startEngine() {
        System.out.println("Car engine started with a key ignition.");
    }
}


class Motorcycle extends Vehicle {
    @Override
    void startEngine() {
        System.out.println("Motorcycle engine started with a self-start button.");
    }
}

public class VehicleTest {
    static void vehicleTestDrive(Vehicle vehicle) {
        vehicle.startEngine();
    }

    public static void main(String[] args) {
        
        Vehicle myCar = new Car();
        Vehicle myMotorcycle = new Motorcycle();
        
        vehicleTestDrive(myCar);         
        vehicleTestDrive(myMotorcycle);  
    }
}
