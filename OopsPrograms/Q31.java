package oops_programs;

// This class stores car details
class Car
{
private String company_name;
private String model_name;
private int year;
private double mileage;

// Setter methods
public void setCompanyName(String company)
{
company_name = company;
}

public void setModelName(String model)
{
model_name = model;
}

public void setYear(int y)
{
year = y;
}

// Getter methods
public String getCompanyName()
{
return company_name;
}

public String getModelName()
{
return model_name;
}

public int getYear()
{
return year;
}

// Getter only for mileage
public double getMileage()
{
return mileage;
}

// Constructor assigns mileage
Car(double m)
{
mileage = m;
}
}

class CarProgram
{
public static void main(String[] args)
{
Car c = new Car(18.5);

c.setCompanyName("Toyota");
c.setModelName("Innova");
c.setYear(2025);

System.out.println("Company: " + c.getCompanyName());
System.out.println("Model: " + c.getModelName());
System.out.println("Year: " + c.getYear());
System.out.println("Mileage: " + c.getMileage() + " km/l");
}
}

