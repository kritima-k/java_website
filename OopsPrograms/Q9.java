package oops_programs;

// Program to change traffic light color and check red or green

class TrafficLight
{
// Attributes of TrafficLight
String color;
int duration;

// Constructor to initialize color and duration
TrafficLight(String color, int duration)
{
this.color = color;
this.duration = duration;
}

// Method to change the traffic light color
void changeColor(String color)
{
this.color = color;
}

// Method to check if the light is red
boolean isRed()
{
return color.equalsIgnoreCase("Red");
}

// Method to check if the light is green
boolean isGreen()
{
return color.equalsIgnoreCase("Green");
}

// Main method
public static void main(String[] st)
{
// Create a TrafficLight object
TrafficLight T = new TrafficLight("Red", 30);

// Display the initial color and duration
System.out.println("Color: " + T.color);
System.out.println("Duration: " + T.duration + " seconds");

// Check whether the light is red
System.out.println("Is Red: " + T.isRed());

// Change the color to green
T.changeColor("Green");

// Display the updated color
System.out.println("Updated Color: " + T.color);

// Check whether the light is green
System.out.println("Is Green: " + T.isGreen());
}
}