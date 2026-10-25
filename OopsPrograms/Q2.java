package oops_programs;

// Program to create Dog objects and update their name and breed

class Dog
{
// Attributes of Dog
String name;
String breed;

// Constructor to initialize name and breed
Dog(String name, String breed)
{
this.name = name;
this.breed = breed;
}

// Setter method to update the name
void setName(String name)
{
this.name = name;
}

// Setter method to update the breed
void setBreed(String breed)
{
this.breed = breed;
}

// Main method
public static void main(String[] st)
{
// Create two Dog objects using the constructor
Dog D1 = new Dog("Max", "Labra");
Dog D2 = new Dog("Bruno", "German Shepherd");

// Modify the attributes using setter methods
D1.setName("leo");
D1.setBreed("Golden Retriever");

D2.setName("mello");
D2.setBreed("pug");

// Display the updated details of both dogs
System.out.println("Dog 1 Name: " + D1.name);
System.out.println("Dog 1 Breed: " + D1.breed);

System.out.println("Dog 2 Name: " + D2.name);
System.out.println("Dog 2 Breed: " + D2.breed);
}
}