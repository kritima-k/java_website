package inheritance;

// Vehicle is the parent class with a basic drive method
class Vehicle {
void drive() {
System.out.println("The vehicle is moving.");
}
}

// Car extends Vehicle, so it inherits drive() but changes what it does
class Car extends Vehicle {
// overriding the drive method to do something different
void drive() {
System.out.println("Repairing a car");
}
}

class VehicleDriveOverride {
public static void main(String[] args) {
Car myCar = new Car(); // creating a Car object
myCar.drive(); // runs Car version of drive, not Vehicle
}
}