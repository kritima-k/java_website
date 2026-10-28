package StringPrograms;
enum Days 
{
monday , tuesday , wednesday , thursday , friday , saturday    
}

class EnumToString 
{
public static void main(String[] args)
{

// creating an enum variable
Days day = Days.monday;

// converting enum to string
String str = day.toString();

// displaying the result
System.out.println("Enum value: " + day);
System.out.println("String value: " + str);
}
}
