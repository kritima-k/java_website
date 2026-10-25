package inheritance;

// abstract class saying every vehicle must be able to start and stop its engine
abstract class VehicleAbstract {
abstract void startEngine();
abstract void stopEngine();
}

class Car3 extends VehicleAbstract {
void startEngine() {
System.out.println("Car engine started.");
}

void stopEngine() {
System.out.println("Car engine stopped.");
}
}

class Motorcycle2 extends VehicleAbstract {
void startEngine() {
System.out.println("Motorcycle engine started.");
}

void stopEngine() {
System.out.println("Motorcycle engine stopped.");
}
}

 class VehicleEngineAbstract{
public static void main(String[] args) {
Car3 car = new Car3();
Motorcycle2 bike = new Motorcycle2();

car.startEngine();
car.stopEngine();

bike.startEngine();
bike.stopEngine();
}
}