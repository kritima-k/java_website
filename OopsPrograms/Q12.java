package oops_programs;

// Program to check flight status and delay

class Airplane
{
// Attributes of Airplane
String flightNumber;
String destination;
String departureTime;

// Constructor to initialize flight details
Airplane(String flightNumber, String destination, String departureTime)
{
this.flightNumber = flightNumber;
this.destination = destination;
this.departureTime = departureTime;
}

// Method to check flight status
void checkFlightStatus()
{
System.out.println("Flight Number: " + flightNumber);
System.out.println("Destination: " + destination);
System.out.println("Departure Time: " + departureTime);
}

// Method to check if the flight is delayed
void checkDelay(int delayMinutes)
{
if(delayMinutes > 0)
{
System.out.println("Flight is delayed by " + delayMinutes + " minutes");
}
else
{
System.out.println("Flight is on time");
}
}

// Main method
public static void main(String[] st)
{
// Create an Airplane object
Airplane A = new Airplane("AI101", "Delhi", "10:30 AM");

// Display flight details
A.checkFlightStatus();

// Check the flight delay
A.checkDelay(30);
}
}