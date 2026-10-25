package inheritance;

// Vehicle2 is the parent class holding info common to all vehicles
class Vehicle2 {
String make;
String model;
int year;
String fuelType;

Vehicle2(String make, String model, int year, String fuelType) {
this.make = make;
this.model = model;
this.year = year;
this.fuelType = fuelType;
}

// default fuel efficiency, each vehicle type will give its own real number
double calculateFuelEfficiency() {
return 0;
}

// distance = how efficient the vehicle is times how much fuel was used
double calculateDistanceTraveled(double fuelUsed) {
return calculateFuelEfficiency() * fuelUsed;
}

int getMaxSpeed() {
return 0;
}
}

// Truck extends Vehicle2 with its own fuel efficiency and speed
class Truck extends Vehicle2 {
Truck(String make, String model, int year, String fuelType) {
super(make, model, year, fuelType); // sets shared details using parent constructor
}


double calculateFuelEfficiency() {
return 8;
}

int getMaxSpeed() {
return 120;
}
}


class Car2 extends Vehicle2 {
Car2(String make, String model, int year, String fuelType) {
super(make, model, year, fuelType);
}

double calculateFuelEfficiency() {
return 18;
}

int getMaxSpeed() {
return 180;
}
}


class Motorcycle extends Vehicle2 {
Motorcycle(String make, String model, int year, String fuelType) {
super(make, model, year, fuelType);
}

double calculateFuelEfficiency() {
return 35;
}

int getMaxSpeed() {
return 200;
}
}

 class VehicleHierarchy {
public static void main(String[] args) {
Truck truck = new Truck("Tata", "Ace", 2022, "Diesel");
Car2 car = new Car2("Honda", "City", 2023, "Petrol");
Motorcycle bike = new Motorcycle("Royal Enfield", "Classic", 2021, "Petrol");

System.out.println("Truck max speed: " + truck.getMaxSpeed());
System.out.println("Truck distance for 10 fuel: " + truck.calculateDistanceTraveled(10));

System.out.println("Car max speed: " + car.getMaxSpeed());
System.out.println("Car distance for 10 fuel: " + car.calculateDistanceTraveled(10));

System.out.println("Bike max speed: " + bike.getMaxSpeed());
System.out.println("Bike distance for 10 fuel: " + bike.calculateDistanceTraveled(10));
}
}