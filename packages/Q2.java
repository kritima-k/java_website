package mypack;
// Program to print current date using qualified name
class CurrentDate
{
public static void main(String[] args)
{
// creating object using qualified name
java.util.Date d = new java.util.Date();
// displaying current date
System.out.println("Current date = " + d);
}
}