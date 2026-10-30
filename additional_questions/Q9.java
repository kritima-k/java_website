package additional_questions;
public class Q9
{
public static void main(String[] st)
{
// Demonstrating break statement
System.out.println("Using break:");
for (int i = 1; i <= 10; i++)
{
if (i == 4)
{
break;
}
System.out.println(i);
}
// Demonstrating continue statement
System.out.println("Using continue:");
for (int i = 1; i <= 10; i++)
{
if (i == 2)
{
continue;
}
System.out.println(i);
}
}
}
