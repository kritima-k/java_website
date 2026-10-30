package mypack;
// inheriting  Date class using qualified name
class MyDate extends java.util.Date
{
public static void main(String[] args)
{
// creating object of MyDate class
MyDate d = new MyDate();
// displaying current date
System.out.println("Current date = " + d);
}
}