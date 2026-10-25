package oops_programs;

import java.util.ArrayList;

class ReservationSystem
{
ArrayList<String> flights = new ArrayList<>();
ArrayList<String> hotels = new ArrayList<>();
ArrayList<String> reservations = new ArrayList<>();

// This method adds a flight
void addFlight(String flight)
{
flights.add(flight);
}

// This method adds a hotel
void addHotel(String hotel)
{
hotels.add(hotel);
}

// This method searches for a flight
void searchFlight(String flight)
{
if(flights.contains(flight))
{
System.out.println("Flight found: " + flight);
}
else
{
System.out.println("Flight not found.");
}
}

// This method searches for a hotel
void searchHotel(String hotel)
{
if(hotels.contains(hotel))
{
System.out.println("Hotel found: " + hotel);
}
else
{
System.out.println("Hotel not found.");
}
}

// This method books a reservation
void bookReservation(String reservation)
{
if(!reservations.contains(reservation))
{
reservations.add(reservation);
System.out.println("Reservation booked: " + reservation);
}
else
{
System.out.println("Reservation already exists.");
}
}

// This method cancels a reservation
void cancelReservation(String reservation)
{
if(reservations.remove(reservation))
{
System.out.println("Reservation cancelled: " + reservation);
}
else
{
System.out.println("Reservation not found.");
}
}

// This method displays all reservations
void displayReservations()
{
System.out.println("Current reservations:");

for(String reservation : reservations)
{
System.out.println(reservation);
}
}
}

// This is where the program starts running
class ReservationProgram
{
public static void main(String[] args)
{
// Create a reservation system
ReservationSystem system = new ReservationSystem();

// Add flights
system.addFlight("Chandigarh to Delhi");
system.addFlight("Delhi to Mumbai");

// Add hotels
system.addHotel("Hotel Paradise");
system.addHotel("Grand Hotel");

// Search for a flight and a hotel
system.searchFlight("Chandigarh to Delhi");
system.searchHotel("Hotel Paradise");

// Book reservations
system.bookReservation("Chandigarh to Delhi");
system.bookReservation("Hotel Paradise");

// Display reservations
system.displayReservations();

// Cancel a reservation
system.cancelReservation("Hotel Paradise");

// Display the updated reservations
system.displayReservations();
}
}

