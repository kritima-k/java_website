package interfaces;
interface Drawable 
{
void draw();
}
class CircleDrawable implements Drawable 
{
public void draw() {
System.out.println("Drawing a circle.");
}
}
class RectangleDrawable implements Drawable 
{
public void draw() 
{
System.out.println("Drawing a rectangle.");
}
}

class TriangleDrawable implements Drawable 
{
public void draw() 
{
System.out.println("Drawing a triangle.");
}
}

class DrawableInterface 
{
public static void main(String[] args) 
{
Drawable circle = new CircleDrawable();
Drawable rectangle = new RectangleDrawable();
Drawable triangle = new TriangleDrawable();
circle.draw();
rectangle.draw();
triangle.draw();
}
}