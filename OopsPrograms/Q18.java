
package oops_programs;

import java.util.ArrayList;

class Restaurant
{
String name;
ArrayList<String> menuItems = new ArrayList<>();
ArrayList<Double> prices = new ArrayList<>();
ArrayList<Double> ratings = new ArrayList<>();

// Constructor to give restaurant a name
Restaurant(String name)
{
this.name = name;
}

// This method adds an item and its price to the menu
void addItem(String itemName, double price)
{
menuItems.add(itemName);
prices.add(price);

System.out.println(itemName + " added to the menu.");
}

// This method removes an item from the menu
void removeItem(String itemName)
{
int index = menuItems.indexOf(itemName);

if(index != -1)
{
menuItems.remove(index);
prices.remove(index);

System.out.println(itemName + " removed from the menu.");
}
else
{
System.out.println(itemName + " not found on the menu.");
}
}

// This method adds a customer rating
void addRating(double rating)
{
if(rating >= 1 && rating <= 5)
{
ratings.add(rating);
System.out.println("Rating " + rating + " added.");
}
else
{
System.out.println("Rating must be between 1 and 5.");
}
}

// This method calculates the average rating
double calculateAverageRating()
{
if(ratings.size() == 0)
{
return 0;
}

double sum = 0;

for(double rating : ratings)
{
sum = sum + rating;
}

return sum / ratings.size();
}

// This method displays the menu and prices
void showMenu()
{
System.out.println("Menu for " + name + ":");

for(int i = 0; i < menuItems.size(); i++)
{
System.out.println(menuItems.get(i) + " - " + prices.get(i));
}
}
}

// This is where the program starts running
class RestaurantProgram
{
public static void main(String[] args)
{
// Create a restaurant object
Restaurant restaurant = new Restaurant("Spice Garden");

// Add items to the menu
restaurant.addItem("Pizza", 250.0);
restaurant.addItem("Burger", 120.0);
restaurant.addItem("Pasta", 180.0);

// Remove an item from the menu
restaurant.removeItem("Burger");

// Add customer ratings
restaurant.addRating(4.5);
restaurant.addRating(3.5);
restaurant.addRating(5.0);

// Display the menu
restaurant.showMenu();

// Display the average rating
System.out.println("Average Rating: " + restaurant.calculateAverageRating());
}
}