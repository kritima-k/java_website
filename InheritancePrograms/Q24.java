package inheritance;

// abstract class saying every 2D shape must support draw and resize
abstract class Shape2D {
abstract void draw();
abstract void resize(double factor);
}

class RectangleShape extends Shape2D {
double length, width;

RectangleShape(double length, double width) {
this.length = length;
this.width = width;
}

void draw() {
System.out.println("Drawing rectangle " + length + "x" + width);
}

// resize multiplies both dimensions by the given factor
void resize(double factor) {
length *= factor;
width *= factor;
System.out.println("Resized rectangle to " + length + "x" + width);
}
}

class CircleShape2 extends Shape2D {
double radius;

CircleShape2(double radius) {
this.radius = radius;
}

void draw() {
System.out.println("Drawing circle with radius " + radius);
}

void resize(double factor) {
radius *= factor;
System.out.println("Resized circle to radius " + radius);
}
}

 class Shape2DDrawResize {
public static void main(String[] args) {
RectangleShape rect = new RectangleShape(4, 3);
CircleShape2 circle = new CircleShape2(5);

rect.draw();
rect.resize(2);

circle.draw();
circle.resize(1.5);
}
}