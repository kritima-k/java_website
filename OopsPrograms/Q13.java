
package oops_programs;

import java.util.ArrayList;

class Inventory
{
ArrayList<String> products = new ArrayList<>();
ArrayList<Integer> quantity = new ArrayList<>();

// Add a product and its quantity to the inventory
void addProduct(String name, int amount)
{
products.add(name);
quantity.add(amount);

System.out.println(name + " added to inventory.");
}

// Remove a product from the inventory
void removeProduct(String name)
{
for(int i = 0; i < products.size(); i++)
{
if(products.get(i).equals(name))
{
products.remove(i);
quantity.remove(i);

System.out.println(name + " removed from inventory.");
return;
}
}

System.out.println(name + " not found.");
}

// Show all the products currently in the inventory
void displayProducts()
{
System.out.println("Products in inventory:");

for(int i = 0; i < products.size(); i++)
{
System.out.println(products.get(i) + " - " + quantity.get(i));
}
}

// Check which products have less than 5 items
void checkLowInventory()
{
System.out.println("Low inventory products:");

for(int i = 0; i < products.size(); i++)
{
if(quantity.get(i) < 5)
{
System.out.println(products.get(i) + " - " + quantity.get(i));
}
}
}
}

class InventoryProgram
{
public static void main(String[] args)
{
// Create an inventory so we can add and remove products
Inventory inventory = new Inventory();

// Add some products to the inventory
inventory.addProduct("Laptop", 10);
inventory.addProduct("Mouse", 3);
inventory.addProduct("Keyboard", 2);

// Show all products
inventory.displayProducts();

// Check which products have low stock
inventory.checkLowInventory();

// Remove the Mouse from the inventory
inventory.removeProduct("Mouse");

// Display the inventory again
inventory.displayProducts();
}
}

