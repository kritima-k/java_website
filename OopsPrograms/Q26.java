package oops_programs;

// This class stores person details
class Person
{
private String name;
private int age;
private String country;

// Setter methods to assign values
public void setName(String n)
{
name = n;
}

public void setAge(int a)
{
age = a;
}

public void setCountry(String c)
{
country = c;
}

// Getter methods to return values
public String getName()
{
return name;
}

public int getAge()
{
return age;
}

public String getCountry()
{
return country;
}
}


class PersonDetails
{
public static void main(String[] args)
{
Person p = new Person();

// Set person details
p.setName("Kritima");
p.setAge(21);
p.setCountry("India");

// Display person details
System.out.println("Name: " + p.getName());
System.out.println("Age: " + p.getAge());
System.out.println("Country: " + p.getCountry());
}
}

