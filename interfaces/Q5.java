package interfaces;

// Resizable says any class implementing it must support resizing width and height
interface Resizable {
void resizeWidth(int width);
void resizeHeight(int height);
}

// Rectangle implements Resizable and stores its own width and height
class RectangleResizable implements Resizable {
int width, height;

RectangleResizable(int width, int height) {
this.width = width;
this.height = height;
}

public void resizeWidth(int width) {
this.width = width;
System.out.println("New width: " + this.width);
}

public void resizeHeight(int height) {
this.height = height;
System.out.println("New height: " + this.height);
}
}
class ResizableInterface
{
public static void main(String[] args)
{
RectangleResizable rect = new RectangleResizable(10, 5);
rect.resizeWidth(20);
rect.resizeHeight(15);
}
}