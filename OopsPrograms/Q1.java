package oops_programs;
// Program to create Person objects and display their name and age
class Person 
{
    //attributes of person 
 String name ;
int age ;

// constructor to initialise name and age 
Person(String name , int age )
{
this.name=name;
this.age=age;    
}
//main method 
public static void main(String[] st)
{
   
// Create two Person objects using the constructor 
Person P1= new Person("vanshika",18);
Person P2= new Person("sanjana",18);

// Display details of both persons
System.out.println("Person 1 Name: " + P1.name);
System.out.println("Person 1 Age: " + P1.age);

System.out.println("Person 2 Name: " + P2.name);
System.out.println("Person 2 Age: " +P2.age);


}
}