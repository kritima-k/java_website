package inheritance;

// abstract class saying every 3D shape must calculate volume and surface area
abstract class Shape3D {
abstract double calculateVolume();
abstract double calculateSurfaceArea();
}

// Sphere fills in the real formulas for a sphere
class Sphere extends Shape3D {
double radius;

Sphere(double radius) {
this.radius = radius;
}

double calculateVolume() {
return (4.0 / 3) * Math.PI * Math.pow(radius, 3);
}

double calculateSurfaceArea() {
return 4 * Math.PI * radius * radius;
}
}

// Cube fills in the real formulas for a cube
class Cube extends Shape3D {
double side;

Cube(double side) {
this.side = side;
}

double calculateVolume() {
return Math.pow(side, 3);
}

double calculateSurfaceArea() {
return 6 * side * side;
}
}

 class Shape3DVolumeSurface{
public static void main(String[] args) {
Sphere sphere = new Sphere(3);
Cube cube = new Cube(4);

System.out.println("Sphere volume: " + sphere.calculateVolume());
System.out.println("Sphere surface area: " + sphere.calculateSurfaceArea());

System.out.println("Cube volume: " + cube.calculateVolume());
System.out.println("Cube surface area: " + cube.calculateSurfaceArea());
}
}